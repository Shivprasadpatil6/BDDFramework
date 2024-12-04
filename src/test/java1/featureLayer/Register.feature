Feature: Register Feature

Scenario Outline: Verify user is register
Given Launch the Browser and Open url
When enter firstname and lastname and phone_number and username and email
|david|warner|8786685217|david124|david@gmail.com|
And enter aboutyourself "<details>" and enter password "<pass>" and confirm_password "<confirm_pass>"
Then user is able to see all details

Examples:
|details|pass|confirm_pass|
|afbjvchvj|Test@abc|Test@abc|