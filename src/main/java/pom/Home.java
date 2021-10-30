package pom;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	@FindBy(xpath="//a[contains(.,'Round Trip')]")
	private WebElement roundtrip;
	@FindBy(xpath="//div[@class=\"viewport\"]/div/div/li/div/p[contains(.,'Chhatrapati Shivaji International')]")
	private WebElement from;
	@FindBy(xpath="//div[@class=\"viewport\"]/div/div/li/div/p[contains(.,'Indira Gandhi International')]")
	private WebElement to;
	@FindBy(xpath="(//input[@class='js_ripple search-btn '])[1]")
	private WebElement searchforflight;
	@FindBy(xpath="//div[@class=\"month-title\"]")
	private List<WebElement> month;
	@FindBy(xpath="//div[@id=\"month-scroll1\"]/div/div[2]/descendant::td[2]")
	private List<WebElement> day;
	@FindBy(xpath="(//input[@id=\"BE_flight_flsearch_btn\"])[1]")
	private WebElement searchflight;
	
	
	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void triptype()
	{
		roundtrip.click();
	}
	public void from()
	{
		from.click();
	}

	
	public void to()
	{
		to.click();
	}

	public void selectmonth()
	{
		for(WebElement months:month)
		{
		String monthname=months.getText();
		if(monthname.equalsIgnoreCase("November"))
		{
			months.click();
			
		}
		break;
		}
	}
	public void selectday()

	{
		for(WebElement days:day)
		{
		String dayname=days.getText();
		if(dayname.equalsIgnoreCase("7"))
		{
			days.click();
			
		}
		break;
		}
	}
	public void searchflight()
	{
		
		searchflight.click();
		
	}

}
