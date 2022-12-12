package org.stepdef;

import org.baseclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.webdriverManager;

public class FBStepDef extends BaseClass {

@Given("User should be in facebook login page")
public void user_should_be_in_facebook_login_page() {
	browserLaunch("https://facebook.com/");
   }

@When("User should enter username and password")
public void user_should_enter_username_and_password() {
    findUserName("email").sendKeys("Poorani");
}

@When("User should click the login button")
public void user_should_click_the_login_button() {
	findPassword("pass").sendKeys("Poorani@123");
}

@Then("User should verify the success message")
public void user_should_verify_the_success_message() {
	login("login").click(); 
}

}
