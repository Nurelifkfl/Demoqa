@wip @dragAndDrop
Feature: drag and drop
  Scenario: User should be able to drag and drop the element
    Given user is on the droppable page
    When user drag and drop the element into the specified area
    Then user should be able to drag and drop successfully