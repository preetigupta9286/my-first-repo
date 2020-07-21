package tm.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import tm.qa.pages.GenerateQuote;
import tm.qa.pages.HomePage;
import tm.qa.pages.SignInPage;
import tm.qa.testbase.BaseClass;
import tm.qa.utlis.Utils;

public  class GenreateQuoteTest extends BaseClass {
    HomePage home;
    SignInPage sign;
    GenerateQuote genquote;
    Utils util; 
    String sheetname4 = "GenQuoteWithInvalidData".trim();
    
    public GenreateQuoteTest() {
    super();	
    }

    @BeforeTest
    public void setup() {
    initialization();
    home=new HomePage();
    sign=new SignInPage();
    genquote=new GenerateQuote();
    util=new Utils();
    home.validMyTMbtn();
    sign.validEmail("un");
    sign.validpassword("psw");
    sign.clickOnLogin();
    }
	@DataProvider
	public Object[][] gettestdata(){
	Object data2[][] = Utils.getTestData(sheetname4);
	return data2;
	}
    

    @Test(priority=1,dataProvider="gettestdata")
//     public void dataforgenquote(String CLIENT_COUNTRY,String PROVINCE,String N_O_INSURED,String GENDER,String 
//                               DOB,String BEN_N,String RELATION,String BEN_DOB,String DEPARTURE_DATE,String VISATYPE,String DEDUCTABLE,
//              			     String POLICYLIMIT,String PLANTYPE)  {
//    public void validdata(String N_O_INSURED ) {
    public void validdata(String FDOC,String LDOC,String CLIENT_COUNTRY,String PROVINCE,String N_O_INSURED,String GENDER,String 
    DOB,String BEN_N,String RELATION,String BEN_DOB,String DEPARTURE_DATE,String VISATYPE,String DEDUCTABLE,
    String POLICYLIMIT,String PLANTYPE){
    	
    	
    genquote.validFLDOC(FDOC, LDOC, CLIENT_COUNTRY, PROVINCE, N_O_INSURED, GENDER, DOB, BEN_N, RELATION, BEN_DOB, DEPARTURE_DATE, VISATYPE, DEDUCTABLE, POLICYLIMIT, PLANTYPE);	
    

   }}
