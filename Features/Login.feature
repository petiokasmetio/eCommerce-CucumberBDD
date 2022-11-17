Feature: Login

  Scenario: Successful Login with valid credentials
    Given User launch Chrome browser
    When User open URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    When User enter Email "admin@yourstore.com" and Password "admin"
    When Click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
    Then User click on logout link
    Then Page title should be "Your store. Login"
    Then close browser