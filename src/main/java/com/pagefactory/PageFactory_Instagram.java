package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Instagram;

public class PageFactory_Instagram extends Base_Instagram { 
	
public PageFactory_Instagram() {
	
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//*[@name='username']")
private WebElement username;

public WebElement getUsername() {
	return username;
}

@FindBy(xpath="//*[@name='password']")
private WebElement password;

public WebElement getPassword() {
	return password;
}
@FindBy(xpath="//*[@class='sqdOP  L3NKy   y3zKF     ']")
private WebElement login;

public WebElement getLogin() {
	return login;
}

}
