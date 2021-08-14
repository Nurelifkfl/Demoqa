$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/first.feature");
formatter.feature({
  "name": "submitting form",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to submit information",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the provided page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.demoqa.stepDefinitions.submitFormStepDef.user_is_on_the_provided_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter details",
  "keyword": "When "
});
formatter.match({
  "location": "com.demoqa.stepDefinitions.submitFormStepDef.user_enter_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to submit form",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.stepDefinitions.submitFormStepDef.user_should_be_able_to_submit_form()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});