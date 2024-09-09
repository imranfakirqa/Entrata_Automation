package org.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pages_WatchDemoPage 
{
	WebDriver driver;

	//WebElements of Watch Demo Page
		@FindBy (id="FirstName") private WebElement userInputFieldForFirstNameOfWatchDemoPage;
		@FindBy (id="LastName") private WebElement userInputFieldForLastNameOfWatchDemoPage;
		@FindBy (id="Email") private WebElement userInputFieldForEmailOfWatchDemoPage;
		@FindBy (id = "Company") private WebElement userInputFieldForCompanyNameOfWatchDemoPage;
		@FindBy (id="Phone") private WebElement userInputFieldForPhoneNumberOfWatchDemoPage;
		@FindBy (xpath = "//select[contains(@id, \"Unit_Count\")]") private WebElement dropdownForUnitCountOfWatchDemoPage;
		@FindBy (id="Title") private WebElement userInputFieldForJobTitleOfWatchDemoPage;
		@FindBy (id="demoRequest") private WebElement dropdownForDemoRequestOfWatchDemoPage;
		@FindBy (xpath = "//button[@class=\"mktoButton\"]") private WebElement watchDemoCTAOfWatchDemoPage;
		
		
		// Constructor to initialize the driver and elements
	    public Pages_WatchDemoPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    public void enterValidDataInUserInputFieldForFirstNameOfWatchDemoPage(String firstName)
	    {
	    	userInputFieldForFirstNameOfWatchDemoPage.sendKeys(firstName);
	    }
	    
	    
	    public void enterValidDataInUserInputFieldForLastNameOfWatchDemoPage(String lastName)
	    {
	    	userInputFieldForLastNameOfWatchDemoPage.sendKeys(lastName);
	    }
	    
	    
	   public void enterValidDataInUserInputFieldForEmailOfWatchDemoPage(String email)
	   {
		   userInputFieldForEmailOfWatchDemoPage.sendKeys(email);
	   }
	   
	   
	   public void enterValidDataInUserInputFieldForCompanyNameOfWatchDemoPage(String cName)
	   {
		   userInputFieldForCompanyNameOfWatchDemoPage.sendKeys(cName);
	   }
	   
	   public void enterValidDataInUserInputFieldForPhoneNumberOfWatchDemoPage(String mobNo)
	   {
		   userInputFieldForPhoneNumberOfWatchDemoPage.sendKeys(mobNo);
	   }
	   
	   public void selectValidOptionInDropdownForUnitCountOfWatchDemoPage()
	   {
		   Select sl = new Select(dropdownForUnitCountOfWatchDemoPage);
		   sl.selectByVisibleText("101 - 200");
	   }
	   
	   public void enterValidDataInUserInputFieldForJobTitleOfWatchDemoPage(String jobTitle)
	   {
		   userInputFieldForJobTitleOfWatchDemoPage.sendKeys(jobTitle);
	   }
	   
	   public void selectValidOptionInDropdownForDemoRequestOfWatchDemoPage()
	   {
		   Select sl = new Select(dropdownForDemoRequestOfWatchDemoPage);
		   sl.selectByVisibleText("a Resident");
	   }
	   
	   public void clickOnWatchDemoCTAOfWatchDemoPage()
	   {
		   watchDemoCTAOfWatchDemoPage.click();
	   }
	   
	   public boolean watchDemoCTAIsDisplayed()
	   {
		   return watchDemoCTAOfWatchDemoPage.isDisplayed();
	   }
}
