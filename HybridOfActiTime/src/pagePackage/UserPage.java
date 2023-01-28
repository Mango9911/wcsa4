package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage
{
@FindBy (xpath = "//div[@class='label' and (.='Users')]") private WebElement userTab;
@FindBy (xpath = "create user x path") private WebElement createUser;
@FindBy(name = "username") private WebElement usnTextBox;
@FindBy(name = "passwordText") private WebElement passTextBox;
@FindBy(name = "passwordTextRetype") private WebElement reTypeTextBox;
@FindBy(name = "firstName") private WebElement firstNameTextBox;
@FindBy(name = "lastName") private WebElement lastNameTextBox;
@FindBy (xpath = "//input[@type='submit']") private WebElement createUserButton;
@FindBy (xpath = "//input[@value='      Cancel      ']") private WebElement cancelButton;



//initiallization
public UserPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	

}



public WebElement getUserTab() {
	return userTab;
}



public WebElement getCreateUser() {
	return createUser;
}



public WebElement getUsnTextBox() {
	return usnTextBox;
}



public WebElement getPassTextBox() {
	return passTextBox;
}



public WebElement getReTypeTextBox() {
	return reTypeTextBox;
}



public WebElement getFirstNameTextBox() {
	return firstNameTextBox;
}



public WebElement getLastNameTextBox() {
	return lastNameTextBox;
}



public WebElement getCreateUserButton() {
	return createUserButton;
}



public WebElement getCancelButton() {
	return cancelButton;
}


//opertional Method
 public void validusn(String validusername)
 {
	 getUsnTextBox().sendKeys(validusername);
 }
 public void validPass(String validPass)
 {
	 getPassTextBox().sendKeys(validPass);
 }
 
 public void firstName(String firstName)
 {
	 getFirstNameTextBox().sendKeys(firstName);
 }
 public void lasttName(String lastName)
 {
	 getLastNameTextBox().sendKeys(lastName);
 }
 
 public void createUser(String createUser)
 {
	 getCreateUser().sendKeys(createUser);
 }
 
 public void createUserButton (String LastName)
 {
	 getLastNameTextBox().sendKeys(LastName);
 }
 public void createUserButton ()
 {
	 getLastNameTextBox().click();
 }
 
 public void clickOnTab()
 {
	 createUser.click();
 }
 public void retypePass()
 {
	 
 }
 }










