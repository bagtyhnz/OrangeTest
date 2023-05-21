Feature: Google Search

  Scenario: Verify search results count is ok
    Given I am on the Google homepage
    When I search for "Apple"
    Then the number of search results should be more than 100000

  Scenario: Verify search results count is not less than minimum
    Given I am on the Google homepage
    When I search for "Apple"
    Then the number of search results should not be less than 10000
