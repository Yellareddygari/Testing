package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12 {

	
	    public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asha Reddy\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
	
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','durga123@gmail.com')", email);
		
		WebElement pwd = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		
		js.executeScript("arguments[0].setAttribute('value','Durga@123')", pwd);
		
		WebElement btnLogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		
		js.executeScript("arguments[0].click()", btnLogin);
		
		Object ob1 = js.executeScript("return arguments[0].getAttribute('value')", email);
		
		System.out.println("User Email ID is: "+ob1);
		
		Object ob2 = js.executeScript("return arguments[0].getAttribute('value')", pwd);
		
		System.out.println("Password is: "+ob2);
				

	}

}
