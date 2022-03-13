Feature: Ebay search functionality

  Scenario: Search for iMac 2020
    Given user is on ebay homepage
    When user searches for iMac 2020
    Then user sees results about iMac only
    And there are more than 3 pages of results