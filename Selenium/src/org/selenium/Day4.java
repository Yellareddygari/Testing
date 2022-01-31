package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day4 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asha Reddy\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Actions a = new Actions(driver); 
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement sign = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		a.moveToElement(sign).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='nav-a']")).click();
		
		driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("Asha");
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("7657892747");
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("asha@gmail.com");
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("abcd123");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
