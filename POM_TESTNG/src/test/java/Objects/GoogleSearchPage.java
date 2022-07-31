package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By search_box=By.xpath("//input[@name='q']");
	By search_button=By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']");
	By facebook_link=By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/a/h3");
	
	public void searchgoogle(String searchinput) throws InterruptedException
	{
		driver.findElement(search_box).sendKeys(searchinput);
		driver.findElement(search_button).click();
		Thread.sleep(3000);
	}
	public void click_facebooklink() throws InterruptedException
	{
		driver.findElement(facebook_link).click();
		Thread.sleep(3000);
		
	}
	
	

}
