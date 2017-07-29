/**
 * 
 */
package com.gpom.gproject.cons;


/**
 * @author U44118
 *
 */
public class GConstants {


	//Path
	public static final String CHROME_DRIVER_EXE="C:\\Page\\com.gpom.gproject\\"+"chromedriver.exe";
	
	//public static final String FIREFOX_DRIVER_EXE="D:\\POM_Luxoft\\GooglePOM\\"+"geckodriver.exe";

	
	//URLs
	public static final String URL="https://www.google.com";
	
	
	//Locator
	public static final String SEARCH_BOX = "lst-ib";
	// For Entering Google Translate locator
	
	public static final String SEARCH_BUTTON = "btnK";
	
	// For selecting translate.google.com
	 public static final String  Link = "//a[text()='Google Translate']";
	 
	 // For Selecting text area box
	 
	 public static final String TEXT_BOX= "source";
	 
	 //For selecting the drop down in Target location
	 public static final String TARGET_BOX = "gt-tl-gms";
	 
	 //For selecting Polish option	 
	 
 public static final String POLISH_OPTION ="//div[@class='goog-menuitem goog-option']";
 // For verifying the text after translated to Polish
 
public static final String TARGET_SELECT_BOX ="//div[@id='gt-text-top']/div[2]/div/div/div/div/div/span[2]/span";


 


}
