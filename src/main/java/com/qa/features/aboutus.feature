Feature: Test About us page

Scenario Outline: Validate About us Page
Given User is in Wikipedia main page
Then user clicks on About Wikipedia link
Then user is able to view About us page
And page contains the below <section>
Examples:
|section|
|"About Wikipedia"|
|"Contributing"|
|"Uses"|