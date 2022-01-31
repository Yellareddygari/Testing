package org.testing;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class Day1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", 
				"C:\\Users\\Asha Reddy\\eclipse-workspace\\Selenium\\drivers\\IEDriverServer.exe");
	
	WebDriver driver=new InternetExplorerDriver();
	
	driver.get("http://gmail.com/");
				
	}

}
