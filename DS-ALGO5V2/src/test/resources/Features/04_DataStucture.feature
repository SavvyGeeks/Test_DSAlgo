Feature: Data Structures-Introduction Homepage


 Scenario Outline: Enter user name and password to sign in
    Given User is on home page and click SignIn button
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to home page and see success message
    Examples:
      | sheetName | rowNumber |
	      | signIn    | 0         |


  Scenario: DataStructures
    When User click the GetStared button under Data subtitle
    Then User Navigates to Data Structures-Introduction
    When User click on Time Complexity link
    Then Navigates to Time Complexity link

  Scenario: Try here valid Data
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


Scenario: User click on Signout
		When when user completes all operations
		Then User click on Signout

#Scenario:
      #When User click on Practice Questions link
    #Then Navigates to Practice Questions Page