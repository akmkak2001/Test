
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.webshop.utils.ConfigReader;

public class DriverScript {
	
	public static WebDriver driver;
	static Properties prop;
	protected String environment = "QA";
	//static ConfigReader config;
	
	/*
	 * this Constructor loads and reads config.properties file.
	 */
	
	public DriverScript()
	{
		try
		{
			if(environment.equals("QA"))
			{
			
				File file = new File("./src/test/resources/config/config.properties");
				FileInputStream fis = new FileInputStream(file);
				prop = new Properties();
				prop.load(fis);
			}
			else
			{
				File file = new File("./src/test/resources/config/configDEV.properties");
				FileInputStream fis = new FileInputStream(file);
				prop = new Properties();
				prop.load(fis);
			}
			
		}
		/*try
		{
			ConfigReader config = new ConfigReader();
		}*/
		catch(Exception e)
		{
			System.out.println("Unable to load config.properties file");
			e.getMessage();
			e.printStackTrace();
		}
	}
	
	
	/*
	 * this method is used to invoke browser based on properties file.
	 */
	public void initApplication()
	{
		String browser = prop.getProperty("browser");
		//String browser = config.getProperty("browser");
		
		if(browser.trim().equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.trim().equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();
		}
		else if(browser.trim().equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Unsupported Browser.Please check the config file.");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Calling App url Method. 
		getAppurl();
		
	}
	
	/*
	 * this method is used to get app url from config.properties file.
	 */
	public static void getAppurl()
	{
		String URL = prop.getProperty("url");
		
		driver.get(URL);
	}
	
	/*
	 * this method is used to quit the driver.
	 */
	public static void quitDriver()
	{
		driver.quit();
	}
	

}
