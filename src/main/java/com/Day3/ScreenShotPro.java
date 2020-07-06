package com.Day3;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotPro {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Narendra\\Practice\\SeleniumPractice\\Browsers\\chromedriver.exe");
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		TakesScreenshot sc=((TakesScreenshot)driver);
		File source=sc.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("D:\\Narendra\\Practice\\SeleniumPractice\\Screenshots\\fb.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	

}
