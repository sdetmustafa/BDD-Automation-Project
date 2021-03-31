package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Laptop_NoteBooksBDDAssingmentPage;
import utilities.WebDriverUtility;

public class Laptop_NoteBookStepDefinitionBDDAssignment extends Base {
	
	
	Laptop_NoteBooksBDDAssingmentPage laptopPageObj = new Laptop_NoteBooksBDDAssingmentPage();
	
	@When("^User click on Laptop &NoteBook tab$")
	public void user_click_on_Laptop_NoteBook_tab() throws Throwable {
		laptopPageObj.clickLaptopNoteBookTab();
		logger.info("User click on Laptop & Notebook tab");
		WebDriverUtility.screenShot();
	  
	}

	@When("^User click on Show all Laptop &NoteBook option$")
	public void user_click_on_Show_all_Laptop_NoteBook_option() throws Throwable {
		laptopPageObj.clickshowAllLaptopNoteBook();
		logger.info("User click on Show all Laptop &NoteBook");
		WebDriverUtility.screenShot();
	   
	}

	@When("^User click on MacBook item$")
	public void user_click_on_MacBook_item() throws Throwable {
		laptopPageObj.clickMacBookItem();
		logger.info("User click on MacBook item");
		WebDriverUtility.screenShot();
	 
	}

	@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() throws Throwable {
		Assert.assertTrue(laptopPageObj.priceTagIsPresentOnUIIsDisplayed());
		logger.info("User should see a message ‘Success: You have added MacBook to your shopping cart");
		WebDriverUtility.screenShot();
	}

	@Then("^User should see ‘(\\d+) tem\\(s\\)-(\\d+)\\.(\\d+)’ showed to the cart$")
	public void user_should_see_tem_s_showed_to_the_cart(int arg1, int arg2, int arg3) throws Throwable {
		laptopPageObj.ItemISDisplayed();
		logger.info("see 1Items 602 Showed To The Cart");
		WebDriverUtility.screenShot();
	}

	@Then("^User click on cart option$")
	public void user_click_on_cart_option() throws Throwable {
		laptopPageObj.clickOnCartOption();
		logger.info("User click on cart option");
		WebDriverUtility.screenShot();
	}

	@Then("^user click on red X button to remove the item from cart$")
	public void user_click_on_red_X_button_to_remove_the_item_from_cart() throws Throwable {
		laptopPageObj.clickremoveTheItemFromCart();
		logger.info("user click on red X button to remove the item from cart");
		WebDriverUtility.screenShot();

	
	}

	@Then("^item should be removed and cart should show ‘(\\d+) item\\(s\\)’$")
	public void item_should_be_removed_and_cart_should_show_item_s(int arg1) throws Throwable {
		laptopPageObj.cartShouldShowItemEmpty();
		logger.info("item should be removed and cart should show empty");
		WebDriverUtility.screenShot();

	  
	}

	@When("^User click on product comparison icon on ‘MacBook’$")
	public void user_click_on_product_comparison_icon_on_MacBook() throws Throwable {
	 laptopPageObj.clickComparisonIconOnMacBook();
	 logger.info("User clicks on comparison icon on MacBook");
	 WebDriverUtility.screenShot();
	}

	@When("^User click on product comparison icon on ‘MacBook Air$")
	public void user_click_on_product_comparison_icon_on_MacBook_Air() throws Throwable {
		laptopPageObj.clickComparisonIconOnMacBookAir();
		logger.info("User clicks on comparison icon on MacBook Air");
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a message ‘Success: You have added MacBook Air to your product comparison!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison() throws Throwable {
		laptopPageObj.aMessageISDisplayed();
		logger.info("User should see a success message you have added MacBook Air to your product comparison");
		WebDriverUtility.screenShot();
	}

	@Then("^User click on Product comparison link$")
	public void user_click_on_Product_comparison_link() throws Throwable {
		laptopPageObj.clickOnProductComparison();
		logger.info("User click on product comparison link");
		WebDriverUtility.screenShot();
	}

	@Then("^User should see Product Comparison Chart$")
	public void user_should_see_Product_Comparison_Chart() throws Throwable {
		laptopPageObj.ComparisonChartIsDisplayed();
		logger.info("User should see product comparison chart");
		WebDriverUtility.screenShot();
		WebDriverUtility.scrollPageDownWithJS();
		WebDriverUtility.wait(2000);
	}

	@When("^User click on heart icon to add ‘Sony VaIO’ laptop to wish list$")
	public void user_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list() throws Throwable {
		laptopPageObj.clickaddSonyVaIOLaptopToWishList();
		logger.info("User click on heart icon to add sony vaio to wish list");
		WebDriverUtility.screenShot();
	}

	@Then("^User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’$")
	public void user_should_get_a_message_You_must_login_or_create_an_account_to_save_Sony_VAIO_to_your_wish_list() throws Throwable {
		laptopPageObj.clickOnMessageLoginOrCreateAnAccountSonyVAIO();
		logger.info("User shouls see a message, You must login or create an account");
		WebDriverUtility.screenShot();
	}

	@When("^User click on ‘MacBook Pro’ item$")
	public void user_click_on_MacBook_Pro_item() throws Throwable {
		laptopPageObj.clickMacBookProItem();
		logger.info("User clicks on MacBook Pro Item");
		WebDriverUtility.screenShot();
	   
	}

	@Then("^User should see ‘\\$(\\d+),(\\d+)\\.(\\d+)’ price tag is present on UI\\.$")
	public void user_should_see_$_price_tag_is_present_on_UI(int arg1, int arg2, int arg3) throws Throwable {
		laptopPageObj.priceTagIsPresentOnUIIsDisplayed();
		logger.info("User should see price tag on UI");
		WebDriverUtility.screenShot();
	}

}
