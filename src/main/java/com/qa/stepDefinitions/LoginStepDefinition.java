package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.MainPage;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition extends TestBase{
	
	MainPage mainPage;
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("^User is on Wikipedia Main Page$")
	public void user_is_on_Wikipedia_Main_Page(){
	    // Write code here that turns the phrase above into concrete actions
		TestBase.initialization();
		mainPage = new MainPage();
		String title = mainPage.getMainPageTitle();
	    Assert.assertEquals("Wikipedia, the free encyclopedia", title);
	}
	
	@Then("^user clicks on login link$")
	public void user_clicks_on_login_link() {
		System.out.println(driver.getTitle());
		loginPage = mainPage.clickOnLoginLink();
	}

	@Then("^title of login page is Wikipedia$")
	public void title_of_login_page_is_Wikipedia(){
	    // Write code here that turns the phrase above into concrete actions
		String title = loginPage.getLoginPageTitle();
		Assert.assertEquals("Log in - Wikipedia", title);
	    
	}

	@Then("^user enters username and password and click on login button$")
	public void user_enters_username_and_password_and_click_login(){
	    // Write code here that turns the phrase above into concrete actions
		homePage = loginPage.login(prop.getProperty("username"), 
				prop.getProperty("password"));  
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page(){
	    // Write code here that turns the phrase above into concrete actions
		String title = homePage.getHomePageTitle();
		Assert.assertEquals("Wikipedia, the free encyclopedia", title);
	}
	
	
	@Then("^close the browser$")
	public void close_the_browser(){
	    // Write code here that turns the phrase above into concrete actions
		TestBase.closeBrowser();
	}
	
}
