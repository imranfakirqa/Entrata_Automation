package org.TestCases;

import org.Pages.Pages_ScheduleDemoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TCs_ScheduleDemoPage 
{
	WebDriver driver;
	ChromeOptions co;
	Pages_ScheduleDemoPage sPage;
	
	@BeforeMethod
	public void setup()
	{
		co = new ChromeOptions();
		co.addArguments("start-maximized");
		
		driver = new ChromeDriver( co );
		driver.get("https://go.entrata.com/schedule-demo.html");
		
		sPage = new Pages_ScheduleDemoPage(driver);
	}
	
	
	@Test
	public void verifyTheScheduleDemoFunctionalityWithValidCredentials()
	{
		Assert.assertTrue(sPage.scheduleDemoCTAIsDisplayed(), "Watch Demo CTA Not displayed: Assertion fail");
		sPage.enterValidDataInUserInputFieldForFirstNameOfScheduleDemoPage("Imran");
		sPage.enterValidDataInUserInputFieldForLastNameOfScheduleDemoPage("Fakir");
		sPage.enterValidDataInUserInputFieldForEmailOfScheduleDemoPage("imranfakir0412@gmail.com");
		sPage.enterValidDataInUserInputFieldForCompanyNameOfScheduleDemoPage("Entrata");
		sPage.enterValidDataInUserInputFieldForPhoneNumberOfScheduleDemoPage("9325477195");
		sPage.selectValidOptionInDropdownForUnitCountOfScheduleDemoPage();
		sPage.enterValidDataInUserInputFieldForJobTitleOfScheduleDemoPage("Automation Test Engineer");
		sPage.selectValidOptionInDropdownForDemoRequestOfScheduleDemoPage();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		driver = null;
		co = null;
		sPage=null;
	}
}
