$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/datePicker.feature");
formatter.feature({
  "name": "date picker",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@datePicker"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to set the date from the date picker",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@datePicker"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the date-picker page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.demoqa.stepDefinitions.datePickerStepDef.user_is_on_the_date_picker_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select a date from date picker field",
  "keyword": "When "
});
formatter.match({
  "location": "com.demoqa.stepDefinitions.datePickerStepDef.user_select_a_date_from_date_picker_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to see one month from todays date",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.stepDefinitions.datePickerStepDef.user_should_be_able_to_see_one_month_from_todays_date()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});