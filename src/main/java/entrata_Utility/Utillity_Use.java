package entrata_Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Utillity_Use 
{
	
		public static void takeScreenShot(WebDriver driver,String TCID) throws IOException
		{
		Reporter.log("Taking screenshot", true);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\screenshot\\"+TCID+"_"+".png");
		Reporter.log("Saved screenshot at "+dest, true);
		org.openqa.selenium.io.FileHandler.copy(src, dest);


	}

}