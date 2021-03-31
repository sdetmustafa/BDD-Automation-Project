package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.core.Logger;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.RetailPageObject;
import utilities.WebDriverUtility;

public class RetailPageTestStepDefinitions extends Base {
	
	// In this class we will write actual java/selenium codes associated with each scenario steps.
	
	RetailPageObject retailPage = new RetailPageObject();
	
//	@When("^User search for '(.+)'$")
//	public void user_search_for_iphone(String value) throws Throwable {
//		retailPage.EnterValueToSearchBar(value);
//		logger.info("User entered value in search bar");
//		WebDriverUtility.screenShot();
//	}
//	@When("^User click on search button$")
//	public void user_click_on_search_button() throws Throwable {
//		retailPage.clickOnSearchButton();
//		logger.info("User clicked on search button");
//	}
//	@Then("^User should see Iphone image$")
//	public void user_should_see_Iphone_image() throws Throwable {
//		Assert.assertTrue(retailPage.iphoneImageIsDisplayed());
//		logger.info("iPhone image is displayed");
//		WebDriverUtility.screenShot();
//
//	}
//	
//	@When("^User click on MyAccount$")
//	public void user_click_on_MyAccount() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		retailPage.clickOnMyAccount();
//	  
//	}
//
//	@When("^User click on Register option$")
//	public void user_click_on_Register_option() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    retailPage.clickOnRegister();
//	    logger.info("User clicked on Register option");
//	}
//
//	@When("^User fill the Registration form with Below information$")
//	public void user_fill_the_Registration_form_with_below_information(DataTable personalInfo) throws Throwable {
//	  
//		
//		List<Map<String,String>> dataValues = personalInfo.asMaps(String.class, String.class);
//		retailPage.enterFirstName(dataValues.get(0).get("firstName"));
//		retailPage.enterLastName(dataValues.get(0).get("lastName"));
//		retailPage.enterEmail(dataValues.get(0).get("email"));
//		retailPage.enterTelephone(dataValues.get(0).get("telephone"));
//		retailPage.enterPassword(dataValues.get(0).get("password"));
//		retailPage.enterConfirmPassword(dataValues.get(0).get("confirmPassword"));
//		retailPage.subscribe(dataValues.get(0).get("subscribe"));
//		
//		logger.info("User filled the information form");
//		WebDriverUtility.screenShot();
//		
//	}
//
//	@When("^User accept the privacy and policy$")
//	public void user_accept_the_privacy_and_policy() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	   retailPage.checkPrivacyPolicy();
//	   logger.info("User check the privacy and policy");
//	   WebDriverUtility.screenShot();
//	}
//
//	@When("^User click on Continue button$")
//	public void user_click_on_Continue_button() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	   retailPage.clickOnContinueButton();
//	   logger.info("User clicked on continue buttton");
//	}
//
//	
//	@Then("^User should be registered in Retail Website$")
//	public void user_should_be_registered_in_Retail_Website() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		Assert.assertTrue(retailPage.registrationOutcome());
//		WebDriverUtility.screenShot();
//		logger.info("Account was created Successfully");
	}

