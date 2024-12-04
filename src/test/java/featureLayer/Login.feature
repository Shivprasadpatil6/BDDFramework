


Feature: LoginTest
@SanityTesting @RegressionTesting
Scenario:Verify login feature with valid cred
Given Launch the Browser and Open url
When Enter UserName and Password and Click on login button
Then User is logged in

Scenario: Verify login feature valid cred by direct Approach
Given Launch the Browser and Open url
When Enter Username as "standard_user" and Password as "secret_sauce" and Click on login button
Then User is logged in

Scenario Outline: Verify login feature valid cred by direct Approach
Given Launch the Browser and Open url
When Enter the Username as "<usernames>" and the Password as "<password>"  and Click on login button
Then User is logged in

Examples:
|usernames|password|
|standard_user|secret_sauce|
|locked_out_user|secret_sauce|
|problem_user|secret_sauce|
|performance_glitch_user|secret_sauce|
|error_user|secret_sauce|
|visual_user|secret_sauce|

@TestTag
Scenario: Verify login feature valid cred by direct Approach
Given Launch the Browser and Open url
When Enter Username as  and Password as  and Click on login button
|standard_user|secret_sauce|
Then User is logged in



