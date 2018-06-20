$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WiproLogIn.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Md Shohid H patoary"
    }
  ],
  "line": 3,
  "name": "Wipro Log In Smoke Test Scenerio",
  "description": "Description: I am able to login mywipro.com with valid credintiales and able to display Mywipro Home",
  "id": "wipro-log-in-smoke-test-scenerio",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@loginTest"
    }
  ]
});
formatter.before({
  "duration": 9980192832,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "Open firefox and start application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTestStepDef.open_firefox_and_start_application()"
});
formatter.result({
  "duration": 9095494514,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Homepage Validation",
  "description": "",
  "id": "wipro-log-in-smoke-test-scenerio;homepage-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I Click my account",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Enter Valid User Id",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Enter Valid Password",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click Login Btn",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should be able to see Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDef.i_Click_my_account()"
});
formatter.result({
  "duration": 2445594992,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDef.enter_Valid_User_Id()"
});
formatter.result({
  "duration": 77512488,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDef.enter_Valid_Password()"
});
formatter.result({
  "duration": 65732985,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDef.i_click_Login_Btn()"
});
formatter.result({
  "duration": 73796264,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDef.i_should_be_able_to_see_Homepage()"
});
formatter.result({
  "duration": 793048027,
  "status": "passed"
});
formatter.after({
  "duration": 465960352,
  "status": "passed"
});
});