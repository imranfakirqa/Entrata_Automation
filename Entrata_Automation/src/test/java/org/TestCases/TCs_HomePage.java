package org.TestCases;

import org.Pages.Pages_HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TCs_HomePage 
{
	WebDriver driver;
	ChromeOptions co;
	Pages_HomePage hPage;
	
	@BeforeMethod
	public void setup()
	{
		co = new ChromeOptions();
		co.addArguments("start-maximized");
		
		driver = new ChromeDriver( co );
		driver.get("https://www.entrata.com/");
		
		hPage = new Pages_HomePage(driver);
	}
	
	@Test
	public void verifyHomePageTitle()
	{
		Assert.assertEquals(driver.getTitle() , "Property Management Software | Entrata" , "Title Mismatched");
	}
	
	@Test
	public void verifyHomePageUrl()
	{
		Assert.assertEquals(driver.getCurrentUrl() , "https://www.entrata.com/" , "URL Mismatched");
	}
	
	@Test
	public void verifyThatUserCanNavigateSuccefulyToWatchDemoPage()
	{
		hPage.clickOnWatchDemoCTAOfHomePage();
		Assert.assertEquals(driver.getCurrentUrl(), "https://go.entrata.com/watch-demo.html", "URL Missmatched");
	}
	
	@Test
	public void verifyThatUserCanNavigateSuccefulyToScheduleDemoPage()
	{
		hPage.clickOnScheduleADemoCTAOfHomePage();
		Assert.assertEquals(driver.getCurrentUrl(), "https://go.entrata.com/schedule-demo.html", "URL Missmatched");
	}
	
	@Test
	public void verifyThatTheUserCanNavigateToSignInPage()
	{
		hPage.clickOnSignInCTAOfHomepage();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.entrata.com/sign-in", "URL Missmatched");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		driver = null;
		co = null;
		hPage=null;
	}

}
