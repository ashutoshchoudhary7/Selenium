package com.test1.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
				
		driver.get("http://test1.absofttrainings.com/ajax-and-dynamic-html-behaviour/");
		
		// Clear wait time and set 5 seconds wait
		driver.findElement(By.id("wait-time")).clear();
		driver.findElement(By.id("wait-time")).sendKeys("5");
		
		// Click "Create a New Button after Wait" button
		driver.findElement(By.id("new-button")).click();
		
		// Test fails here if wait is not set for Selenium
		System.out.println("New button displayed after 5 secs: " +
				driver.findElement(By.id("wait5")).isDisplayed());

	}

}
