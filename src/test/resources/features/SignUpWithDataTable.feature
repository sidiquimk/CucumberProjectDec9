Feature: SignUp

  Scenario: SignUp with data table
    Given I open Browser
    And I navigate to the FreeCRM
    And I click on signUp button
    When I register to account
      | Edition      | fName    | lName   | email               | confirmEmail        | uName     | password      | confirmPassword |
      | Free Edition | Mohammad | Sidiqui | msidiqui@gmail.com  | msidiqui@gmail.com  | msidiqui  | msidiqui1234  | msidiqui1234    |
      | Free Edition | Daniel   | Sidiqui | dsidiqui@gmail.com  | dsidiqui@gmail.com  | dsidiqui  | dsidiqui1234  | dsidiqui1234    |
      | Free Edition | Daniel2  | Sidiqui | dsidiqui2@gmail.com | dsidiqui2@gmail.com | dsidiqui2 | dsidiqui12342 | dsidiqui12342   |
    Then I close my browser
