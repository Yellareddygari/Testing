package org.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Firefox {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asha Reddy\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("http://greenstech.in/selenium-course-content.html");
		 String s1=driver.getTitle();
		 System.out.println("Title:"+s1);
		 String s2=driver.getCurrentUrl();
		 System.out.println("Current URL:"+s2);
		 
		
		
	}

}
