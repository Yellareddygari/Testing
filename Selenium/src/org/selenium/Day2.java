package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Asha Reddy\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/login");
		
		WebElement address = driver.findElement(By.id("userName"));
		
		address.sendKeys("9790987902");
		
	}
	

}
