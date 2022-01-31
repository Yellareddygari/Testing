package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleDay7 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asha Reddy\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','Motorola')", searchBox);
		
		WebElement btnSearch = driver.findElement(By.id("nav-search-submit-button"));
		
		js.executeScript("arguments[0].click()", btnSearch);
		
		TakesScreenshot tk=(TakesScreenshot) driver;
		
		File s = tk.getScreenshotAs(OutputType.FILE);
		
		File d=new File("C:\\Users\\Asha Reddy\\eclipse-workspace\\Selenium\\Screenshot\\Amazon.png");
		
		FileUtils.copyFile(s, d);
		
		
	}

}
