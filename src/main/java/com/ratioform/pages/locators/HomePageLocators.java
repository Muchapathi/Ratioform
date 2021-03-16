package com.ratioform.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	@FindBy(xpath = "//*[@id=\"close-cookie\"]")
	public WebElement acceptCookies;
	//*[@id=\"close-cookie\"]
	@FindBy(xpath = "/html/body/newsletter-layer/div/div[1]/i")
	public WebElement cancelGutschein;

	@FindBy(xpath = "//*[@id=\"user-navigation-not-logged__button\"]/a/span")
	public WebElement anmelden;
	//*[@id=\"user-navigation-not-logged__button\"]/a/span
	@FindBy(xpath = "//*[@id=\"carton-flyout-mobile\"]")
	public WebElement Kartonfinder;

	@FindBy(xpath = "/html/body/div[2]/header-tag/div[1]/div/div[1]/a")
	public WebElement phoneLogo;

	@FindBy(xpath = "/html/body/div[2]/header-tag/div[2]/div[1]/div/div[2]/user-navigation-not-logged/div[3]/a/span")
	public WebElement einkaufslisten;

	@FindBy(xpath = "/html/body/div[2]/header-tag/div[2]/div[1]/div/div[2]/user-navigation-not-logged/div[4]/a/span")
	public WebElement warenkorb;

	@FindBy(xpath = "/html/body/div[2]/header-tag/div[2]/div[1]/div/div[1]/search-form/form/input[1]")
	public WebElement searchAProduct;
					
	@FindBy(xpath = "/html/body/div[2]/header-tag/div[2]/div[1]/div/div[1]/search-form/form/button")
	public WebElement clickSearchButton;

	@FindBy(xpath = "/html/body/div[2]/header-tag/div[2]/div[1]/div/div[1]/search-form/form/suggest-search/div/div/div/div/div[2]/a")
	public WebElement click2ndOptionSuggestion;

}
