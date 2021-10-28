package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pompackage.actihomepage;
import pompackage.actilogin;



public class actitestclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\RANJIT WAGHMODE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/gthite/login.do");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//https://online.actitime.com/gthite/login.do
		
		actilogin loginpgg = new actilogin(driver);
		loginpgg.sendUsername();
		loginpgg.sendpassword();
		loginpgg.clicklogin();
		
		
		actihomepage homepgg =new actihomepage(driver);
		homepgg.opentask();
		homepgg.openreport();
		homepgg.openuser();
		
	}



}
