package Test_Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.FacebookPage;
import Objects.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Test001 {
	
	WebDriver driver;
	GoogleSearchPage page;
	FacebookPage obj;
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");	
	}
	@Test(priority=1)
	public void test_searchoperation() throws InterruptedException 
	{
		 page=new GoogleSearchPage(driver);
		 page.searchgoogle("facebook");	
	}
	@Test(priority=2)
	public void test_clickfacebooklink() throws InterruptedException
	{
		page=new GoogleSearchPage(driver);
		page.click_facebooklink();
	}
	@Test(priority=3)
	public void test_loginfacebook() throws InterruptedException
	{
		obj=new FacebookPage(driver);
		obj.enterusername();
		obj.enteruserpass();
		obj.clickloginbutton();
		String title_actual=driver.getTitle();
		System.out.println(title_actual);
		Assert.assertEquals(title_actual, "Facebook");		
	}
	
	@AfterTest
	public void teardown()
	{
		//driver.quit();
	}
}
