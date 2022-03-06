package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.ArticlePage;
import com.qa.pages.CurrentEventsPage;
import com.qa.pages.MainPage;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CurrentEventsStepDefintion extends TestBase{
	
	MainPage mainPage;
	CurrentEventsPage currentEventsPage;
	ArticlePage articlePage;
	
	@Given("^User is in Wikipedia Main Page$")
	public void user_is_in_Wikipedia_Main_Page(){
	    // Write code here that turns the phrase above into concrete actions
		TestBase.initialization();
		mainPage = new MainPage();
		String title = mainPage.getMainPageTitle();
	    Assert.assertEquals("Wikipedia, the free encyclopedia", title);
	}
	
	@Then("^user clicks on current events link$")
	public void user_clicks_current_events_link() {
		currentEventsPage = mainPage.clickOnCurrentEventsLink();
	}
	
	@Then("^user is able to view the current events page$")
	public void user_able_to_view_current_events_page() {
		String topicsInNews = currentEventsPage.getTopicsInTheNewsText();
		Assert.assertEquals("Topics in the news", topicsInNews);
	}
	
	@Then("^validate current events page title$")
	public void validate_current_events_page_title() {
		String title = currentEventsPage.getCurrentEventsPageTitle();
		Assert.assertEquals("Portal:Current events - Wikipedia", title);
		driver.close();
	}
	
}
