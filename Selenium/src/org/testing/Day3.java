package org.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asha Reddy\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			Robot r = new Robot();
			
			driver.get("http://demo.automationtesting.in/Register.html");
		   
			driver.manage().window().maximize();
			
			WebElement firstName = driver.findElement(By.xpath("//input[@type='text'][1]"));
			
			firstName.sendKeys("Durga");
			
			Thread.sleep(5000);
			
			WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
			
			lastName.sendKeys("Shree");
			
			WebElement txtAdd = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
			
			txtAdd.sendKeys("123 Main St");
			
			Thread.sleep(5000);
			
			WebElement btnGen = driver.findElement(By.xpath("//input[@value='FeMale']	"));
			
			btnGen.click();
			
			Thread.sleep(5000);
			
			WebElement btnHob = driver.findElement(By.xpath("//input[@value='Movies']"));
			
			btnHob.click();
			
			Thread.sleep(5000);
			
			WebElement btnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
			
			btnSubmit.click();
			
			
			
	
			
			
	}

}
