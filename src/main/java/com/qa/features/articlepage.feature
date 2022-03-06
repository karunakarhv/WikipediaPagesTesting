Feature: Test random articles page

Scenario Outline: Validate Various Articles
Given User is in Current Events Page
When User clicks on <article>
Then title of the page is <article>
Then I should be able to view <article>
Examples:
|article|
|"Multi-sport events"|
|"Cricket"|
|"Association football"|