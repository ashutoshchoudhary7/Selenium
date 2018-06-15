package com.test1.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenWebElements {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver  driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.co.uk");
	    
		// //a[@id='gb36'] - represents YouTube link  //a[@id='gb36']
		System.out.println("Link Displayed: " + 
								driver.findElement(By.xpath("//a[@id='gb36']")).isDisplayed());
		 
		System.out.println("Link Enabled: " + 
								driver.findElement(By.xpath("//a[@id='gb36']")).isEnabled());
		 
		System.out.println("Link URL: " +
								driver.findElement(By.xpath("//a[@id='gb36']")).getAttribute("href"));
		
		driver.findElement(By.xpath("//a[@title='Apps']")).click();
		Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//a[@id='gb36']")).click();

	}

}
