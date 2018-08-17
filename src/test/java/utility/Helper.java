package utility;




import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	
	public static String captureScreenshot(WebDriver driver,String screenshotName)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		String destination = "C:\\Users\\rdawooda\\Documents\\Workspace\\com.learnautomation.hybrid\\Screenshots\\"+screenshotName+System.currentTimeMillis()+".png";
		try {
			FileUtils.copyFile(scr, new File(destination));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Issue with taking screenshot "+e.getMessage());
		}
		return destination;
		
	}
}
