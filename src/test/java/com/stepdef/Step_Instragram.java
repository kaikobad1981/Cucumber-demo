package com.stepdef;


import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Instagram;
import com.pagefactory.PageFactory_Instagram;
import com.utility.MyUtility_Insta;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Instragram extends Base_Instagram {
	
	PageFactory_Instagram obj;
	@Given("User enter the Url {string}")
	public void user_enter_the_url(String Url) {
	   setUp();
	   driver.get("https://www.instagram.com/");
	   obj=PageFactory.initElements(driver, PageFactory_Instagram.class);
	    
	}

	@When("User enter the email id {string}")
	public void user_enter_the_email_id(String string) {
	   obj.getUsername().sendKeys("email id");
	   MyUtility_Insta.getExplicitWait(obj.getUsername(), 10);
	}

	@When("User enter the password {string}")
	public void user_enter_the_password(String string) {
	   obj.getPassword().sendKeys("password");
	   MyUtility_Insta.getExplicitWait(obj.getPassword(), 10);
	}

	@Then("User login the account and varify page title successfully")
	public void user_login_the_account_and_varify_page_title_successfully() {
	   obj.getLogin().click();
	   MyUtility_Insta.getExplicitWait(obj.getLogin(), 10);
	   //MyUtility_Insta.getExplicitWait(obj.getLogin(), 10);
	   
	   //driver.quit();
	}


}
