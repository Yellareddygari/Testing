package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Asha Reddy\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	
		driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']")).sendKeys("9797843576");
		
		driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
				
		
	}

}
