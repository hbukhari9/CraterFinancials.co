Feature: User management

  @invalidEmailLogin
  Scenario: Invalid email login attempts
    Given As a user, I am on the login page
    When I enter invalid user name and valid password
    And Click on login button
    Then I should see an error message "These credentials do not match our records." displays
    And I should not be logged in

    @Homework
    Scenario: valid email login attempts
    Given As a user, I am on the login page for the homework url
    When I enter user name and password 
    And Click on login button
    Then I  Navigate to the customers tab
    And  I Click the new customer button
    And I Enter a 2 character Display Name and valid Email
    And I click on save customer button 
    Then customer created success massage displays
    
    
    @Homework2
    Scenario: No display name attempt
    Given As a user, I am on the login page for the homework url
    When I enter user name and password 
    And Click on login button
    Then I  Navigate to the customers tab
    And  I Click the new customer button
    And I Enter no Display Name and valid Email
    And I click on save customer button 
    Then display name requid field missing error massage displays
    
     @Homework3
    Scenario: display name no email attempt
    Given As a user, I am on the login page for the homework url
    When I enter user name and password 
    And Click on login button
    Then I  Navigate to the customers tab
    And  I Click the new customer button
    And I Enter a 2 character Display Name and no email
    And I click on save customer button 
    Then customer created success massage displays
    
    