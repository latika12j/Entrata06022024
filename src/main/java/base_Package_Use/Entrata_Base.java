package base_Package_Use;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;


public class Entrata_Base 
{
	protected static WebDriver driver;

	//Open Browser

	public void launchEntrata() throws InterruptedException
		{
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			Reporter.log("Launching browser ", true);
			driver.get("https://www.entrata.com/");
			Thread.sleep(1000);	
		}

	//Close Browser
	public void closeEntrata() throws InterruptedException
		{
			Reporter.log("Closing browser ", true);
			Thread.sleep(1000);
			driver.close();
		}
	}

