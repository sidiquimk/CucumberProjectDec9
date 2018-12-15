Feature: LoginFeature3

Scenario: Valid Login3
Given I open browser3
And I navagate to the FreeCrm3
When I enter "sidiquimk" and "sidiquimk@123"
And I click login button3
Then I successfully logged in3
And I close browser


Scenario: Invalid Login3
Given I open browser3
And I navagate to the FreeCrm3
When I enter "sidiquimkX" and "sidiquimk@123X"
And I click login button3
Then I see error message
And I close browser



Scenario: Invalid Login3b
Given I open browser3
And I navagate to the FreeCrm3
When I enter "sidiquimk" and "sidiquimk@123X"
And I click login button3
Then I see different error message
And I close browser