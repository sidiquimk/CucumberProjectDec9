$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Valid Login",
  "description": "",
  "id": "loginfeature;valid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navagate to the FreeCrm",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I enter valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_open_browser()"
});
formatter.result({
  "duration": 6109394034,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_navagate_to_the_FreeCrm()"
});
formatter.result({
  "duration": 1720132873,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_enter_valid_username_and_password()"
});
formatter.result({
  "duration": 1144276372,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_login_button()"
});
