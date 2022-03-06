package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class AboutWikipediaPage extends TestBase{
	
	@FindBy(xpath="//*[@id='firstHeading']")
	WebElement heading;
	
	@FindBy(xpath="//*[@id='About_Wikipedia']")
	WebElement aboutWikipedia;
	
	@FindBy(xpath="//*[@id='Uses']")
	WebElement usesWikipedia;
	
	@FindBy(xpath="//*[@id='Contributing']")
	WebElement contributingWikipedia;
	
	public AboutWikipediaPage() {
		PageFactory.initElements(driver, this);
	}

	// Get the text from the About Wikipedia header
	public String getAboutWikipediaHeader() {
		return heading.getText();
	}
		
	public String getAboutWikiepdiaPageTitle() {
		return driver.getTitle();
	}
	
	public String sectionsPageTitle(String string) {
		
		if (string.equals("About Wikipedia")){
			return aboutWikipedia.getText();
		}
		else if (string.equals("Uses")){
			return usesWikipedia.getText();
		}
		else if (string.equals("Contributing")){
			return contributingWikipedia.getText();
		}
		return "";
	}
}
