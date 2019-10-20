package org.test.nok;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassengerDetailsPage  extends BaseClass {
	public PassengerDetailsPage () {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//p[text()='Contact Information']")
	private WebElement downmr;
	
	@FindBy(xpath="//span[text()='Please select']")
	private WebElement select;
	
	@FindBy(id="ui-id-2")
	private WebElement mr;
	
	@FindBy(id="firstName1")
	private WebElement firstName;
	
	@FindBy(id="lastName1")
	private WebElement lastName;
	
	@FindBy(id="emailAddress")
	private WebElement email;
	
	@FindBy(xpath="(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[3]")
	private WebElement countryCode;
	
	@FindBy(id="mobilePhone")
	private WebElement mobileNo;

	@FindBy(xpath="(//label[@for='select-baggage'])[1]")
	private WebElement noBaggage;
	
	@FindBy(xpath="(//label[@for='select-insurance'])[1]")
	private WebElement noInsurance;
	
	@FindBy(xpath="//div[contains(text(),'All Right Reserved')]")
	private WebElement btompage;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement cntue;
	
	

	public WebElement getDownmr() {
		return downmr;
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getMr() {
		return mr;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCountryCode() {
		return countryCode;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getNoBaggage() {
		return noBaggage;
	}

	public WebElement getNoInsurance() {
		return noInsurance;
	}
	
	

	public WebElement getBtompage() {
		return btompage;
	}

	public WebElement getCntue() {
		return cntue;
	}
	
	
}
