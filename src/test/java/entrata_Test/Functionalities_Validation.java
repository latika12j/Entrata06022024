package entrata_Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base_Package_Use.Entrata_Base;
import entrata_Utility.Utillity_Use;


public class Functionalities_Validation extends Entrata_Base
{
		
	@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
		launchEntrata();
		
		Reporter.log("Opening browser", true);
		driver.get("https://www.entrata.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test
	public void Functionalities() throws InterruptedException, IOException
	{
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[contains(text(),'Products')]")).click();
	driver.get("https://www.entrata.com/products/property-management");
	Reporter.log("Launching Property Management Page ", true);
	Thread.sleep(1000);
	
	driver.get("https://www.entrata.com/products/marketing-and-leasing");
	Reporter.log("Launching Marketing and Leasing Page ", true);
	Thread.sleep(1000);
	
	driver.navigate().to("https://www.entrata.com/products/accounting");
	Reporter.log("Launching Accounting Page ", true);
	Thread.sleep(1000);
	
	driver.get("https://www.entrata.com/products/utilities");
	Reporter.log("Launching Utilities Page ", true);
	Thread.sleep(1000);
	
	driver.get("https://go.entrata.com/dem0.html");
	driver.findElement(By.id("FirstName")).sendKeys("Latika");
	driver.findElement(By.id("LastName")).sendKeys("Pathak");
	driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("Company")).sendKeys("Marketing Solutions");
	driver.findElement(By.id("Phone")).sendKeys("8956741236");
	driver.findElement(By.id("Unit_Count__c")).sendKeys("5000");
	driver.findElement(By.id("Title")).sendKeys("Quality Analyst");
	Thread.sleep(1000);
	
	driver.get("https://www.entrata.com/");
	String expectedTitle="Property Management Software | Entrata";
	String originalTitle=driver.getTitle();
	Assert.assertEquals(originalTitle, expectedTitle,"Text results are not matching, TC is failed");
	Reporter.log("TC is passed ", true);
	
	Utillity_Use.takeScreenShot(driver, "EN_TC555");
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
	Thread.sleep(2000);
	closeEntrata();
	}
	
}
