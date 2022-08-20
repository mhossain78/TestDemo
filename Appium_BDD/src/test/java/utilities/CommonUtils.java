package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class CommonUtils {
	
	public static AppiumDriver driver;
	public static DesiredCapabilities caps;
	private static String Appium_Port;
	private static int Implicit_Wait_Time;
	private static int Explicit_Wait_Time;
	private static String Base_Pkg;
	private static String App_Activity;
	private static String App_Path;
	private static String Browser_Name;
	private static String Platform_Name;
	private static String Platform_Version;
	private static String Device_Name;
	private static String Udid;
	private static String App;
	private static String No_Reset;
	private static Properties prop;
	private static FileInputStream fils;
	
	
	
	
	public static void loadAndroidConfigProp(String loadPropertyFile) {
		try {
			fils = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void setAndroidcapabilities() {
		
	}

	public static void loadIOSConfigProp(String loadPropertyFile) {
		
		try {
			fils = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		prop = new Properties();
		try {
			prop.load(fils);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void setIOScapabilities() {
		
	}
	
	
	public static AppiumDriver getAndroidDriver() {
		
		return null;
		
	}
	
public static AppiumDriver getIOSDriver() {
		
		return null;
		
	}

}
