package tm.qa.testcases;

import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tm.qa.pages.GenerateQuote;
import tm.qa.pages.HomePage;
import tm.qa.pages.SignInPage;
import tm.qa.testbase.BaseClass;
import tm.qa.utlis.Utils;

public class GenreateQuoteTest extends BaseClass {
	
	Utils util=new Utils();
	SignInPage sign;
	HomePage home;
	GenerateQuote genquote;;
	Properties prop;
	
	public 	GenreateQuoteTest() {
	super();
	}
		
	@BeforeMethod()
	public void setup() {
	initialization();

	//util = new Utils();
	sign=new SignInPage();
	home=new HomePage();

	genquote =new GenerateQuote();
	prop=new Properties();

	home.validMyTMbtn();
	driver.findElement(By.name("email")).sendKeys("roicianstesting1@gmail.com");
//	sign.validpassword(prop.getProperty("password"));
	driver.findElement(By.name("password")).sendKeys("trewq12345");
	sign.clickOnLogin();
	}

	@Test(priority=1)
	public void validateFDOC() {
	genquote.validFLDOC();
	
	 
//   select.deselectByVisibleText(prop.getProperty("country"));
   //select.selectByVisibleText(prop.getProperty("country").trim());
	}

//    @Test(priority=2)
//    public void validateLDOC() {
//    genquote.validLDOC();	
//    }
	
	
	
	
	
	
	
	
	

}
