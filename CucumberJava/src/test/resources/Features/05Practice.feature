@tag
Feature: To Verify Login of Orange Page

  @tag1
  Scenario: Verify Login Success
    Given I open orangeHRM url
    When I Enter <username> and <password>
    And I click on login button
    Then I login to app successfully
    Examples:
    |username|password|
    |Admin|admin123|
    |Admin|admin123|

