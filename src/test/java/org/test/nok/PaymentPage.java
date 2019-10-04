package org.test.nok;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage  extends BaseClass {
	public PaymentPage () {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[contains(text(),'All Right Reserved')]")
	private WebElement btompage;
	
	@FindBy(id="a_CC")
	private WebElement creditCard;
	
	@FindBy(xpath="(//label[@for='check_condition'])[1]")
	private WebElement agree;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement continnue;
	
	@FindBy(id="credit_card_number")
	private WebElement creditCardNo;
	
	@FindBy(id="credit_card_holder_name")
	private WebElement cardHolderName;
	
	@FindBy(id="credit_card_expiry_month")
	private WebElement expiryDate;
	
	@FindBy(id="credit_card_expiry_year")
	private WebElement expiryYear;
	
	@FindBy(id="credit_card_cvv")
	private WebElement ccv;
	
	@FindBy(id="btnCCSubmit")
	private WebElement Conform;
	
	@FindBy(id="btnCancel_CC")
	private WebElement cancel;
	
	public WebElement getBtompage() {
		return btompage;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public WebElement getAgree() {
		return agree;
	}
	
	public WebElement getContinnue() {
		return continnue;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCardHolderName() {
		return cardHolderName;
	}

	public WebElement getExpiryDate() {
		return expiryDate;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getConform() {
		return Conform;
	}

	public WebElement getCancel() {
		return cancel;
	}
	
	

}
