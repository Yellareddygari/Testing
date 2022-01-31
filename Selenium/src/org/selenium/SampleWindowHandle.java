package org.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWindowHandle {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Asha Reddy\\eclipse-workspace\\Selenium\\DriverNew\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/python-training.html");
		
		driver.manage().window().maximize();
		
		WebElement down = driver.findElement(By.xpath("//h3[text()='Data Analysis with Python Course Content']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		
		driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']")).click();
		
		driver.findElement(By.xpath("Windows Handling")).click();
		
		String parId = driver.getWindowHandle();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String eachwindow : allWindows) {
			
			if (!parId.equals(eachwindow)) {
				
				driver.switchTo().window(eachwindow);
				
				WebElement para = driver.findElement(By.xpath("//pre[contains(text())='iphones X']"));
				
				System.out.println(para);
	
			}
			
		}
		
		
		
	}
}
		