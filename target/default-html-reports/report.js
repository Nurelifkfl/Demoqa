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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"Thanks for submitting the form\"}\n  (Session info: chrome\u003d92.0.4515.131)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Nurs-MacBook-Air.local\u0027, ip: \u0027fe80:0:0:0:8e6:238e:ce0b:8726%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 92.0.4515.131, chrome: {chromedriverVersion: 92.0.4515.107 (87a818b10553..., userDataDir: /var/folders/z2/yl62y0jj30b...}, goog:chromeOptions: {debuggerAddress: localhost:52015}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: c32a9a4f8be540015d2c8509e3f0e5fc\n*** Element info: {Using\u003dlink text, value\u003dThanks for submitting the form}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat com.demoqa.stepDefinitions.submitFormStepDef.user_should_be_able_to_submit_form(submitFormStepDef.java:95)\n\tat ✽.user should be able to submit form(file:///Users/nurelifkafali/Desktop/Demoqa/src/test/resources/features/first.feature:6)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});