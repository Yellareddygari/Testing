package org.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleDay7 {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Asha Reddy\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Robot r = new Robot();
		
		Actions a = new Actions(driver);
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		login.click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile");
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);

		WebElement mobile = driver.findElement(By.xpath("//a[@title='realme C11 (Rich Green, 32 GB)']"));
		
		a.moveToElement(mobile).perform();
		
		a.contextClick(mobile).perform();
		
		for (int i = 0; i < 4; i++) {
			
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
			
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
