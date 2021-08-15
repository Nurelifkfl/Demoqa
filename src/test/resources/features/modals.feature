@closeModals
Feature: close modals
  Scenario: User should be able to close the small modal
    Given user is on the modal-dialogs page
    When user select small modal button
    Then user should be able to close modal