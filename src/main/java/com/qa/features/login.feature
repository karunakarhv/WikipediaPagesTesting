Feature:  Wikipedia Login with credentials

Scenario: Wikipedia Login Test Scenario
Given User is on Wikipedia Main Page
Then user clicks on login link
Then title of login page is Wikipedia
Then user enters username and password and click on login button
Then user is on home page
Then close the browser