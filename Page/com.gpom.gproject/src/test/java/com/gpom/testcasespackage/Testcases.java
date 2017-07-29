package com.gpom.testcasespackage;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.gpom.gproject.cons.GConstants;
import com.gpom.gproject.googlepages.Launchpage;
import com.gpom.gproject.googlepages.SearchResultPage;
import com.gpom.gproject.googlepages.Translatepage;

public class Testcases {
	
	WebDriver driver;
	
	@Test 
	
	public void googleTest() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", GConstants.CHROME_DRIVER_EXE);
		//System.setProperty("webdriver.chrome.driver", GConstants.FIREFOX_DRIVER_EXE);
				driver = new ChromeDriver();
		 //  driver = new FirefoxDriver();				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    Launchpage	launchpage	=new Launchpage(driver);
    PageFactory.initElements(driver, launchpage);
    SearchResultPage searchResultPage=launchpage.urlselection();
    Translatepage translatepage=  searchResultPage.selectLink();
    translatepage.enterText();
      
    
	}
	
	}
