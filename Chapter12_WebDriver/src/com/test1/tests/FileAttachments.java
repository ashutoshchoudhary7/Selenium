package com.test1.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileAttachments {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver  driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://mail.yahoo.com/");
		
		driver.findElement(By.id("login-username")).sendKeys("bakshu.absoft");
	    driver.findElement(By.id("login-passwd")).sendKeys("Absoft123");
	    Thread.sleep(2000);
	    driver.findElement(By.id("login-signin")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@title='Compose']")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.id("attachment-button-input"))
	    .sendKeys("G:\\SeleniumTraining\\Selenium\\Temp\\Test1HomePage.png");
	    
	    driver.findElement(By.id("attachment-button-input"))
	    .sendKeys("G:\\SeleniumTraining\\Selenium\\Temp\\Test1HomePage.png");
	    
	    //driver.manage().window().
	
	}

}
