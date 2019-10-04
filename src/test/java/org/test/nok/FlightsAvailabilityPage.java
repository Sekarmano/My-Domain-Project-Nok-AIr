package org.test.nok;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsAvailabilityPage extends BaseClass {
	public FlightsAvailabilityPage () {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//label[@class='seats-left ui-checkboxradio-label ui-corner-all ui-button ui-widget ui-checkboxradio-radio-label'])[1]")
	private WebElement amount;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement ctnue;
	
	@FindBy(xpath="//div[contains(text(),'All Right Reserved')]")
	private WebElement btom;
		

	public WebElement getAmount() {
		return amount;
	}

	public WebElement getCtnue() {
		return ctnue;
	}

	public WebElement getBtom() {
		return btom;
	}
	
	

}
