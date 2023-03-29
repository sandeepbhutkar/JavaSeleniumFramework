Feature: Google Search

  Scenario: Verify Google Search
    Given browser is open
    And user is on Google Page
    When user enters a text in search box
    And user click on search button
    Then search results are displayed
