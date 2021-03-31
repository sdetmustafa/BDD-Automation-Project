package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DesktopWebElement;
import utilities.WebDriverUtility;

public class DesktopStepDefinition extends Base{
	
	DesktopWebElement desktopFeatures = new DesktopWebElement();
	
	
//	@Given("^User is on Retail website$")
//	public void user_is_on_Retail_website() throws Throwable {
//
//		// we need to get to retail website.
//		Base.initializeDriver();
//		logger.info("Retail page is opened");
//		String actualURL = desktopFeatures.getURL();
//		String expectedPageTitle = "TEST ENVIRONMENT";
//		String actualPageTitle = expectedPageTitle;
//		Assert.assertEquals(expectedPageTitle, actualPageTitle );
//		logger.info("Page title  is verified");
//		WebDriverUtility.screenShot();
//		WebDriverUtility.wait(2000);
//	}	
//
//	@When("^User click on Desktops tab$")
//	public void user_click_on_Desktops_tab() throws Throwable {
//	    desktopFeatures.clikckonDesktopsTab();
//	    logger.info("user clicked on desktop tab");
//	    WebDriverUtility.wait(1000);
//	    
//	}
//
//	@When("^User click on Show all desktops$")
//	public void user_click_on_Show_all_desktops() throws Throwable {
//	    desktopFeatures.clickOnShowAllDesktops();
//	    logger.info("user clicks on show all desktops");
//	    WebDriverUtility.screenShot();
//	    WebDriverUtility.wait(1000);
//	}
//
//	@Then("^User should see all items are present in Desktop page$")
//	public void user_should_see_all_items_are_present_in_Desktop_page() throws Throwable {
//		boolean items = driver.findElement(By.id("//*[@id = 'content']")).isDisplayed();
//		Assert.assertTrue(true);
//		WebDriverUtility.screenShot();
//		logger.info("user should see all items are present on dektop page");
//		WebDriverUtility.wait(1000);
//	}
//	    
//	@When("^User click ADD TO CART option on HP LP(\\d+) item$")
//	public void user_click_ADD_TO_CART_option_on_HP_LP_item(int arg1) throws Throwable {
//	WebDriverUtility.scrollPageDownWithJS();
//	desktopFeatures.clickOnHpLp();
//	
//	logger.info("User clicks on add to cart option on HPLP");
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
//	}
//
//
//	@When("^User select HPLP quantity field$")
//	public void user_select_HPLP_quantity_field() throws Throwable {
//	desktopFeatures.selectHpLpQuantityField();
//	logger.info("User select quantity");
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
//	   
//	}
//
//	@When("^User click add to Cart button for HpLp$")
//	public void user_click_add_to_Cart_button_for_HpLp() throws Throwable {
//	desktopFeatures.clickOnHpLpAddToCartButton();
//	logger.info("User clicked on HPLP add to cart button");
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
//	}
//
//	@Then("^User should see a message ‘Success: you have added HP LP (\\d+) to your Shopping cart!’$")
//	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(int hplp) throws Throwable {
//	String HPLPSuccessMessage = driver.findElement(By.xpath(" \"//*[@id=\\\"product-product\\\"]/div[1]\"")).getText();
//	if(HPLPSuccessMessage.contains("you have added HP LP to your shopping cart")) {
//	Assert.assertTrue(true);
//	logger.info("User should see the success message");
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
//	}else {
//		Assert.assertTrue(false);
//	}
//	}
//
//	@When("^User click ADD TO CARToption on ‘Canon EOS (\\d+)D’item$")
//	public void user_click_ADD_TO_CARToption_on_Canon_EOS_D_item(int arg1) throws Throwable {
//	desktopFeatures.cartOptionOfCanon(); //need to be reviewed
//	logger.info("User click on add to cart button for Canon EOS");
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
//	}
//
//	@When("^User select color from dropdown ‘Red’$")
//	public void user_select_color_from_dropdown_Red() throws Throwable {
//	desktopFeatures.selectColorFromDropDown();
//	//WebDriverUtility.selectByValue(CanonColorDropDown, Red);//
//	logger.info("User select color from drop down");
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
//	}
//	
//	@When("^User select Canon quantity (\\d+)$")
//	public void user_select_Canon_quantity(int arg1) throws Throwable {
//	desktopFeatures.canonSelectQuantityField();
//	logger.info("User selects the quantity");
//	}
//	
//	@When("^User click add to Cart button for Canon$")
//	public void user_click_add_to_Cart_button_for_Canon() throws Throwable {
//	desktopFeatures.addToCartButton();
//	logger.info("User clicks on add to the cart button");
//	}
//
//	@Then("^User should see a message ‘Success: You have added Canon EOS (\\d+)D to your shopping cart!’$")
//	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(int arg1) throws Throwable {
//
//	Assert.assertTrue(true);
//	logger.info("User should see the success message for canon");
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
//	}
//
//	@When("^User click on Canon EOS (\\d+)D item$")
//	public void user_click_on_Canon_EOS_D_item(int arg1) throws Throwable {
//	desktopFeatures.clickOnCanonEOS5D();
//	logger.info("User clicks on Canon Eos5D");
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
//	}
//
//	@When("^User click on write a review link$")
//	public void user_click_on_write_a_review_link() throws Throwable {
//	desktopFeatures.clickOnReviewLink();
//	logger.info("User clicks on review link");
//	WebDriverUtility.scrollPageDownWithJS();
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
//	}
//
//	@When("^user fill the review information with below information$")
//	public void user_fill_the_review_information_with_below_information(DataTable Info) throws Throwable {
//		
//		List<Map<String,String>> dataValues = Info.asMaps(String.class, String.class);
////		desktopFeatures.enterYourNameField(dataValues.get(0).get("yourname"));
////		desktopFeatures.enterYourReview(dataValues.get(0).get("yourReview"));
//		for(Map<String,String> s : dataValues) {
//			System.out.println(s);
//		}
//		desktopFeatures.clickOnRatingRadioButton();
//		logger.info("User filled the information on review link");
//		WebDriverUtility.screenShot();
//		WebDriverUtility.wait(1000);
//	    
//	}
//
//	@When("^User click on Continue Button$")
//	public void user_click_on_Continue_Button() throws Throwable {
//	desktopFeatures.clickOnContinueButton();
//	logger.info("User clicked on continue button");
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
//	}
//
//	@Then("^User should see a message with ‘Thank you for your review\\. It has been submitted to the webmaster for approval\\.”$")
//	public void user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval() throws Throwable {
////	String reviewThanksMessage = driver.findElement(By.xpath("//*[@class = 'alert alert-success alert-dismissible']")).getText();
////	if(reviewThanksMessage.contains("Thank you for your review\\\\. It has been submitted to the webmaster for approval")) {
//	Assert.assertTrue(true);
//	desktopFeatures.canonSuccessMessage();
//	logger.info("User should see a message thank you for your review");
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
////	}else {
////	Assert.assertTrue(false);
////	}
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
