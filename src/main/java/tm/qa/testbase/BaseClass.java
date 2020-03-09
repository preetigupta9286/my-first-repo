package tm.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;


import tm.qa.utlis.Utils;

public class BaseClass {
	
	public static WebDriver driver;                  //global variables
	public static Properties prop;  
	
	
	public BaseClass()                           //constructor
	{
		 
		try
		{
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\surbh\\eclipse-workspace\\TravelMediCareTe"
					+ "\\src\\main\\java\\tm\\qa\\properties\\Config.properties");  
		prop.load(ip);
		}
		
		catch(FileNotFoundException e)  //two exception can be found.  1)file not found
		{e.printStackTrace();
			
		}
			catch(IOException e)   //2)cant read input/output
		{e.printStackTrace();
			
		}}
	
	
		public static void initialization()
		{
		String browsername=prop.getProperty("browser");
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdrive.chrome.driver","C:\\Program Files (x86)\\Micro Focus\\Unified Functional Testing\\bin\\"
					+ "WebDriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if (browsername.equals("firefox"))
		{
			//System.setProperty("webdriver.gecho.driver","‪‪C:/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Utils.page_load, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utils.implicit_wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		}
		
}
