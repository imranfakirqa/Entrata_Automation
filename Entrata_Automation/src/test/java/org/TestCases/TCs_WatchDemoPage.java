package org.TestCases;

import org.Pages.Pages_WatchDemoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TCs_WatchDemoPage 
{
	WebDriver driver;
	ChromeOptions co;
	Pages_WatchDemoPage wPage;
	
	@BeforeMethod
	public void setup()
	{
		co = new ChromeOptions();
		co.addArguments("start-maximized");
		
		driver = new ChromeDriver( co );
		driver.get("https://go.entrata.com/watch-demo.html");
		
		wPage = new Pages_WatchDemoPage(driver);
	}
	
	
	@Test
	public void verifyTheScheduleDemoFunctionalityWithValidCredentials()
	{
		Assert.assertTrue(wPage.watchDemoCTAIsDisplayed(), "Watch Demo CTA Not displayed: Assertion fail");
		wPage.enterValidDataInUserInputFieldForFirstNameOfWatchDemoPage("Imran");
		wPage.enterValidDataInUserInputFieldForLastNameOfWatchDemoPage("Fakir");
		wPage.enterValidDataInUserInputFieldForEmailOfWatchDemoPage("imranfakir0412@gmail.com");
		wPage.enterValidDataInUserInputFieldForCompanyNameOfWatchDemoPage("Entrata");
		wPage.enterValidDataInUserInputFieldForPhoneNumberOfWatchDemoPage("9325477195");
		wPage.selectValidOptionInDropdownForUnitCountOfWatchDemoPage();
		wPage.enterValidDataInUserInputFieldForJobTitleOfWatchDemoPage("Automation Test Engineer");
		wPage.selectValidOptionInDropdownForDemoRequestOfWatchDemoPage();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		driver = null;
		co = null;
		wPage=null;
	}
}
