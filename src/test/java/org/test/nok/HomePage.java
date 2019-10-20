package org.test.nok;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{
	public HomePage () {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//label[@for='radioOneway'])[1]")
	private WebElement oneWay;
	
	@FindBy(xpath="//input[@placeholder='Select departure airport']")
	private WebElement from;
//	Bangkok (Don Mueang) (DMK)
	
	@FindBy(xpath="//span[text()='Bangkok (Don Mueang)']")
	private WebElement bang;
	
	@FindBy(xpath="//input[@placeholder='Select arrival airport']")
	private WebElement to;
	
	@FindBy(xpath="(//span[text()='Krabi'])[2]")
	private WebElement des;
//	Krabi
	
	@FindBy(id="departureDateText")
	private WebElement departDate;
	
	@FindBy(id="arrivalDateText")
	private WebElement arrivalDate;
	
	
	@FindBy(xpath="(//a[text()='25'])[1]")
	private WebElement date;
	
	@FindBy(xpath="//a[@data-style='expand-right']")
	private WebElement next;
	
	@FindBy(xpath="//a[@aria-label='dismiss cookie message']")
	private WebElement cookiee;
	
	@FindBy(xpath="//div[@ng-model='currency.selected']")
	private WebElement currencyType;
	
	@FindBy(xpath="//div[text()='India - Rupee']")
	private WebElement inr;
	
	@FindBy(xpath="(//span[@class='sz15 glyphicon glyphicon-plus'])[1]")
	private WebElement adult;
	
	@FindBy(xpath="(//span[@class='sz15 glyphicon glyphicon-plus'])[2]")
	private WebElement child;
	
	@FindBy(xpath="//span[text()='Search']")
	private WebElement search;
	
	
	public WebElement getOneWay() {
		return oneWay;
	}


	public WebElement getFrom() {
		return from;
	}


	public WebElement getTo() {
		return to;
	}


	public WebElement getDes() {
		return des;
	}


	public WebElement getDate() {
		return date;
	}


	public WebElement getNext() {
		return next;
	}


	public WebElement getCookiee() {
		return cookiee;
	}


	public WebElement getInr() {
		return inr;
	}


	public WebElement getBang() {
		return bang;
	}


	public WebElement getAdult() {
		return adult;
	}


	public WebElement getChild() {
		return child;
	}


	public WebElement getDepartDate() {
		return departDate;
	}


	public WebElement getArrivalDate() {
		return arrivalDate;
	}


	public WebElement getSearch() {
		return search;
	}


	public WebElement getCurrencyType() {
		return currencyType;
	}
	
	
	
	
	
	
	
	
	
	

}
