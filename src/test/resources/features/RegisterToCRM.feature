Feature: Register to freeCRM

Scenario: Sign up to freeCRM
Given I open my browser
And navigate to freeCRM
When I click signup
And Fill the form
And I click submit
Then Successfully i register for new account
And i quite browser