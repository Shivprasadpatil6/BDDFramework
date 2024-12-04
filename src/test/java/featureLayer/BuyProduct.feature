Feature:Buy Feature
@RegressionTesting @SanityTesting
Scenario: Verify user is able to buy product
Given Launch the Browser and Open url
When Enter UserName and Password and Click on login button
Then User is logged in
When user is on homepage and clicked on any of product
And  click on add to cart 
And  user clicks on cart link and checkout button
And  user enter details and clicked on continue button
And user clicks on finish
When Order get placed

