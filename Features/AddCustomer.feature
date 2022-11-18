Feature: AddCustomer
Scenario: Add new customer
  Given User launch Chrome browser
  When User open URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
  When When User enter Email "admin@yourstore.com" and Password "admin"
  When Click on Login
  Then User can view Dashboard
  When User click on customers Menu
  And click on customers Menu item
  And click on Add new button
  Then User can view Add new customer page
  When User enter customer info
  And click on Save button
  And User can view confirmation message "The new customer has been added successfully."
  And close browser
