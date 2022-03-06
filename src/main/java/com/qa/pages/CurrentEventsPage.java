package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class CurrentEventsPage extends TestBase{
	
	@FindBy(xpath="//*[@id='Topics_in_the_news']")
	WebElement topicsNews;
	
	@FindBy(xpath="//a[text()='Multi-sport events']")
	WebElement multiSportEvent;
	
	@FindBy(xpath="//a[text()='Cricket']")
	WebElement football;
	
	@FindBy(xpath="//a[text()='Association football']")
	WebElement cricket;
	
	public CurrentEventsPage() {
		PageFactory.initElements(driver, this);
	}

	public String getCurrentEventsPageTitle() {
		return driver.getTitle();
	}
	
	public String getTopicsInTheNewsText() {
		return topicsNews.getText();
	}
	
	public ArticlePage clickOnLink(String string) {
		if (string.equals("Multi-sport events")) {
//			JavascriptExecutor js = (JavascriptExecutor)driver; 
//			js.executeScript("arguments[0].click();", multiSportEvent);
			multiSportEvent.click();
		}
		else if (string.equals("Cricket")) {
//			JavascriptExecutor js = (JavascriptExecutor)driver; 
//			js.executeScript("arguments[0].click();", cricket);
			cricket.click();
		}
		else if (string.equals("Association football")) {
//			JavascriptExecutor js = (JavascriptExecutor)driver; 
//			js.executeScript("arguments[0].click();", football);
			football.click();
		}
		return new ArticlePage();
	}
}
