package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShot {

	public static void main(String[] args) throws IOException {
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asha Reddy\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("pushDenied")).click();
		
		WebElement search = driver.findElement(By.xpath("//input[@class='col-xs-20 searchformInput keyword']"));
		
		search.sendKeys("Hp laptops");
		
		WebElement btnClick = driver.findElement(By.xpath("//span[text()='Search']"));
		
		btnClick.click();
		
		TakesScreenshot tk=(TakesScreenshot) driver;
		
		File s = tk.getScreenshotAs(OutputType.FILE);
		
		File d=new File("C:\\Users\\Asha Reddy\\eclipse-workspace\\Selenium\\Screenshot\\snap.png");
		
		FileUtils.copyFile(s, d);
		
		
	}

}
