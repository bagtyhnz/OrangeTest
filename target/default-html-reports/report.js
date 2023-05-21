$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/search.feature");
formatter.feature({
  "name": "Google Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify search results count is ok",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Google homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "step_defs.searchStepDefs.i_am_on_the_Google_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"Apple\"",
  "keyword": "When "
});
formatter.match({
  "location": "step_defs.searchStepDefs.i_search_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the number of search results should be more than 100000",
  "keyword": "Then "
});
formatter.match({
  "location": "step_defs.searchStepDefs.the_number_of_search_results_should_be_more_than(long)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify search results count is not less than minimum",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Google homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "step_defs.searchStepDefs.i_am_on_the_Google_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"Apple\"",
  "keyword": "When "
});
formatter.match({
  "location": "step_defs.searchStepDefs.i_search_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the number of search results should not be less than 10000",
  "keyword": "Then "
});
formatter.match({
  "location": "step_defs.searchStepDefs.the_number_of_search_results_should__not_be_less_than(long)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});