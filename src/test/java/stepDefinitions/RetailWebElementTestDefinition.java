package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.RetailPageWebElement;
import utilities.WebDriverUtility;

public class RetailWebElementTestDefinition extends Base{
	
	RetailPageWebElement pageElement = new RetailPageWebElement();
	
	
//	@Given("^User click  on MyAccount$")
//	public void user_click_on_MyAccount() throws Throwable {
//	pageElement.userClickOnMyAccount();
//	logger.info("user clicks on my account");
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
//	}
//
//	@When("^User click on Login$")
//	public void user_click_on_Login() throws Throwable {
//	pageElement.userClickOnLogin();
//	logger.info("User click on login");
//	WebDriverUtility.screenShot();
//	}
//	
//
//
//@When("^User enter username ‘userName’ and password 'password’$")
//public void user_enter_username_userName_and_password_password() throws Throwable {
//	pageElement.enterUserName("mu@gmail.com");
//	pageElement.enterPassword("123456789");
//	logger.info("User enter username");
//	logger.info("User enter password");
//	WebDriverUtility.screenShot();
//}
//	
//	@When("^User enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
//	public void user_enter_username_and_password(DataTable info) throws Throwable {
//	    
//		List<List<String>> userlist = info.asLists(String.class);
//		for(List<String> e : userlist) {
//			
//		}
//	    
//	}
//
//	@When("^User click on Login button$")
//	public void user_click_on_Login_button() throws Throwable {
//	pageElement.userClickOnLoginButton(); 
//	logger.info("User clicks on login button");
//	}
//
//	@Then("^User should be logged in to MyAccount dashboard$")
//	public void user_should_be_logged_in_to_MyAccount_dashboard() throws Throwable {
//	pageElement.isDashBoardDisplayed();
//	logger.info("User should see account dashboard");
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
//	}
//
//	@When("^User click on‘Register for an Affiliate Account’link$")
//	public void user_click_on_Register_for_an_Affiliate_Account_link() throws Throwable {
//	pageElement.clickOnAffiliateLink();
//	logger.info("User clicks on affiliate link");
//	WebDriverUtility.screenShot();
//	}
//
//	@When("^User fill affiliate form with below information$")
//	public void user_fill_affiliate_form_with_below_information(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    
//	}
//
//	@When("^User check on About us check box$")
//	public void user_check_on_About_us_check_box() throws Throwable {
//	pageElement.userCheckOnCheckBox();
//	logger.info("User checks the checkBox");
//	WebDriverUtility.screenShot();
//	}
//
//	@When("^User click on Continue button$")
//	public void user_click_on_Continue_button() throws Throwable {
//	pageElement.clickOnContinueButtuon();
//	logger.info("User clicks on continue button");
//	WebDriverUtility.screenShot();
//	}
//
//	@Then("^User should see a success message$")
//	public void user_should_see_a_success_message() throws Throwable {
//		String message = driver.findElement(By.xpath("//*[@class = 'alert alert-success alert-dismissible']")).getText();
//		if(message.contains("User should see a message Success")){
//			Assert.assertTrue(true);
//			logger.info("User should see a success message");
//			WebDriverUtility.screenShot();
//			WebDriverUtility.screenShot();
//		}else {
//			Assert.assertTrue(false);
//		}
//		
//		}
//	
//
//	@When("^User click on‘Edit your affiliate information link$")
//	public void user_click_on_Edit_your_affiliate_information_link() throws Throwable {
//	pageElement.userEditAffiliateInformationLink();
//	logger.info("User should be able to edit affiliate link");
//	WebDriverUtility.screenShot();
//	}
//
//	@When("^user click on Bank Transfer radio button$")
//	public void user_click_on_Bank_Transfer_radio_button() throws Throwable {
//	pageElement.userClickOnBankTransferRadioButton();
//	logger.info("User clicks on Transfer radio button");
//	WebDriverUtility.screenShot();
//	}
//
//	@When("^User fill Bank information with below information$")
//	public void user_fill_Bank_information_with_below_information(DataTable bankInfo) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//		List<Map<String, String>> bankDataInfo =bankInfo.asMaps(String.class, String.class);
//		for(Map<String, String> e : bankDataInfo) {
//			
//		}
//	    
//	}
//
//	@When("^User click on‘Edit your account information’ link$")
//	public void user_click_on_Edit_your_account_information_link() throws Throwable {
//	pageElement.clickOnEditAccountInformation(); 
//	logger.info("User clicks on edit account information");
//	WebDriverUtility.screenShot();
//	}
//
//	@When("^User modify below information$")
//	public void user_modify_below_information(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    
//	}
//
//	@When("^User click on continue button$")
//	public void user_click_on_continue_button() throws Throwable {
//	pageElement.userClickOnContinueButtonOfEditLink();
//	logger.info("User clicks on continue button of the edit link");
//	WebDriverUtility.screenShot();
//	}
//
//	@Then("^User should see a message ‘Success: Your account has been successfully updated\\.’$")
//	public void user_should_seea_message_Success_Your_account_has_been_successfully_updated() throws Throwable {
//		pageElement.editAccountLinkSuccessMessage();
//		logger.info("User should see a success message");
//		WebDriverUtility.screenShot();
//		WebDriverUtility.wait(1000);
//	}

	}
