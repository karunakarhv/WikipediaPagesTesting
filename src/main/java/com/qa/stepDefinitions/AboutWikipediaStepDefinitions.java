package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.AboutWikipediaPage;
import com.qa.pages.MainPage;
import com.qa.util.TestBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutWikipediaStepDefinitions extends TestBase{
	
	MainPage mainPage;
	AboutWikipediaPage aboutWikipediaPage;
	
	
	@Given("User is in Wikipedia main page")
	public void user_is_in_current_events_page() {
		 // Write code here that turns the phrase above into concrete actions
		TestBase.initialization();
		mainPage = new MainPage();
	}
	
	@When("user clicks on About Wikipedia link")
	public void user_clicks_on_about_wikipedia() {
		aboutWikipediaPage = mainPage.clickOnAboutWikipediaLink();
		String title = aboutWikipediaPage.getAboutWikiepdiaPageTitle();
		Assert.assertEquals("Wikipedia:About - Wikipedia", title);
	}
	
	@Then("user is able to view About us page")
	public void user_is_able_to_view_about_page() {
		String title = aboutWikipediaPage.getAboutWikipediaHeader();
		Assert.assertEquals("Wikipedia:About", title);
	}
	
	@And("page contains the below {string}")
	public void user_has_section(String string) {
		String titleSection = aboutWikipediaPage.sectionsPageTitle(string);
		Assert.assertEquals(string, titleSection);
		driver.close();
	}

}
