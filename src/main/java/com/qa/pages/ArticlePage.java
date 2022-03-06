package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class ArticlePage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"firstHeading\"]")
	WebElement heading;
	
	public ArticlePage() {
		PageFactory.initElements(driver, this);
	}
	
	// Get the text from the article header
	public String getArticleHeader() {
		return heading.getText();
	}
	
	public String getArticlesPageTitle() {
		return driver.getTitle();
	}
}
