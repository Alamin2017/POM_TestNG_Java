package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookPage {
	
	WebDriver driver;
	
	public FacebookPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By user_email=By.xpath("//input[@id='email']");
	By user_pass=By.xpath("//input[@id='pass']");
	By login_button=By.xpath("//button[@name='login']");
	
	public void enterusername() throws InterruptedException
	{
		driver.findElement(user_email).sendKeys("alamincse12@gmail.com");
		Thread.sleep(3000);
	}
	
	public void enteruserpass() throws InterruptedException
	{
		driver.findElement(user_pass).sendKeys("123088");
		Thread.sleep(3000);
	}
	public void clickloginbutton() throws InterruptedException
	{
		driver.findElement(login_button).click();
		Thread.sleep(8000);
	}

}
