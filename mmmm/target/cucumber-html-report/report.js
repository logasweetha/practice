$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("form.feature");
formatter.feature({
  "line": 1,
  "name": "create user account details",
  "description": "",
  "id": "create-user-account-details",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "give valid credential",
  "description": "",
  "id": "create-user-account-details;give-valid-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "fill the form",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "logged in with given details",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.launch_the_browser()"
});
formatter.result({
  "duration": 38793045200,
  "status": "passed"
});
formatter.match({
  "location": "Step.fill_the_form()"
});
formatter.result({
  "duration": 22653625100,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//label[contains(text(),\u0027Single\u0027)]\"}\n  (Session info: chrome\u003d80.0.3987.162)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027DESKTOP-351MDAF\u0027, ip: \u0027192.168.43.125\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.162, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\RATHISH\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:54247}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d651087481c5c9c6c615494f9b745555\n*** Element info: {Using\u003dxpath, value\u003d//label[contains(text(),\u0027Single\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepDef.Step.fill_the_form(Step.java:51)\r\n\tat ✽.When fill the form(form.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Step.logged_in_with_given_details()"
});
formatter.result({
  "status": "skipped"
});
});