package com.test1.tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingScreenshots {

	public static void main(String[] args) throws IOException {

		WebDriver  driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://test1.absofttrainings.com/");
		
		// Capture the screenshot of the browser as a file
		File imgFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// Save the browser screenshot file to a new file with the specified location
		FileUtils.copyFile(imgFile, new File("G:\\SeleniumTraining\\Selenium\\Temp\\Test1HomePage.png"));

	}

}
