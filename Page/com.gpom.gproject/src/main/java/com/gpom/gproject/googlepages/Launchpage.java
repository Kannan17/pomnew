package com.gpom.gproject.googlepages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gpom.gproject.cons.GConstants;


public class Launchpage {

	
	
	@FindBy (id=GConstants.SEARCH_BOX)
	public WebElement SEARCH_BOX;
	
	@FindBy (id=GConstants.SEARCH_BUTTON)
	public WebElement  SEARCH_BUTTON ;
	
	 WebDriver driver;
	
	 public Launchpage(WebDriver driver)
	 {
		 
		 this.driver = driver;
		 
	 }

	public SearchResultPage urlselection() throws InterruptedException
	 {
		 		 
			driver.get(GConstants.URL);

				
			SEARCH_BOX.sendKeys("google translate");
			SEARCH_BOX.sendKeys(Keys.ENTER);
			
			SearchResultPage	searchResultPage	=new SearchResultPage(driver);
			PageFactory.initElements(driver, searchResultPage);
			return searchResultPage;
			  
			
	 }
	
	
}
