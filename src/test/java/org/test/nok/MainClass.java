package org.test.nok;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainClass extends BaseClass{
	public static void main(String[] args) throws InterruptedException, AWTException {
		launchBrowser();
		loadUrl("https://www.nokair.com/");
		
	driver.manage().window().maximize();
				
		HomePage h=new HomePage();
		Thread.sleep(5000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		
		btnClick(h.getOneWay());
		btnClick(h.getCookiee());
		btnClick(h.getFrom());
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		a.moveToElement(h.getBang()).perform();
		btnClick(h.getBang());
		
//		type(h.getFrom(), "Bangkok (Don Mueang) (DMK)");
		btnClick(h.getTo());
		a.moveToElement(h.getDes()).perform();
		btnClick(h.getDes());
//		type(h.getTo(), "Krabi (KBV)");
		btnClick(h.getDepartDate());
		a.moveToElement(h.getDate()).perform();
		btnClick(h.getDate());
		
		Thread.sleep(2000);
		a.moveToElement(h.getCurrencyType()).perform();
		btnClick(h.getCurrencyType());
		btnClick(h.getInr());
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", h.getDate());
//		
//		js.executeScript("arguments[0].click();", h.getCurrencyType());
//	
//		btnClick(h.getDate());
//		btnClick(h.getNext());
//		btnClick(h.getAdult());
//		btnClick(h.getCurrencyType());
		
//		btnClick(h.getInr());
		btnClick(h.getSearch());
		
		
		
		
	FlightsAvailabilityPage f=new FlightsAvailabilityPage();
	Thread.sleep(5000);
			btnClick(f.getAmount());
			Thread.sleep(3000);
			scrollDown(f.getBtom());
			btnClick(f.getCtnue());
				
			PassengerDetailsPage p=new PassengerDetailsPage();
//			scrollDown(p.getDownmr());
//			Thread.sleep(5000);
//			a.moveToElement(p.getSelect()).perform();
//			btnClick(p.getSelect());
//			btnClick(p.getMr());
			
			Robot n=new Robot();
//			n.keyPress(KeyEvent.VK_KP_DOWN);
//			n.keyRelease(KeyEvent.VK_KP_DOWN);
//			n.keyPress(KeyEvent.VK_ENTER);
//			n.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			
			type(p.getFirstName(), "Manojkumar");
			type(p.getLastName(), "Sekar");
			type(p.getEmail(), "s.manojbe2012@gmail.com");
			btnClick(p.getCountryCode());
			
			n.keyPress(KeyEvent.VK_I);
			n.keyRelease(KeyEvent.VK_I);
			n.keyPress(KeyEvent.VK_ENTER);
			n.keyRelease(KeyEvent.VK_ENTER);
			type(p.getMobileNo(), "8015572746");
			btnClick(p.getNoBaggage());
			btnClick(p.getNoInsurance());
			scrollDown(p.getBtompage());
			Thread.sleep(5000);
			btnClick(p.getCntue());
			
			PaymentPage c=new PaymentPage();
			Thread.sleep(5000);
			scrollDown(c.getBtompage());
			btnClick(c.getCreditCard());
			scrollDown(c.getBtompage());
			Thread.sleep(3000);
			btnClick(c.getAgree());
			btnClick(c.getContinnue());
			Thread.sleep(5000);
			type(c.getCreditCardNo(), "2369875469856345");
			type(c.getCardHolderName(), "Manojkumar");
			sbv(c.getExpiryDate(), "10");
			sbv(c.getExpiryYear(), "2025");
			type(c.getCcv(), "856");
			btnClick(c.getConform());
			
		}
}
