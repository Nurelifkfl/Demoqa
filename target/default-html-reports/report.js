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
  "status": "skipped"
});
formatter.step({
  "name": "user is on the tool-tips page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user hover over the button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user hover over the field",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should be able to hover over successfully",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});