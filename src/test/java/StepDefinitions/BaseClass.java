package StepDefinitions;

import PageObjects.AddCustomer;
import PageObjects.LoginPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class BaseClass {

    public WebDriver driver;
    public LoginPage lp;
    public AddCustomer ac;

    public static String randomStringGenerator()
    {
        return (RandomStringUtils.randomAlphabetic(5));
    }


}
