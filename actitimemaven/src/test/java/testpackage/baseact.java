package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseact {

	
	public static WebDriver openChromeBrowser() {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RANJIT WAGHMODE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://online.actitime.com/gthite/login.do");
	//driver.manage().window().maximize();
	return driver;
}

	public static WebDriver openFirefoxBrowser() {
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\RANJIT WAGHMODE\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://online.actitime.com/gthite/login.do");
	//driver.manage().window().maximize();
	return driver;
}
}
