package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.ArticlePage;
import com.qa.pages.CurrentEventsPage;
import com.qa.pages.MainPage;
import com.qa.util.TestBase;
import com.qa.util.TestUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArticlesPageStepDefinition extends TestBase{
	
	MainPage mainPage;
	CurrentEventsPage currentEventsPage;
	ArticlePage articlePage;
	
	@Given("User is in Current Events Page")
	public void user_is_in_current_events_page() {
		 // Write code here that turns the phrase above into concrete actions
		TestBase.initialization();
		mainPage = new MainPage();
		currentEventsPage = mainPage.clickOnCurrentEventsLink();
		String title = currentEventsPage.getCurrentEventsPageTitle();
		Assert.assertEquals("Portal:Current events - Wikipedia", title);
	}
	
	@When("User clicks on {string}")
	public void user_clicks_on(String string) {
			articlePage = currentEventsPage.clickOnLink(string);
	}
	
	@Then("title of the page is {string}")
	public void title_of_the_page_is(String string) {
		System.out.println("Article Page - " + driver.getTitle());
		String title = articlePage.getArticlesPageTitle();
		if (string == "Multi-sport events") {
			Assert.assertEquals("Multi-sport event - Wikipedia", title);
		}
		else if (string == "Cricket") {
			Assert.assertEquals("Association football - Wikipedia", title);
		}
		else if (string == "Association football") {
			Assert.assertEquals("Cricket - Wikipedia", title);
		}
	}
	
	@Then("I should be able to view {string}")
	public void i_should_be_able_to_view(String string) {
		String sentence = articlePage.getArticleHeader();
		boolean value = TestUtil.stringMatch(sentence, string);
		Assert.assertEquals(true, value);
		driver.close();
	}

}
