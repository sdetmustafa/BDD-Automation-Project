package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LaptopAndNoteBooksWebElements;
import utilities.WebDriverUtility;

//public class LaptopAndNoteBookStepDefinition extends Base {
	
	//LaptopAndNoteBooksWebElements laptopAndNotebook = new LaptopAndNoteBooksWebElements();
	
	
	
//	@When("^User click on Laptop &NoteBook tab$")
//	public void user_click_on_Laptop_NoteBook_tab() throws Throwable {
//	laptopAndNotebook.clickOnLaptopAndNoteBookTab();
//	logger.info("User clicks on laptop and notebook tab");
//	WebDriverUtility.wait(2000);
//	WebDriverUtility.screenShot();
//	}
//
//	@When("^User click on Show all Laptop &NoteBook option$")
//	public void user_click_on_Show_all_Laptop_NoteBook_option() throws Throwable {
//	laptopAndNotebook.clickOnShowAllOption();
//	logger.info("User clicked on show all option for laptop and notebook");
//	WebDriverUtility.screenShot();
//	}
//
//	@When("^User click on \"([^\"]*)\"  item$")
//	public void user_click_on_item(String MacBook) throws Throwable {
//	laptopAndNotebook.clickOnMacBookItem(); 
//	logger.info("User clicks on MacBook item");
//	}
//
//	@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
//	public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() throws Throwable {
//	laptopAndNotebook.MacBookItemSuccessMessage();
//	logger.info("User should see a success message");
//	WebDriverUtility.wait(2000);
//	WebDriverUtility.screenShot();
//	}
//
//	@Then("^User should see \"([^\"]*)\" price showed to the cart$")
//	public void user_should_see_price_showed_to_the_cart(String price) throws Throwable {
//	laptopAndNotebook.showCartTotalOfMacBook();
//	logger.info("User shoudl see the MacBook cart");
//	WebDriverUtility.wait(2000);
//	WebDriverUtility.screenShot();
//	}
//
//	@Then("^User click on cart option$")
//	public void user_click_on_cart_option() throws Throwable {
//	laptopAndNotebook.clickOnMacBookCartTotalOption();
//	logger.info("User clicks on cart option");
//	WebDriverUtility.screenShot();
//	}
//
//	@Then("^user click on red X button to remove the item from cart$")
//	public void user_click_on_red_X_button_to_remove_the_item_from_cart() throws Throwable {
//	laptopAndNotebook.clickOnRedButtion();
//	logger.info("User clicks on X red button");
//	WebDriverUtility.screenShot();
//	}
//
//	@Then("^item should be removed and cart should show ‘(\\d+) item\\(s\\)’$")
//	public void item_should_be_removed_and_cartshould_show_item_s(int cartPrice) throws Throwable {
//	laptopAndNotebook.removeItemFromMacBookCart();
//	logger.info("User should remove the item from cart");
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
//	}
//
//	@When("^User click on product comparison icon on \"([^\"]*)\"$")
//	public void user_click_on_product_comparison_icon_on(String computer) throws Throwable {
//	laptopAndNotebook.clickOnProductComparisonIconOfMacBook();
//	logger.info("User clicks on product comparison icon for any computer");
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
//	}
//
//	@Then("^User should see a message ‘Success: You have added MacBook Air to your product comparison!’$")
//	public void user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison() throws Throwable {
//	laptopAndNotebook.MacBookAirComparisonSuccessMsg();
//	logger.info("User should see a success message for MacBookAir product");
//	WebDriverUtility.screenShot();
//	}
//
//	@Then("^User click on Product comparison link$")
//	public void user_click_on_Product_comparison_link() throws Throwable {
//	laptopAndNotebook.clickOnComparisonLink();
//	logger.info("User clicks on comparison link");
//	WebDriverUtility.screenShot();
//	
//	}
//
//	@Then("^User should see Product Comparison Chart$")
//	public void user_should_see_Product_Comparison_Chart() throws Throwable {
//	laptopAndNotebook.productComparisonChart();
//	logger.info("User should see product chart");
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
//	    
//	}
//
//	@When("^User click on hearticon to add SONYVAIO laptop to wish list$")
//	public void user_click_on_hearticon_to_add_SONYVAIO_laptop_to_wish_list() throws Throwable {
//	laptopAndNotebook.clickOnSonyVaioLaptopWishList();
//	logger.info("User clicks on Sony Vaio laptop wish list");
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
//	}
//
//	@Then("^User should get a message ‘You must login or create an account to save \"([^\"]*)\" to your wish list!’$")
//	public void user_should_get_a_message_You_must_login_or_create_an_account_to_save_to_your_wish_list(String computer) throws Throwable {
//	laptopAndNotebook.messageLoginOrCreateAccountToSonyVaio();
//	logger.info("User should see a message you should create an acount or must login");
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
//	}
//
//	@When("^User click on \"([^\"]*)\" item$")
//	public void user_click_on(String MacBookPro) throws Throwable {
//	laptopAndNotebook.clickOnMacBookProItem();
//	logger.info("User clicks on MacBook Pro item");
//	WebDriverUtility.screenShot();
//	WebDriverUtility.wait(1000);
//	}
//
//	@Then("^User should see \"([^\"]*)\" price tag is present on UI\\.$")
//	public void user_should_see_price_tag_is_present_on_UI(String price) throws Throwable {
//	laptopAndNotebook.priceTagPresentOnUI();
//	logger.info("User should see the price tag is present on UI");
//	WebDriverUtility.screenShot();
//	}
//
//}
