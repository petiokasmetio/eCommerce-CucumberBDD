package StepDefinitions;

import PageObjects.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFeature_steps {

    public WebDriver driver;
    public LoginPage lp;

    @Given("User launch Chrome browser")
    public void user_launch_chrome_browser() {
        lp = new LoginPage(driver);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @When("User open URL {string}")
    public void user_open_url(String url) {
        driver.get(url);
    }

    @When("User enter Email {string} and Password {string}")
    public void userEnterEmailAndPassword(String email, String password){
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
    public void user_click_on_logout_link() {
        lp = new LoginPage(driver);
        lp.clickLogout();
    }
    @Then("close browser")
    public void close_browser() {
        driver.close();
    }
}
