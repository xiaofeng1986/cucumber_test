$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/hellocucumber/test.feature");
formatter.feature({
  "name": "Is it Friday yet?",
  "description": "  Everybody wants to know when it\u0027s Friday",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sunday isn\u0027t Friday",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "today is Sunday",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefs.today_is_Sunday()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I ask whether it\u0027s Friday yet",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.i_ask_whether_it_s_Friday_yet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be told \"Nope\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.i_should_be_told(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003cNope\u003e but was:\u003cnull\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat hellocucumber.Stepdefs.i_should_be_told(Stepdefs.java:33)\r\n\tat ✽.I should be told \"Nope\"(file:src/test/resources/hellocucumber/test.feature:7)\r\n",
  "status": "failed"
});
});