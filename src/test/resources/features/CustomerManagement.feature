@customerManagementTest
Feature:Customer Management

@newCustomerBTNTest
Scenario: As a user when I navigate to the Customers Tab, I should see New customer button.
 Given As an entity user, I am logged in
 When i Navigate to the Customer tab 
 Then i should see New customer button Displayed 
 
 @newCustomerBasicInfo
 Scenario: As a user when I navigate to the Customers Tab and Click on New customer button, I should see the basic information form label.
 Given I am on the crater login page at http://crater.primetech-apps.com/login.
 When I enter the credentials: Email dummy@primetechschool.com password primetech@school.
 And I click the login button 
 And i navigate to the customer tab
 And I click on the New customer button 
 Then i should see the Basic info form label
 
 
 @newCustomerBasicInfoFields
Scenario: As a user when I navigate to the Customers Tab and click on New customer button, I should see the Basic Info fields
Given As an entity user, I am logged in
When I navigate to the customers tab
And I click on the New Customer button
Then I should see the Basic Info form label
And I should see the fields Display Name, Primary Contact Name, Email, Primary Currency, Website, and Prefix

@newCustomerTableList
Scenario: As a user when I navigate to the Customers Tab, I should see the Customers Table List
Given As an entity user, I am logged in
When I navigate to the customers tab
Then I should see the Customer List Table


