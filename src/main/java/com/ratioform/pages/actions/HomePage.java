package com.ratioform.pages.actions;

import org.bson.assertions.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import com.ratioform.base.Page;
import com.ratioform.errorcollectors.ErrorCollector;
import com.ratioform.pages.locators.HomePageLocators;

public class HomePage extends Page {
	public HomePageLocators home;

	public HomePage() {

		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);

	}

	public void acceptCookies() {
		click(home.acceptCookies);

		// return this;
	}

	public void cancelGutschein() {

		click(home.cancelGutschein);
	}

	public void searchAProduct(String searchProduct) {
		type(home.searchAProduct, searchProduct);
		click(home.click2ndOptionSuggestion);
		

	}

	}
