package tm.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import tm.qa.utlis.Utils;

public class BaseClass {
	
	public static WebDriver driver;                  //global variables
	public static Properties prop;
	public static Utils util;
	
	
	public BaseClass()                           //constructor
	{
		 
		try
		{
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\travelmedicare\\my-first-repo\\src\\main\\java\\tm\\qa\\properties\\Config.properties");  
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
			System.setProperty("webdrive.chrome.driver","C:/Users/surbh/Downloads/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if (browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\surbh\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		try {
			Utils.takeScreenshotAtEndOfTest();
		} catch (IOException e) {
			e.printStackTrace();}
			
//		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Utils.page_load, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utils.implicit_wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		}
		
}
