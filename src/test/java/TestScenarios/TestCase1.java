package TestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Home;

public class TestCase1  {
	
	public void test1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		Home h=new Home(driver);
		h.triptype();
		h.from();
		h.to();
		h.selectmonth();
		h.selectday();
	    h.searchflight();;
		
	}
}
