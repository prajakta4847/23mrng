package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class NeostoxPasswordPage 
{
	@FindBy(xpath = "//input[@id='txt_accesspin']")private WebElement passwordField;
	@FindBy(xpath = "//a[text()='Submit']")private WebElement submitButton;
	
	public NeostoxPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendpassword(WebDriver driver, String pass) 
	{
		UtilityNew.wait(driver, 3000);
		passwordField.sendKeys(pass);
		Reporter.log("sending password", true);
	}
	
	public void clickOnSubmitButton(WebDriver driver) 
	{
		UtilityNew.wait(driver, 1000);
		submitButton.click();
		Reporter.log("clicking on submit button",true);
	}

}
