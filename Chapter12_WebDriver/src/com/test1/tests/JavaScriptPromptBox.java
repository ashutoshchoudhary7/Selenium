package com.test1.tests;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JavaScriptPromptBox{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://test1.absofttrainings.com/javascript-alert-confirm-prompt-boxes/");
		
		
		driver.findElement(By.id("prompt")).click();
		
		Alert alert= driver.switchTo().alert();	
		
		Thread.sleep(3000);
		System.out.println("Alert text: " + alert.getText());
		
		alert.sendKeys("Bakshu");
		Thread.sleep(3000);
		
		alert.accept();
		
		driver.switchTo().defaultContent();
		
	}

}
