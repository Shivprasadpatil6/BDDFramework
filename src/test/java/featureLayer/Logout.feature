Feature: Logout Feature
@SanityTesting @SmokeTesting
Scenario: Verify user is logout from application
Given Launch the Browser and Open url
When Enter Username and Password and Click on login button
And click on menu button
And click on logout button
Then user is logout out
