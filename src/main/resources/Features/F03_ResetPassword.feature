@smoke
Feature: user should be able to reset his password

  Scenario: user can reset his password successfully
    Given user navigates to login page
    When user clicks on Forgot password?
    And enter his email address
    Then user should be able to recieve a success message