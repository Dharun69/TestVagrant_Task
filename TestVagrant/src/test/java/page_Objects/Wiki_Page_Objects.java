package page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wiki_Page_Objects {

	@FindBy(xpath = "//input[@id='searchInput']")
	public static WebElement wikiSearch;
	
	@FindBy(xpath = "//tbody/tr[12]/td[1]/div[1]/ul[1]/li[1]")
	public static WebElement releasedatewiki;
	
	@FindBy(xpath = "//td[normalize-space()='India']")
	public static WebElement countryWiki;
	
	@FindBy(xpath = "//div[@class='suggestions']")
	public static WebElement sugg;


}
