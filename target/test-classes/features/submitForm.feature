
@wip @submitForm
Feature: submitting form

    Scenario Outline: user should be able enter valid details
      Given user is on the provided page
      When user enters "<firstName>" "<lastName>" "<email>" "<gender>" "<mobileNumber>" and other details
      Then user should be able to see submitted form
      Examples:
        | firstName | lastName |  email             | gender | mobileNumber |
        |    Emily  |   Ross   | emilyr@gmail.com   | Female | 1345765432   |
        |    Tom    |   Riddle | triddle@hotmail.com|  Male  | 2763454329   |

  Scenario Outline: negative scenario with invalid credentials
    Given user is on the provided page
    When user enters "<firstName>" "<lastName>" "<email>" "<gender>" "<mobileNumber>" and other details
    Then user should not be able to see submit the form
    Examples:
      | firstName | lastName |   email        | gender | mobileNumber |
      |           |          |  ywery@jsdj.com| Other  |  2665345543  |
      |  253456   |   264655 |   abc@a.com    |        | 2763454329   |
      |           |          |                |        |              |


