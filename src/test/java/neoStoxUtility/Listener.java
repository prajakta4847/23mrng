package neoStoxUtility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
	
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Tc is completed successfully",true);
	}	
		
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Tc is fail",true);
		
	}
	
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("Tc is skipped please check",true);
		
	}
	
	}
	


