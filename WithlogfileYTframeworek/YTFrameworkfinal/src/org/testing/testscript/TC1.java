package org.testing.testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.utilites.Logs;
import org.testing.utilites.Screenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 extends Base{
	

 
	@Test
	public void test() throws InterruptedException, IOException {
	
		
		
		//Login l=new Login(driver, pr);
		//l.signin("himanshu.a007@gmail.com", "*******");
		
		Logs.takeLogs("TC1", "Login successfully");
	//	Thread.sleep(5000);
	//	WebElement obj6=driver.findElement(By.xpath(pr.getProperty("Trending")));
		//obj6.click();
		
		//Screenshot.takescreenshot(driver, "C:\\Users\\PC\\eclipse-workspace\\YTFrameworkfinal\\Screenshots folder\\first.png");
		Logs.takeLogs("TC1", "Testcase 1 Pass successfully");
		System.out.println("Test");
	}
	
	
	
}
