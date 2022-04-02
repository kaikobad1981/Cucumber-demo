package com.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Base_Instagram;

public class MyUtility_Insta extends Base_Instagram {
	
	public static WebElement getExplicitWait(WebElement ele, long time) {
		WebDriverWait wait=new WebDriverWait(driver,time);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(ele));
		return element;
		
//			public static WebElement getExplicitWait(WebElement ele,long time){
//			WebDriverWait wait= new WebDriverWait(driver,time);
//			WebElement element=wait.until(ExpectedConditions.elementToBeClickable(ele));
//			return element;
		//getExplicitWait
	}
	
	

}
