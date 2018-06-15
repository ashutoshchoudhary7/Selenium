package com.test1.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AJAXWebApplications {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
				
		driver.get("http://www.expedia.co.uk/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("tab-flight-tab")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("flight-origin")).sendKeys("New");
		
//		WebDriverWait wdWait = new WebDriverWait(driver,30);
//		wdWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@class='results']/li/a")));
		
		List<WebElement> locations = driver.findElements(By.xpath("//ul[@class='results']/li/a"));
		
		System.out.println("Total locations: " + locations.size());
		
		for(WebElement location:locations)
		{
			System.out.println(location.getText());
		}
		
		Thread.sleep(2000);
		System.out.println("Location 4: " + 
				driver.findElement(By.xpath("//ul[@class='results']/li[4]/a")).getText());
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='results']/li/a[contains(.,'Sydney')]")).click();

	}

}
