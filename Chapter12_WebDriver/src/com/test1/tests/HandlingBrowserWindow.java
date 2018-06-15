package com.test1.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingBrowserWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://test1.absofttrainings.com");
		
		System.out.println("Width and Height when window is maximized:");
		System.out.println(driver.manage().window().getSize().width);
		System.out.println(driver.manage().window().getSize().height);
		
		// Setting dimension like browser in tablet
		Thread.sleep(3000);
		driver.manage().window().setSize(new Dimension(900, 600));
		
		// Setting dimension like browser in mobile
		Thread.sleep(3000);
		driver.manage().window().setSize(new Dimension(300, 500));
		
		// Setting the browser position
		Thread.sleep(3000);
		driver.manage().window().setPosition(new Point(200, 100));
		
	}
}