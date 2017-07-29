/**
 * 
 */
package com.gpom.gproject.googlepages;

import java.util.List;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.gpom.gproject.cons.GConstants;

/**
 * @author U44118
 *
 */
public class Translatepage {
	
	@FindBy (id=GConstants.TEXT_BOX)
	public WebElement TEXT_BOX ;
	

	@FindBy (id=GConstants.TARGET_BOX)
	public WebElement TARGET_BOX ;
	
	@FindBy (xpath=GConstants.POLISH_OPTION)
	public List<WebElement> POLISH_OPTION ;
	
	@FindBy (xpath=GConstants.TARGET_SELECT_BOX)
	public WebElement TARGET_SELECT_BOX ;
	
	 WebDriver driver;
	
	 public Translatepage(WebDriver driver)
	 {
		 
		 this.driver = driver;
		 
		
	 }

	public void  enterText() throws InterruptedException
	 {
		 	
		TEXT_BOX.sendKeys("luxoft test task");
		TARGET_BOX.click();
			
		
		
		// selecting the Polish option from the target option box		
		List<WebElement> list= POLISH_OPTION;
		
		for (int i=0;i<list.size();i++)
		{
			String text=list.get(i).getText().trim();
			if(text.equals("Polish"))
			{
				list.get(i).click();
				break;
			}
		}		
		
		Thread.sleep(2000);	
		String str= TARGET_SELECT_BOX.getText().trim();
	
		Assert.assertEquals(str, "zadaniem testu");
		
	 }}		

