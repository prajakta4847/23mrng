package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class NeostoxSignLogin 
{
	@FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement mobileNumfield;
	
	@FindBy(xpath = "//a[@id='lnk_signup1']")private WebElement signInButton;
	
	
	public NeostoxSignLogin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendmobNumfield(WebDriver driver,String mobNum) 
	{
		UtilityNew.wait(driver, 1000);
		mobileNumfield.sendKeys(mobNum);
		Reporter.log("sending Mobile Number",true);
	}
	
	public void clickOnSignInButton(WebDriver driver) 
	{
		UtilityNew.wait(driver, 1000);
		signInButton.click();
		Reporter.log("clicking on sign in button",true);
	}

}
