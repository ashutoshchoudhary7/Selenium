package com.test1.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
				
		driver.get("http://test1.absofttrainings.com/ajax-and-dynamic-html-behaviour/");
		
		// Clear wait time and set 5 seconds wait
		driver.findElement(By.id("wait-time")).clear();
		driver.findElement(By.id("wait-time")).sendKeys("5");
		
		// Click "Create a New Button after Wait" button
		driver.findElement(By.id("new-button")).click();
		
		WebDriverWait wdWait = new WebDriverWait(driver, 30);
		
		wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("wait5")));
		
		// Test fails here if wait is not set for Selenium
		System.out.println("New button displayed after 5 secs: " +
				driver.findElement(By.id("wait5")).isDisplayed());
		
//		wdWait.until(ExpectedConditions.alertIsPresent());
//		driver.switchTo().alert();
//		

	}

}
