/**
 * 
 */
package com.gpom.gproject.googlepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gpom.gproject.cons.GConstants;

/**
 * @author U44118
 *
 */
public class SearchResultPage {


	@FindBy (xpath=GConstants.Link)
	public WebElement Link ;
	
	 WebDriver driver;
	
	 public SearchResultPage(WebDriver driver)
	 {
		 
		 this.driver = driver;
		 
	 }

	public Translatepage  selectLink()
	 {
		 		
		Link.click();
		Translatepage	translatepage	=new Translatepage(driver);
		PageFactory.initElements(driver, translatepage);
		return translatepage;
		
		
	 }	

}
	
