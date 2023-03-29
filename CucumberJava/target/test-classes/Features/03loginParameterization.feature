Feature: Login Parameterization

  @lp
  Scenario Outline: Verify valid login
    Given user opens browser
    And user is on sauce login page
    When user enter <username> and <password>
    And user click on login button
    Then user is logged in successfully

    Examples: 
      | username | password |
      | standard_user | secret_sauce |
      | locked_out_user | secret_sauce |
