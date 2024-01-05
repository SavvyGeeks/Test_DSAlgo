Feature: H)To test the Queue page



 Scenario Outline: Enter user name and password to sign in
    Given User is on home page and click SignIn button
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to home page and see success message
    Examples:
      | sheetName | rowNumber |
	      | signIn    | 0         |

  Scenario: User enters Queue Page
    When User click the GetStared button under Queue subtitle
    Then User Navigate to Queue Page
    #---------------------------------- link 1: Implementation of Queue in Python---------------------------------------------------------
    When User clicks Implimentation of Queue in Python
    Then User Navigate to the Implimentation of Queue in Python

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

  #--------------------------------------------- Link 2: Implementation using collections.deque---------------------------------------------------
  Scenario: User in Implementation using collections.deque in Queue
    When User clicks Implimentation Using Collections.dqeque
    Then User Navigate to the Implimentation Using Collections.dqeque

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

  #----------------------------------------- Link 3: Implementation using Array -------------------------------------------------------------
  Scenario: When User clicks Implimentation Using Array
    Then User Navigate to the Implimentation Array

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

  #--------------------------------------------- Link 4: Queue Operations ---------------------------------------------------------------------
  Scenario: When User clicks Queue Operations
    Then User Navigate to the Queue Operations

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

  #------------------------------------- practice Question -----------------------------------------------------------------------
  Scenario: User in Queue practice Question
    When User clicks Queue Practice Questions
    Then User Navigate to the Queue Practice Questions
    Then It Displays Null
    And User Back to Queue Page
   
   
    Scenario: User click on Signout
		When when user completes all operations
		Then User click on Signout
    