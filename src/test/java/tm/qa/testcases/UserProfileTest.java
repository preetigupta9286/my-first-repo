package tm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import tm.qa.pages.HomePage;
import tm.qa.pages.SignInPage;
import tm.qa.pages.UserProfilePage;
import tm.qa.testbase.BaseClass;
import tm.qa.utlis.Utils;

public class UserProfileTest extends BaseClass{
	
HomePage home;
SignInPage sign;
Utils util;
UserProfilePage user;
	
public UserProfileTest() {
super();
}

@BeforeTest
public void setup() {
initialization();
home=new HomePage();
sign=new SignInPage();
user=new UserProfilePage();
util=new Utils();
home.validMyTMbtn();
sign.validEmail("preeti1@gmail.com");
sign.validpassword("123456");
sign.clickOnLogin();
}
	
@Test
public void userprofiledata() {
boolean actual=user.data();
Assert.assertEquals(actual, true);

user.upload();
user.savebtn();
}

}
