package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day8 {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asha Reddy\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@onclick='return fLogon()']")).click();
		
		Alert a = driver.switchTo().alert();
		
		String s = a.getText();
		
		System.out.println(s);
		
		Thread.sleep(5000);
		
		a.accept();
		
		
		
	
		
	}

}
