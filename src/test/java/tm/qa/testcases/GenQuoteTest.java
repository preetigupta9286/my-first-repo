package tm.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import tm.qa.pages.GenQuote;
import tm.qa.pages.HomePage;
import tm.qa.pages.SignInPage;
import tm.qa.testbase.BaseClass;
import tm.qa.utlis.Utils;

public class GenQuoteTest extends BaseClass {
	
	HomePage home;
	SignInPage sign ;
	GenQuote genq ;
	Utils util;
    String sheetname3="GenQuoteWithInvalidData".trim();
    
    public GenQuoteTest() {
    super();
   	}
    
    @BeforeTest
    public void setup() {
    initialization();
    home=new HomePage();
    sign=new SignInPage();
    genq=new GenQuote();
    util=new Utils();
    home.validMyTMbtn();
    sign.validEmail("un");
    sign.validpassword("psw");
    sign.clickOnLogin();}
    
    @DataProvider
    public Object[][] getdata(){
    	Object data3[][] = Utils.getTestData(sheetname3);
	return data3;
    }
    @Test(dataProvider="getdata") 
    public void validdatap(String N_O_INSURED)   {
    genq.n_of_insureddata(N_O_INSURED);	
    
    }
    
}
