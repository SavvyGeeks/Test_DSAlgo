
Feature: Stack Homepage


 Scenario Outline: Enter user name and password to sign in
    Given User is on home page and click SignIn button
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to home page and see success message
    Examples:
      | sheetName | rowNumber |
	      | signIn    | 0         |

    Scenario: User entering into Stack Page
    Given The user is in the Home page
    When The user clicks on get started button
    Then The user will be directed to Stack Page
    Given The user clicks on Operations in Stack link
    
     Scenario: Try here Valid Data
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 0
    Then The User Enter Python valid data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    And It Display vaild message 

  Scenario: Try here Invalid Data
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 1
    Then The User Enters Invalid Python data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    Then The user gets an error message
    
   Scenario:the The User Clicks Implementation link in stack
    When The user clicks the Implementation link
    Then user nagivates to Implementation page
    
    Scenario: Try here Valid Data
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 0
    Then The User Enter Python valid data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    And It Display vaild message 

  Scenario: Try here Invalid Data
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 1
    Then The User Enters Invalid Python data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    Then The user gets an error message
    
    
    Scenario: The user clicks the Applications link in Stack
    When The user clicks the Applications link
    Then user navigates to Application link page
    
     Scenario: Try here Valid Data
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 0
    Then The User Enter Python valid data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    And It Display vaild message 

  Scenario: Try here Invalid Data
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 1
    Then The User Enters Invalid Python data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    Then The user gets an error message
    
    Scenario: User Navigates to Practice questions in Stack
    When The user clicks on to the Practice Questions link
    Then The user will be directed to practice questions of stack Page
    
    
        Scenario: User click on Signout
		When when user completes all operations
		Then User click on Signout
    
   