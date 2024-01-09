Feature: Arrays Homepage

  Scenario Outline: Enter user name and password to sign in
    Given User is on home page and click SignIn button
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to home page and see success message

    Examples: 
      | sheetName | rowNumber |
      | signIn    |         0 |

  Scenario: The user enters Array Page
    When User click the GetStared button under Array subtitle
    Then User Navigates to Array overview
    When User click on Array in Python
    Then Navigates to Array in Python

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

  Scenario: The user enters Array Using List
    Given User click on Arrays Using List
    Then Naviagates to Arrays Using List

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

  Scenario: The user enters Basic Operations in Lists in Array
    Given User click on Basic Operations in Lists
    Then Naviagates to Basic Operations in Lists

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

  Scenario: The user  Applications of Array in Arrays
    Given User click on Applications of Array
    Then Naviagates to Applications of Array

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

  Scenario: The user is able to navigate to Practice Question page from Search the array link With Valid Python code
    Given The user is on the "Practice Questions" after logged in
    When The user clicks the Search the array link
    Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons
    When User enters python code sheetname "Python_Code" and rownumber 2
    Then The User Enter Python valid data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    And It Display vaild message

  Scenario: The user is able to navigate to Practice Question page from Search the array link With InValid Python code
    When The user clicks the Search the array link
    When User enters python code sheetname "Python_Code" and rownumber 1
    Then The User Enters Invalid Python data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    Then The user gets an error message

  Scenario: The user is able to navigate to Practice Question page from Max Consicutive ones Link With Valid Python code
    When The user clicks the Max Consicutive ones
    Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons
    When User enters python code sheetname "Python_Code" and rownumber 4
    Then The User Enter Python valid data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    And It Display vaild message

  Scenario: The user is able to navigate to Practice Question page from Search Max Consicutive ones Link With InValid Python code
    When The user clicks the Max Consicutive ones
    When User enters python code sheetname "Python_Code" and rownumber 1
    Then The User Enters Invalid Python data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    Then The user gets an error message

  Scenario: The user is able to navigate to Practice Question page from Search the Find numbers with Even Number Of Digits  With Valid Python code
    When The user clicks the Find numbers with Even Number Of Digits
    Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons
    When User enters python code sheetname "Python_Code" and rownumber 6
    Then The User Enter Python valid data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    And It Display vaild message

  Scenario: The user is able to navigate to Practice Question page from Search the Find numbers with Even Number Of Digits  With InValid Python code
    When The user clicks the Find numbers with Even Number Of Digits
    When User enters python code sheetname "Python_Code" and rownumber 1
    Then The User Enters Invalid Python data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    Then The user gets an error message

  Scenario: The user is able to navigate to Practice Question page from Search the Squres Of A Sorted Array  With Valid Python code
    When The user clicks the Squres Of A Sorted Array
    Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons
    When User enters python code sheetname "Python_Code" and rownumber 8
    Then The User Enter Python valid data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    And It Display vaild message

  Scenario: The user is able to navigate to Practice Question page from Search the Squares Of A Sorted Array  With InValid Python code
    When The user clicks the Squres Of A Sorted Array
    When User enters python code sheetname "Python_Code" and rownumber 1
    Then The User Enters Invalid Python data"<pythonCode>" in to the TextArea
    Then User click on RunButton
    Then The user gets an error message

  Scenario: User click on Signout
    When when user completes all operations
    Then User click on Signout
