@wip @datePicker
Feature: date picker
  Scenario: User should be able to set the date from the date picker
    Given user is on the date-picker page
    When user select a date from date picker field
    Then user should be able to see one month from todays date