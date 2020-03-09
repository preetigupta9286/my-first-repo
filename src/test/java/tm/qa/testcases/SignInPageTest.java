package tm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tm.qa.pages.HomePage;
import tm.qa.pages.SignInPage;
import tm.qa.testbase.BaseClass;
import tm.qa.utlis.Utils;

public class SignInPageTest extends BaseClass{

	public static Utils util;
	public static HomePage home;
	public static SignInPage signin;
	
	public SignInPageTest()
	{
		super();
	}
	
	@BeforeMethod()
	public void setup()
	{
		initialization();
		signin=new SignInPage();
		home=new HomePage();
		signin=home.validMyTMbtn();
	}
	
	
	@Test(priority=1)
	public void VarifyUserName()
	{
		signin.validEmail(prop.getProperty("username"));
	
	}
	
	
	@Test(priority=2)
	public void VarifyPassword()
	{
		signin.validpassword(prop.getProperty("password"));
	}
	
	@Test(priority=3)
	public void ValidLoginBtn()
	{
		signin.clickOnLogin();
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
