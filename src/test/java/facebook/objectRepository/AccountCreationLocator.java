package facebook.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Fb.Hooks.Variables;

import facebook.utils.Utility;

public class AccountCreationLocator extends Utility implements Variables  {
	
public AccountCreationLocator() {
		
		PageFactory.initElements(driver, this);	
		
	}
@FindBy(xpath="//a[text()='Create new account']")
private WebElement createaccount;
@FindBy(xpath="//input[@name=\"firstname\"]")
private WebElement firstname;
@FindBy(xpath="//input[@name=\"lastname\"]")
private WebElement lastname;
@FindBy(xpath="//select[@id=\"day\"]")
private WebElement date;
@FindBy(xpath="//select[@id=\"month\"]")
private WebElement month;
@FindBy(xpath="//select[@title=\"Year\"]")
private WebElement year;
@FindBy(xpath="//label[text()='Male']")
private WebElement gender;
@FindBy(xpath="//input[@aria-label=\"Mobile number or email address\"]")
private WebElement email;
@FindBy(xpath="//input[@aria-label=\"New password\"]")
private WebElement password;


public WebElement getCreateaccount() {
	return createaccount;
}
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getDate() {
	return date;
}
public WebElement getMonth() {
	return month;
}
public WebElement getYear() {
	return year;
}
public WebElement getGender() {
	return gender;
}
public WebElement getEmail() {
	return email;
}
public WebElement getPassword() {
	return password;
}

}

	
	


