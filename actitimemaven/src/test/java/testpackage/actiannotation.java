package testpackage;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pompackage.actilogin;

public class actiannotation extends baseact {
private	WebDriver driver;
	
   
	@BeforeTest
	@Parameters ("browser")
	
	public void beforeTest(String browser) {
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = openChromeBrowser();
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver = openFirefoxBrowser();
		}
	}
	@BeforeMethod
	public void loginacti()
	{

	actilogin loginpage = new actilogin(driver);
		 loginpage.sendUsername();
	   	loginpage.sendpassword();
		loginpage.clicklogin();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void verifyloginpage() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://online.actitime.com/gthite/timetrack/enter.do");

		SoftAssert soft =new SoftAssert();
		String tital =driver.getTitle();
		System.out.println(tital);

		soft.assertEquals(tital, "actiTIME - Enter Time-Track");

		boolean result =url.equals("https://online.actitime.com/gthite/timetrack/enter.do");
		soft.assertTrue(result);
	//	soft.assertFalse(result);


		soft.assertAll();
	
}

}
