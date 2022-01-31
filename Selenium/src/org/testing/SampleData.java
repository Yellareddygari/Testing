package org.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleData {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asha Reddy\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Robot r = new Robot();
	
	
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtUser = driver.findElement(By.xpath("//input[@id='username']"));
		
		txtUser.sendKeys("durgasri00");
		
		WebElement txtPwd = driver.findElement(By.xpath("//input[@id='password']"));
	
		
		txtPwd.sendKeys("Durga@123");
		
	WebElement btLogin = driver.findElement(By.xpath("//input[@id='login']"));
	
	btLogin.click();
	
	WebElement loactionDrop = driver.findElement(By.xpath("//select[@id='location']"));
	
	Select s=new Select(loactionDrop);
	
	s.selectByValue("London");
	
	WebElement hotel= driver.findElement(By.xpath("//select[@id='hotels']"));
	
	Select s1=new Select(hotel);
	
	s1.selectByValue("Hotel Sunshine");
	
	WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
	
	Select s2=new Select(room);
	
	s2.selectByValue("Double");
	
	WebElement btSubmit = driver.findElement(By.xpath("//input[@id='Submit']"));
	
	btSubmit.click();
	
	WebElement radioBtn = driver.findElement(By.xpath("//input[@type='radio']"));
	
	radioBtn.click();
	
	WebElement btContinue = driver.findElement(By.xpath("//input[@name='continue']"));
	
	btContinue.click();
	
	WebElement firstName = driver.findElement(By.xpath("//input[@id='first_name']"));
	
	firstName.sendKeys("Durga");
	
	driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Shree");
	
	driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("123 Main St");
	
	driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("5689745625896325");
	
	WebElement creditCard = driver.findElement(By.xpath("//select[@id='cc_type']"));
	
	Select s3= new Select(creditCard);
	
	s3.selectByValue("VISA");
	
	WebElement expire = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
	
	Select s4 = new Select(expire);
	
	s4.selectByValue("1");
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	WebElement expYear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	
	Select s5 = new Select(expYear);
	
	s5.selectByValue("2018");
	
	driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("123");
	
	driver.findElement(By.xpath("//input[@id='book_now']")).click();
	
	Thread.sleep(8000);
	
	WebElement order=driver.findElement(By.xpath("//input[@id='order_no']"));

	String a = order.getAttribute("Value");
	
	System.out.println("order No is"+a);
	
		
	}
}
