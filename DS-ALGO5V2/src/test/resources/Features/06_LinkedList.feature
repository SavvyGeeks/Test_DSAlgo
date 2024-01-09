Feature: Linked List Homepage


  Scenario Outline: Enter user name and password to sign in
    Given User is on home page and click SignIn button
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to home page and see success message
    Examples:
      | sheetName | rowNumber |
	      | signIn    | 0         |

  Scenario: The user enters Linked List Page
    When User click the GetStared button under Linked List subtitle
    Then User Navigates to Linked List overview
    When User click on Introduction link
    Then Navigates to Introduction Page in Linked List


Scenario: The user clicks TryHere button with valid Text
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 0
    Then The User Enter Python valid data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    And It Display vaild message

  Scenario: The user clicks TryHere button with Ivalid Text and Error message
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 1
    Then The User Enters Invalid Python data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    Then The user gets an error message
 
 
  Scenario: The user enters Creating Linked LIst in Linked List
    Given User click on Creating Linked LIst
    Then Naviagates to Creating Linked LIst page

Scenario: The user clicks TryHere button with valid Text
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 0
    Then The User Enter Python valid data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    And It Display vaild message

  Scenario: The user clicks TryHere button with Ivalid Text and Error message
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 1
    Then The User Enters Invalid Python data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    Then The user gets an error message



 Scenario: The user enters Types of Linked List in Linked List
    Given User click on Types of Linked List
    Then Naviagates to Types of Linked List page


Scenario: The user clicks TryHere button with valid Text
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 0
    Then The User Enter Python valid data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    And It Display vaild message

  Scenario: The user clicks TryHere button with Ivalid Text and Error message
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 1
    Then The User Enters Invalid Python data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    Then The user gets an error message



Scenario: The user enters Implement Linked List in Pythonin Linked List
    Given User click on Implement Linked List in Python
    Then Naviagates to Implement Linked List in Python page

Scenario: The user clicks TryHere button with valid Text
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 0
    Then The User Enter Python valid data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    And It Display vaild message

  Scenario: The user clicks TryHere button with Ivalid Text and Error message
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 1
    Then The User Enters Invalid Python data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    Then The user gets an error message


Scenario: The user enters Traversal Linked List
    Given User click on Traversal in Python
    Then Naviagates to Traversal page


Scenario: The user clicks TryHere button with valid Text
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 0
    Then The User Enter Python valid data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    And It Display vaild message

  Scenario: The user clicks TryHere button with Ivalid Text and Error message
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 1
    Then The User Enters Invalid Python data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    Then The user gets an error message


Scenario: The user enters Insertion Linked List
    Given User click on Insertion in Python
    Then Naviagates to Insertion page


Scenario: The user clicks TryHere button with valid Text
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 0
    Then The User Enter Python valid data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    And It Display vaild message

  Scenario: The user clicks TryHere button with Ivalid Text and Error message
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 1
    Then The User Enters Invalid Python data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    Then The user gets an error message


Scenario: The user enters Deletion Linked List
    Given User click on Deletion in Python
    Then Naviagates to Deletion page


Scenario: The user clicks TryHere button with valid Text
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 0
    Then The User Enter Python valid data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    And It Display vaild message

  Scenario: The user clicks TryHere button with Ivalid Text and Error message
    Given The User navigates to Try EditorPage
    When User enters python code sheetname "Python_Code" and rownumber 1
    Then The User Enters Invalid Python data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    Then The user gets an error message

Scenario: The user enters Practice Questions in  Linked List
    Given User click on Practice Questions 
    Then Naviagates to Practice Questions page

 
    Scenario: User click on Signout
		When when user completes all operations
		Then User click on Signout
    
    
    
