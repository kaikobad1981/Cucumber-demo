Feature: User should be able to login successfully
Description: "user should be able to sign in with valid credential"

Scenario: User able to open the browser successfully
Given User enter the Url "https://www.instagram.com/"
When User enter the email id "kaikobad76@yahoo.com"
And User enter the password "12345678"
Then User login the account and varify page title successfully
