Feature: AddCustomer
#Scenario: Add new customer
#  Given User launch Chrome browser
#  When User open URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
#  When When User enter Email "admin@yourstore.com" and Password "admin"
#  When Click on Login
#  Then User can view Dashboard
#  When User click on customers Menu
#  Then Finish
#  Then Click on Add new button
#  Then User can view Add new customer page
#  When User enter customer info
#  When click on Save button
#  When User can view confirmation message "The new customer has been added successfully."
#  When close browser

Scenario: Search Customer By EmailID
  Given User launch Chrome browser
  When User open URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
  When When User enter Email "admin@yourstore.com" and Password "admin"
  When Click on Login
  Then User can view Dashboard
  When User click on customers Menu
  Then Finish
  And Enter customer Email
  When Click on search button
  Then User should found Email in the Search table
  Then close browser
