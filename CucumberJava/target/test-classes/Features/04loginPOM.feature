Feature: Login Parameterization

  @lp
  Scenario Outline: Verify valid login
    Given user opens browser1
    And user is on sauce login page1
    When user enter credentials
    And user click on login button1
    Then user is logged in successfully1
