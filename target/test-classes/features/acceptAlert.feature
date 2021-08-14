@alert
Feature: accept alert
  Scenario: User should be able to accept alert
    Given user is on the alerts page
    When user click the second button
    Then user should be able to accept alert