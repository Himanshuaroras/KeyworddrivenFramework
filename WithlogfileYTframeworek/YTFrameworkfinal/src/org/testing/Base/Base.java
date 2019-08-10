package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
public ChromeDriver driver;
public	Properties pr;
	@BeforeMethod
	
	public void before() throws IOException
	{		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\YTFrameworkfinal\\exefile\\chromedriver.exe");
		driver=new ChromeDriver();
//		driver.get("https://www.youtube.com");
//		File f=new File("C:\\Users\\PC\\eclipse-workspace\\YTFrameworkfinal\\or.properties");
//		FileInputStream fi=new FileInputStream(f);
//		pr=new Properties();
//		pr.load(fi);
//		System.out.println("Before");
	}
	
//	@AfterMethod
//	public void after()
//	{
//		driver.close();
//		
//		System.out.println("After");
//	}
}
