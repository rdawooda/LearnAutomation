package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	
	Properties pro ;
	public ConfigDataProvider()
	{
		File scr = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(scr);
			pro = new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is "+e.getMessage());
		}
		
	}
	
	public String getApplicationUrl()
	{
		String url = pro.getProperty("url");
		return url;
	}
	
	public String getChromePath()
	{
		String chromePath = pro.getProperty("chromePath");
		return chromePath;
	}

	public String getFireFoxPath()
	{
		String firefoxPath = pro.getProperty("fireFoxPath");
		return firefoxPath;
	}
}
