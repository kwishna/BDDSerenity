package LessonTwo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
@DefaultUrl("http://www.newtours.demoaut.com/")
public class MercuryHomePage extends PageObject{
	
//	public MercuryHomePage(WebDriver driver) {
//		super(driver);
//	}
	
	@Managed
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(@href, 'mercuryregister')]")
	WebElementFacade register;
	
	@FindBy(name="firstName")
	WebElementFacade firstName;
	
	@FindBy(name="lastName")
	WebElementFacade lastName;
	
	@FindBy(name="phone")
	WebElementFacade phone;
	
	@FindBy(name="userName")
	WebElementFacade email;
	
	@FindBy(name="address1")
	WebElementFacade address1;
	
	@FindBy(name="city")
	WebElementFacade city;
	
	@FindBy(name="state")
	WebElementFacade state;
	
	@FindBy(name="postalCode")
	WebElementFacade postalCode;
	
	@FindBy(name="country", timeoutInSeconds="3")
	WebElementFacade country;
	
	@FindBy(name="email")
	WebElementFacade userName;
	
	@FindBy(name="password")
	WebElementFacade password;
	
	@FindBy(name="confirmPassword")
	WebElementFacade confirmPassword;
	
	@FindBy(name="register")
	WebElementFacade registerBtn;
	
	@Test
	public void register() {
		
		System.out.println(getDriver());
		open();
		register.withTimeoutOf(Duration.ofSeconds(5)).waitUntilEnabled().click();
		waitForAnyTextToAppear("Contact Information","Mailing Information", "User Information ");
		
		Serenity.recordReportData().asEvidence().withTitle("Some Title").andContents("Some Content");
		
//		$("").withTimeoutOf(10, TimeUnit.SECONDS).waitUntilClickable().click();
	}

}
