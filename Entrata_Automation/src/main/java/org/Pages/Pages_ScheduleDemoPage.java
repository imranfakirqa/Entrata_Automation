package org.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pages_ScheduleDemoPage 
{
	WebDriver driver;
	
	//WebElements of Schedule a Demo Page
		@FindBy (id="FirstName") private WebElement userInputFieldForFirstNameOfScheduleDemoPage;
		@FindBy (id="LastName") private WebElement userInputFieldForLastNameOfScheduleDemoPage;
		@FindBy (id="Email") private WebElement userInputFieldForEmailOfScheduleDemoPage;
		@FindBy (id = "Company") private WebElement userInputFieldForCompanyNameOfScheduleDemoPage;
		@FindBy (id="Phone") private WebElement userInputFieldForPhoneNumberOfScheduleDemoPage;
		@FindBy (xpath = "//select[contains(@id, \"Unit_Count\")]") private WebElement dropdownForUnitCountOfScheduleDemoPage;
		@FindBy (id="Title") private WebElement userInputFieldForJobTitleOfScheduleDemoPage;
		@FindBy (id="demoRequest") private WebElement dropdownForDemoRequestOfScheduleDemoPage;
		@FindBy (xpath = "//button[@class=\"mktoButton\"]") private WebElement scheduleDemoCTAOfScheduleDemoPage;
		
		
		// Constructor to initialize the driver and elements
	    public Pages_ScheduleDemoPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    public void enterValidDataInUserInputFieldForFirstNameOfScheduleDemoPage(String firstName)
	    {
	    	userInputFieldForFirstNameOfScheduleDemoPage.sendKeys(firstName);
	    }
	    
	    
	    public void enterValidDataInUserInputFieldForLastNameOfScheduleDemoPage(String lastName)
	    {
	    	userInputFieldForLastNameOfScheduleDemoPage.sendKeys(lastName);
	    }
	    
	    
	   public void enterValidDataInUserInputFieldForEmailOfScheduleDemoPage(String email)
	   {
		   userInputFieldForEmailOfScheduleDemoPage.sendKeys(email);
	   }
	   
	   
	   public void enterValidDataInUserInputFieldForCompanyNameOfScheduleDemoPage(String cName)
	   {
		   userInputFieldForCompanyNameOfScheduleDemoPage.sendKeys(cName);
	   }
	   
	   public void enterValidDataInUserInputFieldForPhoneNumberOfScheduleDemoPage(String mobNo)
	   {
		   userInputFieldForPhoneNumberOfScheduleDemoPage.sendKeys(mobNo);
	   }
	   
	   public void selectValidOptionInDropdownForUnitCountOfScheduleDemoPage()
	   {
		   Select sl = new Select(dropdownForUnitCountOfScheduleDemoPage);
		   sl.selectByVisibleText("101 - 200");
	   }
	   
	   public void enterValidDataInUserInputFieldForJobTitleOfScheduleDemoPage(String jobTitle)
	   {
		   userInputFieldForJobTitleOfScheduleDemoPage.sendKeys(jobTitle);
	   }
	   
	   public void selectValidOptionInDropdownForDemoRequestOfScheduleDemoPage()
	   {
		   Select sl = new Select(dropdownForDemoRequestOfScheduleDemoPage);
		   sl.selectByVisibleText("a Resident");
	   }
	   
	   public void clickOnWatchDemoCTAOfScheduleDemoPage()
	   {
		   scheduleDemoCTAOfScheduleDemoPage.click();
	   }
	   
	   public boolean scheduleDemoCTAIsDisplayed()
	   {
		   return scheduleDemoCTAOfScheduleDemoPage.isDisplayed();
	   }
}
