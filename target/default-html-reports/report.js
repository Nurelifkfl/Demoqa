$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/dragAndDrop.feature");
formatter.feature({
  "name": "drag and drop",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@dragAndDrop"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to drag and drop the element",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dragAndDrop"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the droppable page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.demoqa.stepDefinitions.dragAndDropStepDef.user_is_on_the_droppable_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user drag and drop the element into the specified area",
  "keyword": "When "
});
formatter.match({
  "location": "com.demoqa.stepDefinitions.dragAndDropStepDef.user_drag_and_drop_the_element_into_the_specified_area()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to drag and drop successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.stepDefinitions.dragAndDropStepDef.user_should_be_able_to_drag_and_drop_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});