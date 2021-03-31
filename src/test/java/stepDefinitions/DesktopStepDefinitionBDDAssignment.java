package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DeskTopPageBDDAssignment;
import utilities.WebDriverUtility;

public class DesktopStepDefinitionBDDAssignment extends Base {
	
	DeskTopPageBDDAssignment desktopsPage = new DeskTopPageBDDAssignment();
	
	@Given("^User is on Retail website$")
	public void user_is_on_Retail_website() throws Throwable {

		// we need to get to retail website.
		Base.initializeDriver();
		logger.info("Retail page is opened");
		String actualURL = desktopsPage.getURL();
		String expectedPageTitle = "TEST ENVIRONMENT";
		String actualPageTitle = expectedPageTitle;
		Assert.assertEquals(expectedPageTitle, actualPageTitle );
		logger.info("Page title  is verified");
		WebDriverUtility.screenShot();
		WebDriverUtility.wait(2000);
	}
	
	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() throws Throwable {
		desktopsPage.clickOnDesktop();
		logger.info("User click on DesktopsTob");
	}

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() throws Throwable {
		desktopsPage.clickOnShowAllDesktops();
		logger.info("User click on show all desktops");
		WebDriverUtility.screenShot();
	}

	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() throws Throwable {
		Assert.assertTrue(desktopsPage.itemsArePresentInDesktopPageInDisplayed());
		logger.info("User should see all items are present in Desktop page");
		WebDriverUtility.screenShot();
		}
	
	@When("^User click ADD TO CART option on ‘HP LP(\\d+)’ item$")
	public void user_click_ADD_TO_CART_option_on_HP_LP_item(int arg1) throws Throwable {
		desktopsPage.clickAddToCartHPItime();
		logger.info("User click ADD TO CART option on ‘HP LP");
		WebDriverUtility.screenShot();
		}
	
	@When("^User select quantity (\\d+)$")
	public void user_select_quantity(int arg1) throws Throwable {
		desktopsPage.selectQuantity1();
		logger.info("User select quantity");
		WebDriverUtility.screenShot();
		}
	
	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {
		desktopsPage.clickAddToCartButton();
		logger.info("User click add to Cart button");
		WebDriverUtility.screenShot();
		}


	@Then("^User should see a message ‘Success: you have added HP LP (\\d+) to your Shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(int arg1) throws Throwable {
		Assert.assertTrue(desktopsPage.messageISDisplayed());
		logger.info("message Success added HP");
		WebDriverUtility.screenShot();
		}
	
	@When("^User click ADD TO CART option on ‘Canon EOS (\\d+)D’ item$")
	public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int arg1) throws Throwable {
	    desktopsPage.addToCartOptionOnCanonEOS5DItiem();
	    logger.info("User click ADD TO CART option on Canon EOS");
	    WebDriverUtility.screenShot();
	}

	@When("^User select color from dropdown ‘Red’$")
	public void user_select_color_from_dropdown_Red() throws Throwable {
		desktopsPage.colorFromDropdownRed();
		logger.info("User select color from dropdown");
	    WebDriverUtility.screenShot();

	}

	@Then("^User should see a message ‘Success: You have added Canon EOS (\\d+)D to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(int arg1) throws Throwable {
		Assert.assertTrue(desktopsPage.messageISDisplayed());
		logger.info("Success Message Canon");
		WebDriverUtility.screenShot();
		}
	
	@When("^User click on Canon EOS (\\d+)D item$")
	public void user_click_on_Canon_EOS_D_item(int arg1) throws Throwable {
		desktopsPage.addToCartOptionOnCanonEOS5DItiem();
		logger.info("User click on Canon EOS");
		WebDriverUtility.screenShot();
	   
	}

	@When("^User click on write a review link$")
	public void user_click_on_write_a_review_link() throws Throwable {
	    desktopsPage.clickOnWriteReviewLink();
	    logger.info("User click on write a review link");
	    WebDriverUtility.screenShot();
	}

	@When("^user fill the review information with below information$")
	public void user_fill_the_review_information_with_below_information(DataTable reviewInfo) throws Throwable {
		List<Map<String, String>> dataValues = reviewInfo.asMaps(String.class, String.class);
		desktopsPage.enterName(dataValues.get(0).get("yourname"));
		desktopsPage.enterReview(dataValues.get(0).get("yourReview"));
		desktopsPage.selectRating();
		logger.info("user fill the review information with below information");
		WebDriverUtility.screenShot();
	}
	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button() throws Throwable {
	    desktopsPage.clickOnContinueButton();
	    logger.info("User click on Continue Button");
	    WebDriverUtility.screenShot();
	}

	@Then("^User should see a message with ‘Thank you for your review\\. It has been submitted to the webmaster for approval\\.”$")
	public void user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval() throws Throwable {
		Assert.assertTrue(desktopsPage.ThanksMessageISDisplayed());
		logger.info("message with Thank you for your review");
		WebDriverUtility.screenShot();
	}

}
