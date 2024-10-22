package TestBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class BaseClass {
	
	public WebDriver driver;
	public Properties p;
	public Logger logger;
	
	@Parameters({"os","browser"})
	@BeforeClass(groups = {"Sanity", "Regression", "Master"})
	public void Setup(String os, String br) throws IOException
	{
		logger= LogManager.getLogger(this.getClass());
		
		FileReader file = new FileReader("./src//test//resources//properties");
		p= new Properties();
		p.load(file);
		
		switch(br.toLowerCase())
		{
		case "chrome": driver = new ChromeDriver(); break;
		case "firefox":driver = new FirefoxDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		default : System.out.println("Invalid browser"); return;
		}
		driver.get(p.getProperty("url"));     //("https://5elementslearning.dev/demosite/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
		
		@AfterClass(groups= {"Sanity","Regression", "Master"})
		public void close()
		{
			//driver.close();
		}
	
				public String randomeAlpha (int length) {
					return RandomStringUtils.randomAlphabetic(length);
				}
				public String randomeNumeric (int length) {
					return RandomStringUtils.randomNumeric(length);
				}
				public String randomeAlphnum (int alphalength , int numlength) {
					return RandomStringUtils.randomAlphabetic(alphalength)+"&"+ RandomStringUtils.randomNumeric(numlength);
				}
		}
