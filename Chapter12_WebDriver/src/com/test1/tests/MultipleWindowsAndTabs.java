package com.test1.tests;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsAndTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://test1.absofttrainings.com/shop");
		System.out.println("Intial window count: " + 	driver.getWindowHandles().size());
		
		System.out.println("Main Window Handle: " + driver.getWindowHandle());
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='facebook']")).click();
		System.out.println("Window count after facebook click: " + 	driver.getWindowHandles().size());
		
		Thread.sleep(3000);
		driver.findElement(By.id("sitelock")).click();
		System.out.println("Window count after sitelock click: " + 	driver.getWindowHandles().size());
		
		driver.quit();
		
		Iterator<String> whs = driver.getWindowHandles().iterator();
		
		String mainWin=whs.next();
		String fbWin=whs.next();
		String slWin=whs.next();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(fbWin);
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("u_0_0")).click();
		driver.close();
		
		driver.switchTo().window(slWin);
		Thread.sleep(3000);
		System.out.println("SiteLock Page Domain: " + 
				driver.findElement(By.xpath("//table[@id='inner-table']/tbody/tr[3]/td[2]")).getText());
		driver.close();
		
		driver.switchTo().window(mainWin);
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Apple IPhone")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
