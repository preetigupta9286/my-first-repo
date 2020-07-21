package tm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tm.qa.testbase.BaseClass;

public class UserProfilePage extends BaseClass {
	
@FindBy(name="first_name")
WebElement FN;

@FindBy(name="last_name")
WebElement LN ;

@FindBy(name="email")
WebElement EMAIL;

@FindBy(name="website")
WebElement WEB;

@FindBy(name="phone")
WebElement PHONE;

@FindBy(name="address")
WebElement Address;

@FindBy(name="province_licensed")
WebElement Province_LICENSED;
	
@FindBy(name="driving_licence_no")
WebElement DRIVING_LICENSCE;
	
@FindBy(name="sin_no")
WebElement SIN;
	
@FindBy(name="fax")
WebElement Fax;

@FindBy(name="copy_of_id_proof")
WebElement COPY_PROOF;

@FindBy(xpath="//a[contains(text(),'Save')]")
WebElement SAVEBTN;

//@FindBy(xpath="")
//WebElement ;
	
public UserProfilePage() {
PageFactory.initElements(driver, this);
}
	
public boolean data() {
FN.isDisplayed();
LN.isDisplayed();
EMAIL.isDisplayed();
PHONE.sendKeys("9234567890");
Address.sendKeys("dino court");
Province_LICENSED.sendKeys("1234567890");
DRIVING_LICENSCE.sendKeys("12345678");
SIN.sendKeys("123456789");
Fax.sendKeys("1234567");
return true;
}
public void upload() {
COPY_PROOF.sendKeys("C:\\Users\\surbh\\Desktop\\SRS Gmail.docx");
}
//COPY_PROOF.findElement(By.xpath("C:\\Users\\surbh\\Desktop\\SRS Gmail.docx"));

public void savebtn() {
	SAVEBTN.click();	
}
	}


