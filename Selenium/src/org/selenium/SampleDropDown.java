package org.selenium;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Asha Reddy\\eclipse-workspace\\Selenium\\DriverNew\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");

		driver.manage().window().maximize();
		
		WebElement fruitsDd = driver.findElement(By.xpath("//select[@id='fruits']"));
		
		Select s = new Select(fruitsDd);
		
		List<WebElement> allOption = s.getOptions();
		
		for (int i = 0; i < allOption.size(); i++) {
			
			if (i==1 || i==3) {
				
				WebElement element = allOption.get(i);
				System.out.println("\nEven Fruits is Drop Down\n"+element.getAttribute("value"));
				
			}	
			
		}
	}
}

	
		
		
	
	
