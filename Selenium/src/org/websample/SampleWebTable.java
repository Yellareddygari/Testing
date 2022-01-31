package org.websample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWebTable {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asha Reddy\\eclipse-workspace\\Selenium\\DriverNew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		//To find the number of Table
		List<WebElement> allTable = driver.findElements(By.tagName("table"));
		System.out.println("No of Table in Webpage "+allTable.size());
		WebElement table = driver.findElement(By.tagName("table"));
		String t = table.getText();
		System.out.println("All Content \n" +t);
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		System.out.println("Size of rows "+rows.size());
		WebElement firstRow = rows.get(0);
		System.out.println("First Row Datas "+firstRow.getText());	
		}
		
	}

