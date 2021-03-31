package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class Laptop_NoteBooksBDDAssingmentPage extends Base{
	
	
		public Laptop_NoteBooksBDDAssingmentPage(){
			PageFactory.initElements(driver, this);
		}

	//public void clickAddToCartHPItime() {
		//WebDriverUtility.clickOnElement(clickAddToCartHPItime);
		// method to initialize the WebElements in this page.
		
		
		@FindBy(xpath ="(//a[@class='dropdown-toggle'])[3]")
		private WebElement laptopNoteBookTab;
		public void clickLaptopNoteBookTab() {
			WebDriverUtility.clickOnElement(laptopNoteBookTab);
		}
		
		@FindBy(xpath = "(//a[@class='see-all'])[2]")
		private WebElement showAllLaptopNoteBook;
		public void clickshowAllLaptopNoteBook() {
			WebDriverUtility.clickOnElement(showAllLaptopNoteBook);
		}
		
		@FindBy(xpath ="//img[@title='MacBook']")
		private WebElement MacBookItem;
		public void clickMacBookItem() {
			WebDriverUtility.clickOnElement(MacBookItem);
		}
		
		@FindBy(xpath ="//button[@id='button-cart']")
		private WebElement addToCartButton;
		public void clicaddToCartButton() {
			WebDriverUtility.clickOnElement(addToCartButton);
		}
		
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
		private WebElement SuccessMessageMacBook;
		public boolean messageISDisplayed() {
			boolean successMessageAddedMacBookToYourShoppingCart = SuccessMessageMacBook.isDisplayed();
			return successMessageAddedMacBookToYourShoppingCart;
			}
		
		@FindBy(xpath ="(//*[@data-toggle='dropdown'])[3]")
		private WebElement see1Items602ShowedToTheCart;
		public boolean ItemISDisplayed() {
			boolean shouldSee1tems602ShowedToTheCart = see1Items602ShowedToTheCart.isDisplayed();
			return shouldSee1tems602ShowedToTheCart;
			}

		@FindBy(xpath ="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
		private WebElement clickOnCartOption;
		public void clickOnCartOption() {
			WebDriverUtility.clickOnElement(clickOnCartOption);
		}
		
		@FindBy(xpath ="//button[@title='Remove']")
		private WebElement removeTheItemFromCart;
		public void clickremoveTheItemFromCart() {
			WebDriverUtility.clickOnElement(removeTheItemFromCart);
		}
		
		@FindBy(xpath ="(//*[@type='button'])[5]")
		private WebElement shouldBeRemovedAndCartShouldShowItem;
		public boolean cartShouldShowItemEmpty() {
			boolean emptyDisplayedCart = shouldBeRemovedAndCartShouldShowItem.isDisplayed();
			return emptyDisplayedCart;
		}
		
		@FindBy(xpath ="(//*[@type='button'])[16]")
		private WebElement comparisonIconOnMacBook;
		public void clickComparisonIconOnMacBook() {
			WebDriverUtility.clickOnElement(comparisonIconOnMacBook);
		}
		
		@FindBy(xpath ="(//*[@type='button'])[19]")
		private WebElement comparisonIconOnMacBookAir;
		public void clickComparisonIconOnMacBookAir() {
			WebDriverUtility.clickOnElement(comparisonIconOnMacBookAir);
		}
		
		@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
		private WebElement SuccessMessageMacBookAir;
		public boolean aMessageISDisplayed() {
			boolean successMessageAddedMacBookAirToYourShoppingCart = SuccessMessageMacBookAir.isDisplayed();
			return successMessageAddedMacBookAirToYourShoppingCart;
			}
		
		@FindBy(xpath ="//*[@id='compare-total']")
		private WebElement ProductComparisonLink;
		public void clickOnProductComparison() {
			WebDriverUtility.clickOnElement(ProductComparisonLink);
		}
		@FindBy(xpath ="//*[@id='content']")
		private WebElement shouldSeeProductComparisonChart;
		public boolean ComparisonChartIsDisplayed() {
			boolean ComparisonChart =  shouldSeeProductComparisonChart.isDisplayed();
					return ComparisonChart;
		}
		
		@FindBy(xpath ="(//button[@type = 'button'])[22]")
		private WebElement SonyVaIOLaptopToWishList;
		public void clickaddSonyVaIOLaptopToWishList() {
			WebDriverUtility.clickOnElement(SonyVaIOLaptopToWishList);
		}

		@FindBy(xpath ="//body/div[@id='product-category']/div[1]")
		private WebElement messageLoginOrCreateAnAccountSonyVAIO;
		public void clickOnMessageLoginOrCreateAnAccountSonyVAIO() {
			WebDriverUtility.clickOnElement(messageLoginOrCreateAnAccountSonyVAIO);
		}
		@FindBy(xpath ="//*[@title='MacBook Pro']")
	    private WebElement MacBookProItem;
		public void clickMacBookProItem() {
			WebDriverUtility.clickOnElement(MacBookProItem);
		}
		@FindBy(xpath ="(//*[@type='button'])[5]")
	    private WebElement shouldSeePriceTagUI;	
		public boolean priceTagIsPresentOnUIIsDisplayed() {
			boolean userhouldsee_2000Price = shouldSeePriceTagUI.isDisplayed();
			return userhouldsee_2000Price;
			}

}
