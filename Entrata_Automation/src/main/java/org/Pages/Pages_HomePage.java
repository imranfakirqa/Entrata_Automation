package org.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages_HomePage 
{
	WebDriver driver;

    //WebElement for Home Page
	@FindBy (className = "main-header-logo") private WebElement entrataLogoOfHomePage;
	@FindBy (id = "header-demo-button") private WebElement watchDemoCTAOfHomePage;
	@FindBy (xpath = "(//a[text() = 'Sign In'])[1]") private WebElement signInCTAOfHomepage;
	@FindBy (xpath = "(//a[contains(text() ,\"Schedule Your Demo\")])[1]") private WebElement scheduleADemoCTAOfHomePage;
	

    // Constructor to initialize the driver and elements
    public Pages_HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    
    public boolean logoIsDisplayed()
	{
		return entrataLogoOfHomePage.isDisplayed();
	}

    public void clickOnWatchDemoCTAOfHomePage()
    {
    	watchDemoCTAOfHomePage.click();
    }
    
    public void clickOnSignInCTAOfHomepage()
    {
    	signInCTAOfHomepage.click();
    }
    
    public void clickOnScheduleADemoCTAOfHomePage()
    {
    	Actions act = new Actions(driver);
    	act.scrollToElement(scheduleADemoCTAOfHomePage).click().perform();
    	
    }
}
