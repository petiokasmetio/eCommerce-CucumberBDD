package StepDefinitions;

import PageObjects.AddCustomer;
import PageObjects.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps extends BaseClass{

    @Given("User launch Chrome browser")
    public void user_launch_chrome_browser() {
        lp = new LoginPage(driver);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @When("User open URL {string}")
    public void user_open_url(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(1000);
    }

    @When("When User enter Email {string} and Password {string}")
    public void when_user_enter_email_and_password(String email, String password) {
        lp = new LoginPage(driver);
        lp.setUserName(email);
        lp.setPassword(password);
    }

    @When("Click on Login")
    public void click_on_login() {
        lp = new LoginPage(driver);
        lp.clickLogin();
    }


    @Then("Page title should be {string}")
    public void page_title_should_be(String homepagetitle) {
        lp = new LoginPage(driver);
        if(driver.getPageSource().contains("Login was unsuccessful."))
        {
            driver.close();
            Assert.fail();
        } else
        {
            Assert.assertEquals(homepagetitle, driver.getTitle());
        }
    }
    @Then("User click on logout link")
    public void user_click_on_logout_link() throws InterruptedException {
        lp = new LoginPage(driver);
        Thread.sleep(1000);
        lp.clickLogout();
    }

    @Then("close browser")
    public void close_browser() {
        driver.close();
    }

    //Add customer step definitions
    @Then("User can view Dashboard")
    public void user_can_view_dashboard() {
        ac = new AddCustomer(driver);
        lp = new LoginPage(driver);
        String title = ac.getPageTitle();
    }
    @When("User click on customers Menu")
    public void user_click_on_customers_menu() {

    }
    @When("click on customers Menu item")
    public void click_on_customers_menu_item() {

    }
    @When("click on Add new button")
    public void click_on_add_new_button() {

    }
    @Then("User can view Add new customer page")
    public void user_can_view_add_new_customer_page() {

    }
    @When("User enter customer info")
    public void user_enter_customer_info() {

    }
    @When("click on Save button")
    public void click_on_save_button() {

    }
    @When("User can view confirmation message {string}")
    public void user_can_view_confirmation_message(String string) {

    }
}
