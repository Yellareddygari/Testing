package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day2 {
	public static void main(String[] args) throws InterruptedException {
		  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asha Reddy\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  Actions a = new Actions(driver);
		  
		  driver.get("http://demo.guru99.com/test/drag_drop.html");
		  
		  driver.manage().window().maximize();
		  
		  WebElement s = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		  
		  WebElement d = driver.findElement(By.xpath("//li[@class ='placeholder'][1]"));
		  	  
		 a.dragAndDrop(s, d).perform();
		 
		 WebElement s1=driver.findElement(By.xpath("//a[text()= ' 5000 ']"));
			 
		 WebElement d1 = driver.findElement(By.xpath("//li[@class='placeholder'][2]"));
			 
		 a.dragAndDrop(s1, d1).perform();
			 
			 
		  
		  
		  
		  
	}

}
