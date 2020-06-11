$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/RATHISH/workspace/LOGA/sec/src/main/java/feature/com/baby.feature");
formatter.feature({
  "line": 1,
  "name": "products online",
  "description": "",
  "id": "products-online",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "validate the given details",
  "description": "",
  "id": "products-online;validate-the-given-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "find the required details",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "validated the correct details",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef2.launch_the_browser()"
});
formatter.result({
  "duration": 21874892400,
  "status": "passed"
});
formatter.match({
  "location": "StepDef2.find_the_required_details()"
});
formatter.result({
  "duration": 9492779900,
  "status": "passed"
});
formatter.match({
  "location": "StepDef2.validated_the_correct_details()"
});
formatter.result({
  "duration": 45400,
  "status": "passed"
});
});