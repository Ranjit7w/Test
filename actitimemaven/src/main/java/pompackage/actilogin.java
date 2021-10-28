package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actilogin {

	@FindBy (xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy (xpath="//input[@name='pwd']")
	private WebElement password;
	
	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement login;
	
	public actilogin(WebDriver driver1) {
		
		PageFactory.initElements(driver1, this);
	}
	
	public void sendUsername()
	{
		username.sendKeys("thiteganesh01@gmail.com");
		
	}
	public void sendpassword()
	{
		password.sendKeys("zyhyHUmu");
		
	}
	public void clicklogin()
	{
		login.click();
		
	}
/*	public void loginfb() {
		username.sendKeys("thiteganesh01@gmail.com");
		password.sendKeys("zyhyHUmu");
		login.click();
	}*/




}
