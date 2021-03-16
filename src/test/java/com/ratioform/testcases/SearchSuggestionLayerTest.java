package com.ratioform.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.ratioform.pages.HomePage;
//import com.ratioform.product.SearchProduct;
import com.ratioform.utilities.Utilities;
import com.ratioform.base.Page;
import com.ratioform.errorcollectors.ErrorCollector;
import com.ratioform.pages.actions.HomePage;

public class SearchSuggestionLayerTest extends BaseTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void searchSuggestionLayerTest(Hashtable<String, String> data) {
		if (data.get("runmode").equalsIgnoreCase("N")) {

			throw new SkipException("Skipping the test as the Run mode is NO");

		}
		Page.initConfiguration();
		HomePage home = new HomePage();
		home.acceptCookies();
		home.cancelGutschein();
		home.searchAProduct(data.get("searchProduct"));
		//home.verifyCompanyName();
		//home.verifyPhoneLogo();
		// ErrorCollector.assertTrue(home.verifyCompanyName());
		//home.verifyPostSearch();

	}

	@AfterMethod
	public void tearDown() {
		if (Page.driver != null) {
			Page.quitBrowser();
		}
	}

}
