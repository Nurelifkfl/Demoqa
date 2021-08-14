$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/hoverOver.feature");
formatter.feature({
  "name": "hover over",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@hoverOver"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to hover over the button and the input field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hoverOver"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the tool-tips page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.demoqa.stepDefinitions.hoverOverStepDef.user_is_on_the_tool_tips_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user hover over the button",
  "keyword": "When "
});
formatter.match({
  "location": "com.demoqa.stepDefinitions.hoverOverStepDef.user_hover_over_the_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user hover over the field",
  "keyword": "And "
});
formatter.match({
  "location": "com.demoqa.stepDefinitions.hoverOverStepDef.user_hover_over_the_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to hover over successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.stepDefinitions.hoverOverStepDef.user_should_be_able_to_hover_over_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});