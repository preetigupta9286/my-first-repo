package tm.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import tm.qa.pages.HomePage;
import tm.qa.pages.SignUpPage;
import tm.qa.pages.UserProfilePage;
import tm.qa.testbase.BaseClass;
import tm.qa.utlis.Utils;

public class SignUpPageTest extends BaseClass {
	public static SignUpPage signup;
	public static Utils util;
	public static HomePage home;
	


   public SignUpPageTest()
   {
   super();	                          //to initialize the properties from base class
   }
  @BeforeMethod()
  public void setup()
  {
	  initialization();
	  home=new HomePage();
	  signup=new SignUpPage();
	  signup= home.ClickOnBecomeAnAgent();
	  
  }
  
   
   
   @Test(priority=1)
     public void validateData()   
     {
   signup.validSignUpData("preeti", "gupta", "pre@gmail.com", "123456", "123456");
    
      }
        	
           

@AfterMethod()
public void teardown()
{
	driver.quit();
}

}








