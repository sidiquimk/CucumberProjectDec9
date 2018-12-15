Feature: signUp

  Scenario Outline: SignUp without keyword example
    Given I open browser A
    And I navagate to the FreeCrm A
    And I click on SignUp A
    And I select Free Edition A
    When I enter "<firstName>" and "<lastName>" and "<email>" and "<confirmEmail>" A
    And I enter credentials "<userName>" and "<Password>" and "<confirmPassword>" A
    And I check conditions and click submit A
    Then I enter company information "<company>" and "<phone>" A
    And I click on continue 4
    Then I click on complete registration A
    Then I close browser A

    Examples: 
      | firstName | lastName | email          | confirmEmail   | userName   | Password | confirmPassword | company | phone      |
      | John      | Doe      | jdoe@gmail.com | jdoe@gmail.com | sidiquimk4 | jdoe1234 | jdoe1234        | Syntax  | 1234567890 |
      | Jammes    | Doe      | jdoe@gmail.com | jdoe@gmail.com | sidiquimk5 | jdoe1234 | jdoe1234        | Syntax  | 1234567890 |
      | Johnny    | Doe      | jdoe@gmail.com | jdoe@gmail.com | sidiquimk6 | jdoe1234 | jdoe1234        | Syntax  | 1234567890 |
