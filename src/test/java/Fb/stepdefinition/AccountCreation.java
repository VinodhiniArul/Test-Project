package Fb.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.Fb.Hooks.Variables;

import facebook.objectRepository.AccountCreationLocator;
import facebook.utils.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AccountCreation extends Utility implements Variables {
	
	Utility utils= new Utility();
	AccountCreationLocator acl=new AccountCreationLocator();
	public static Select select;

	
	
	@Given("Launch Applicatioin  {string}")
	public void launch_applicatioin(String url) {
		utils.applicationLaunch(url);
		   utils.ss("launch");

	}

	@When("Click On Create New Account")
	public void click_on_create_new_account() {
		utils.button(acl.getCreateaccount());
		 utils.ss("create account");
		 utils.currentTab();

	}

	@When("user enter firstname one dim value")
	public void user_enter_firstname_one_dim_value(io.cucumber.datatable.DataTable dataTable) {
		List<String> list= dataTable.asList();
		  String username=list.get(0);
		  wait.until(ExpectedConditions.elementToBeClickable(acl.getFirstname()));
		  utils.sendkey(acl.getFirstname(), username);
		  utils.ss("firstname");
		  String fn=utils.getText(acl.getFirstname());
		  System.out.println(fn);

	}

	@When("user enter lastname one dim value")
	public void user_enter_lastname_one_dim_value(io.cucumber.datatable.DataTable dataTable) {
		List<String> list= dataTable.asList();
		  String last=list.get(0);
		  wait.until(ExpectedConditions.elementToBeClickable(acl.getLastname()));
		  utils.sendkey(acl.getLastname(), last);
		  utils.ss("lastname");

	}

	@When("user enter DOB one dim value")
	public void user_enter_dob_one_dim_value(io.cucumber.datatable.DataTable dataTable) {
		wait.until(ExpectedConditions.elementToBeClickable(acl.getDate()));
		  acl.getDate().click();  
		List <String> date =dataTable.asList();
		String date1 = date.get(0);
		utils.dropdown(date1, acl.getDate());
		 WebElement dob1=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		    wait.until(ExpectedConditions.elementToBeClickable(acl.getMonth()));
		    acl.getMonth().click();
			List <String> month =dataTable.asList();
			String month1 = month.get(1);
			utils.dropdown(month1, acl.getMonth());
			 WebElement dob2=driver.findElement(By.xpath("//select[@title=\"Year\"]"));
			    wait.until(ExpectedConditions.elementToBeClickable(acl.getYear()));
			    acl.getYear().click();
				List <String> year =dataTable.asList();
				String year1 = year.get(2);
				utils.dropdown(year1, acl.getYear()) ;

	}

	@When("user enter gender")
	public void user_enter_gender(io.cucumber.datatable.DataTable dataTable) {
		List<String> gender= dataTable.asList();
		  String gender1=gender.get(1);
		  wait.until(ExpectedConditions.elementToBeClickable(acl.getGender()));
		  utils.button(acl.getGender());

	}

	@When("user enter email id")
	public void user_enter_email_id(io.cucumber.datatable.DataTable dataTable) {
		List<String> gmail= dataTable.asList();
		  String gmail1=gmail.get(0);
		  wait.until(ExpectedConditions.elementToBeClickable(acl.getEmail()));
		  utils.sendkey(acl.getEmail(), gmail1);

	}

	@When("user enter password")
	public void user_enter_password(io.cucumber.datatable.DataTable dataTable) {
		List<String> pass= dataTable.asList();
		  String pass1=pass.get(0);
		  wait.until(ExpectedConditions.elementToBeClickable(acl.getPassword()));
		  utils.sendkey(acl.getPassword(), pass1);

	}

	@When("user close browser")
	public void user_close_browser() {
	//	utils.browserclose();
	}

}
