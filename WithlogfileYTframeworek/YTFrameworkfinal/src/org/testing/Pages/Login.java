package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
ChromeDriver driver;
Properties pr;
	
	public Login(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void signin(String email,String password) throws InterruptedException
	{
//		WebElement obj1=driver.findElement(By.xpath(pr.getProperty("signin")));
//		obj1.click();
//		WebElement obj2=driver.findElement(By.id(pr.getProperty("identifier")));
//		obj2.sendKeys(email);
//		WebElement obj3=driver.findElement(By.xpath(pr.getProperty("Next")));
//		obj3.click();
//		Thread.sleep(5000);
//		WebElement obj4=driver.findElement(By.xpath(pr.getProperty("password")));
//		obj4.sendKeys(password);
//		
//		WebElement obj5=driver.findElement(By.xpath(pr.getProperty("Next2")));
//		obj5.click();
	}

}
