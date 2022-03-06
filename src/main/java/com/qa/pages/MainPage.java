package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class MainPage extends TestBase{
	
	@FindBy(xpath="//*[@id='pt-login']/a")
	WebElement loginLink;
	
	@FindBy(xpath="//*[@id='n-currentevents']/a")
	WebElement currentEventsLink;
	
	@FindBy(xpath="//*[@id='n-aboutsite']/a")
	WebElement aboutWikipediaLink;
	
	public MainPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getMainPageTitle() {
		return driver.getTitle();
	}
	
	public LoginPage clickOnLoginLink() {
		loginLink.click();
		return new LoginPage();
	}
	
	public CurrentEventsPage clickOnCurrentEventsLink() {
		currentEventsLink.click();
		return new CurrentEventsPage();
	}
	
	public AboutWikipediaPage clickOnAboutWikipediaLink() {
		aboutWikipediaLink.click();
		return new AboutWikipediaPage();
	}


}
