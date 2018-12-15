$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Masood Sidiqui/Documents/workspace/CucumberProjectDec9/src/test/resources/features/SignUpWithDataTable.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp",
  "description": "",
  "id": "signup",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "SignUp with data table",
  "description": "",
  "id": "signup;signup-with-data-table",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to the FreeCRM",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I click on signUp button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I register to account",
  "rows": [
    {
      "cells": [
        "Edition",
        "fName",
        "lName",
        "email",
        "confirmEmail",
        "uName",
        "password",
        "confirmPassword"
      ],
      "line": 8
    },
    {
      "cells": [
        "Free Edition",
        "Mohammad",
        "Sidiqui",
        "msidiqui@gmail.com",
        "msidiqui@gmail.com",
        "msidiqui",
        "msidiqui1234",
        "msidiqui1234"
      ],
      "line": 9
    },
    {
      "cells": [
        "Free Edition",
        "Daniel",
        "Sidiqui",
        "dsidiqui@gmail.com",
        "dsidiqui@gmail.com",
        "dsidiqui",
        "dsidiqui1234",
        "dsidiqui1234"
      ],
      "line": 10
    },
    {
      "cells": [
        "Free Edition",
        "Daniel2",
        "Sidiqui",
        "dsidiqui2@gmail.com",
        "dsidiqui2@gmail.com",
        "dsidiqui2",
        "dsidiqui12342",
        "dsidiqui12342"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I close my browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpWithDataTableSteps.i_open_Browser()"
});
formatter.result({
  "duration": 5557531044,
  "status": "passed"
});
formatter.match({
  "location": "SignUpWithDataTableSteps.i_navigate_to_the_FreeCRM()"
});
formatter.result({
  "duration": 4798502164,
  "status": "passed"
});
formatter.match({
  "location": "SignUpWithDataTableSteps.i_click_on_signUp_button()"
});
formatter.result({
  "duration": 1258124244,
  "status": "passed"
});
formatter.match({
  "location": "SignUpWithDataTableSteps.i_register_to_account(DataTable)"
});
formatter.result({
  "duration": 15023732729,
  "status": "passed"
});
formatter.match({
  "location": "SignUpWithDataTableSteps.i_close_my_browser()"
});
formatter.result({
  "duration": 707762329,
  "status": "passed"
});
});