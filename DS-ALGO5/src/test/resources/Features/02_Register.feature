
Feature: Title of your feature   I want to use this template for my feature file


  Scenario: User launch home page of an dsalgo project
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage
  
  
  @Register2
  Scenario: Registration scenario
    Given The user is in Ds-algo home  page
    Given Clicks on the Register button
    Then User is taken to the Registration page
    When User clicks Register button with all fields empty
    Then It should display an error-Please fill out this field, below Username textbox
    When The user clicks Register button after entering Username with other fields empty
    Then It should display an error -Please fill out this field, below Password textbox
    When The user clicks Register button after entering Username and password with Password Confirmation field empty
    Then It should display an error-Please fill out this field, below Password Confirmation textbox
    When The user enters a name with characters other than Letters, digits and special characters like @, ., +, -, _
   Then It should display an error message- Please enter a valid username
   When The user clicks Register button after entering different passwords in Password and Password Confirmation fields
    Then It should display an error message-password_mismatch:The two password fields did not match.
    When The user enters a Password with less than eight characters
    Then It should display an error message-Password should contain atleast eight characters
    When User enters valid username, password, password confirmation and clicks on Register button
    Then The user should be redirected to Homepage with the message -New Account Created. You are logged in as <username>
    When   The user enters a valid existing <username> with <password> and <password confirmation>
    Then The user displays error message "you are already logged in"