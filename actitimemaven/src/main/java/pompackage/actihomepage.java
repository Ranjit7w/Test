package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actihomepage {


	@FindBy (xpath="//div[@id='container_tasks']")
	private WebElement task;
	
	@FindBy (xpath="//div[@id='container_reports']")
	private WebElement report;
	
	@FindBy (xpath="//div[@id='container_users']")
	private WebElement user;
	
	public actihomepage(WebDriver driver1) {
		
		PageFactory.initElements(driver1, this);
	}

	public void opentask()
	{
		task.click();
	}
	
	public void openreport()
	{
		report.click();
	}
	
	public void openuser()
	{
		user.click();
	}

}
