package step.definition;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DemoBlazeHomePage;
import pages.DemoBlazeLoginPage;
import utilities.BrowserUtil;
import utilities.WebActions;

public class MySteps {
	RemoteWebDriver driver;
	
	@Given("User will open the broswer")
	public void user_will_open_the_broswer() {
	    driver=BrowserUtil.getDriver();
	}

	@When("User navigated to DemoBlaz Applicaiton URL")
	public void user_navigated_to_demo_blaz_applicaiton_url() {
	    WebActions.openUrl(driver, "https://demoblaze.com/index.html");
	}

	@When("User click on Login link")
	public void user_click_on_login_link() {
	    DemoBlazeHomePage homePage=new DemoBlazeHomePage(driver);
	    homePage.clickOnLoginLink();
	}

	@When("User enters user name {string} and password as {string}")
	public void user_enters_user_name_ptan_and_password_as(String userName, String password) {
		DemoBlazeLoginPage loginPage=new DemoBlazeLoginPage(driver);
		loginPage.setUserName(userName);
		loginPage.setUserName(password);
	}

	@When("click on Login button")
	public void click_on_login_button() {
		DemoBlazeLoginPage loginPage=new DemoBlazeLoginPage(driver);
		loginPage.clickLoginButton();
	}

	@Then("the home page is displayed")
	public void the_home_page_is_displayed() {
		DemoBlazeHomePage homePage=new DemoBlazeHomePage(driver);
		boolean flag=homePage.isLogoutLinkDisplayed();
		Assert.assertEquals(flag, true);
		
	}


}
