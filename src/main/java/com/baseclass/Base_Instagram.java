package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Base_Instagram {

	public static WebDriver driver;
	public void setUp() {
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("kaikobad76@yahoo.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@class='sqdOP  L3NKy   y3zKF     ']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
	}
}
//	@BeforeMethod
//	@Parameters("browser")
//	public void setUp(String browser) {
//
//		if(browser.equalsIgnoreCase("chrome")) {
//		System.setProperty("webdriver.chrome.driver", "./Driver/ChromeDriver.exe");
//		driver=new ChromeDriver();
//		}
//		 else if(browser.equalsIgnoreCase("firefox")) {
//		System.setProperty("webdriver.gecko.driver", "./Driver/GeckoDriver.exe");
//		driver=new FirefoxDriver();
//		}
////		else if(browser.equalsIgnoreCase("msedge")) {
////		System.setProperty("webdriver.msedge.driver", "./Driver/EdgeDriver.exe");
////		driver= new EdgeDriver();	 
////		 }
//		else {	System.out.println("The browser does not exist");
//			}
//	   }
//	@Test
//	public void OpenApplication() {
//		driver.get("https://www.instagram.com/");
//
//
//	    driver.quit();
//	}
//	
//	
//}

//driver.get("https://www.instagram.com/");
//driver.findElement(By.xpath("//*[@name='username']")).sendKeys("kaikobad76@yahoo.com");
//driver.findElement(By.xpath("//*[@name='password']")).sendKeys("12345678");
//driver.findElement(By.xpath("//*[@class='sqdOP  L3NKy   y3zKF     ']")).click();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   