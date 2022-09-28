package test_Cases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFuncitons.CommonFunc;
import page_Objects.Imdb_Page_Objects;
import page_Objects.Wiki_Page_Objects;

public class TextValidation extends CommonFunc{

	String realseDateImdb;
	String countryImdb;
	String releasedatewiki;
	String countryWiki;
	public void imdbPage() {

		String imdbUrl =	Properties.getProperty("Imdburl");
		driver.get(imdbUrl);

		PageFactory.initElements(driver, Imdb_Page_Objects.class);

		Imdb_Page_Objects.search.sendKeys(Properties.getProperty("ImdbMovie")+Keys.ENTER);
		Imdb_Page_Objects.movieClick.click();
		realseDateImdb =	Imdb_Page_Objects.realseDateImdb.getText();
		countryImdb = Imdb_Page_Objects.countryImdb.getText();

	}

	public void wikiPage()
	{
		String wikipediaurl = Properties.getProperty("wikipediaurl");
		driver.get(wikipediaurl);
		PageFactory.initElements(driver, Wiki_Page_Objects.class);
		Wiki_Page_Objects.wikiSearch.sendKeys(Properties.getProperty("wikipediMovie"));
		Wiki_Page_Objects.sugg.click();
		releasedatewiki = Wiki_Page_Objects.releasedatewiki.getText();
		countryWiki = Wiki_Page_Objects.countryWiki.getText();


	}
	

	@Test
	public void verifyText() {
		imdbPage();
		wikiPage();
		Assert.assertNotEquals(realseDateImdb, releasedatewiki);
		Assert.assertEquals(countryImdb, countryWiki);


	}

}
