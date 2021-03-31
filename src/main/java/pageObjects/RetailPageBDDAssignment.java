package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageBDDAssignment extends Base{
	
	public RetailPageBDDAssignment() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="(//*[@class='hidden-xs hidden-sm hidden-md'])[3]")
	private WebElement clickOnMyAccount;
	public void userClickOnMyAccount() {
		WebDriverUtility.clickOnElement(clickOnMyAccount);
	}
	
	@FindBy(linkText ="Login")
	private WebElement clickOnLogin;
	public void userClickOnLogin() {
		WebDriverUtility.clickOnElement(clickOnLogin);
	}
	
	

	@FindBy(xpath ="//*[@id='input-email']")
	private WebElement emailFieled;
	public void enterUserName(String email) {
	WebDriverUtility.enterValue(emailField, email);
	}
	
	@FindBy(xpath ="//*[@id='input-password']")
	private WebElement passwordField ;
	public void enterPassword(String password) {
		WebDriverUtility.enterValue(passwordField, password);
	}
	
	@FindBy(xpath ="(//*[@class='btn btn-primary'])[2]")
	private WebElement loginButton;
	public void userClickOnLoginButton() {
		WebDriverUtility.clickOnElement(loginButton);
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
//	@FindBy(id = "//*[@id = 'common-success']")
//	private WebElement accountDashBoard;
//	public boolean isDashBoardDisplayed() {
//		if(accountDashBoard.isDisplayed())
//			return true;
//		else
//			return false;
//	}
	
	@FindBy(xpath ="//*[@id=\"content\"]/ul[3]/li/a")
	private WebElement registerForAnAffiliateAccountLink;
	public void clickOnAffiliateLink() {
		WebDriverUtility.clickOnElement(registerForAnAffiliateAccountLink);
	}
	
	@FindBy(xpath ="//*[@id='input-company']")
	private WebElement companyField;
	public void userFillCompanyField(String companyName) {
		WebDriverUtility.enterValue(companyField, companyName);
	}
	
	@FindBy(xpath ="//*[@id='input-website']")
	private WebElement websiteField;
	public void userFillWebsiteField(String websiteName) {
		WebDriverUtility.enterValue(websiteField, websiteName);
	}
	
	@FindBy(xpath ="//*[@id='input-tax']")
	private WebElement taxIDField;
	public void userFillTaxIdField(String taxID) {
		WebDriverUtility.enterValue(taxIDField, taxID);
	}
	
	@FindBy(xpath ="(//*[@type='radio'])[1]")
	private WebElement paymentMethodField;
	public void userFillpaymentField(String payment) {
		WebDriverUtility.enterValue(paymentMethodField, payment);
	}
	
	@FindBy(xpath = "//*[@id='input-cheque']")
	private WebElement ChequePayeeName;
	public void filldChequePayeeName(String ChequePayee) {
		WebDriverUtility.enterValue(ChequePayeeName, ChequePayee);
	}
	
	@FindBy(xpath ="//*[@type='checkbox']")
	private WebElement checkbox;
	public void userCheckOnCheckBox() {
		WebDriverUtility.clickOnElement(checkbox);
	}
	
	@FindBy(xpath ="//*[@value='Continue']")
	private WebElement continueButton;
	public void clickOnContinueButtuon() {
		WebDriverUtility.clickOnElement(continueButton);
	}
	
	@FindBy(xpath ="//*/div[@id='account-account']/div[1]")
	private WebElement successMessage;
	public boolean successMessageDisplayed() {
		if(successMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath ="//*[contains(text(),'Edit your affiliate information')]")
	private WebElement editYourAffiliateAccountInformation;
	public void userEditAffiliateInformationLink() {
		WebDriverUtility.clickOnElement(editYourAffiliateAccountInformation);
	}
	
	@FindBy(xpath ="(//*[@type='radio'])[3]")
	private WebElement transferRadioButton;
	public void userClickOnBankTransferRadioButton() {
		WebDriverUtility.clickOnElement(transferRadioButton);
	}
	
	@FindBy(xpath ="//*[@id='input-bank-name']")
	private WebElement bankNameField;
	public void userFillBankNameField(String bankName) {
		WebDriverUtility.enterValue(bankNameField, bankName);
	}
	
	@FindBy(xpath ="//*[@id='input-bank-branch-number']")
	private WebElement abaNumberField;
	public void userFillabaNumberField(String abaNum) {
		WebDriverUtility.enterValue(abaNumberField, abaNum);
	}
	
	@FindBy(xpath ="//*[@id='input-bank-swift-code']")
	private WebElement swiftCodeField;
	public void userFillSwiftCodeField(String swiftCode) {
		WebDriverUtility.enterValue(swiftCodeField, swiftCode);
	}
	
	@FindBy(xpath ="//*[@id='input-bank-account-name']")
	private WebElement accountNameField;
	public void userFillAccountNameField(String accountName) {
		WebDriverUtility.enterValue(accountNameField, accountName);
	}
	
	@FindBy(xpath ="//*[@id='input-bank-account-number']")
	private WebElement accountNumberField;
	public void userFillAccountNumberField(String accountNumber) {
		WebDriverUtility.enterValue(accountNumberField, accountNumber);
	}
	
	@FindBy(xpath ="//*[@class='btn btn-primary']")
	private WebElement MyAffiliateAccountcontinueButton;
	public void userClickOnContinueButton() {
		WebDriverUtility.clickOnElement(MyAffiliateAccountcontinueButton);
	}
	
	@FindBy(xpath ="//*/div[@id='account-account']/div[1]")
	private WebElement MyAffiliateAccountsuccessMessage;
	public boolean userSeeSuccessMessage() {
		if(MyAffiliateAccountsuccessMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath ="//*[@id=\"content\"]/ul[1]/li[1]/a")
	private WebElement editYourAccountInformation;
	public void clickOnEditAccountInformation() {
		WebDriverUtility.clickOnElement(editYourAccountInformation);
	}
	
	@FindBy(xpath ="//*[@id='input-firstname']")
	private WebElement firstNameField;
	public void userEnterFirstNameField(String firstName) {
		WebDriverUtility.enterValue(firstNameField, firstName);
	}
	
	@FindBy(xpath ="//*[@id='input-lastname']")
	private WebElement lastNameField;
	public void userEnterLastNameField(String lastName) {
		WebDriverUtility.enterValue(lastNameField, lastName);
	}
	
	@FindBy(xpath ="//*[@id='input-email']")
	private WebElement emailField;
	public void userEnterEmailField(String email) {
		WebDriverUtility.enterValue(emailField, email);
	}
	
	@FindBy(xpath ="//*[@id='input-telephone']")
	private WebElement telephoneField;
	public void userEnterTelephoneNumber(String phoneNumber) {
		WebDriverUtility.enterValue(telephoneField, phoneNumber);
	}
	
	@FindBy(xpath ="//*[@type='submit']")
	private WebElement editYourAccountInformationContinueButton;
	public void userClickOnContinueButtonOfEditLink() {
		WebDriverUtility.clickOnElement(editYourAccountInformationContinueButton);
	}
	
	@FindBy(xpath ="//*[@class='alert alert-success alert-dismissible']")
	private WebElement editYourAccountInformationsuccessMessage;
	public boolean editAccountSuccessMessage() {
		boolean editYourAccountInfosuccessMessage = editYourAccountInformationsuccessMessage.isDisplayed();
		return editYourAccountInfosuccessMessage;
		
	}

}
