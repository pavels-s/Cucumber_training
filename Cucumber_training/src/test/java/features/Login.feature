Feature: Application Login

Background:
Given Validate the browser
When Browser is triggered
Then Check if browser is started


@RegTest
Scenario: Home page default login
Given User is on banking landing page
When User login into application with username "Jihn" and password "123"
Then Home page is populated
And Cards displayed "true"


@RegTest
Scenario: Home page login negative scenario
Given User is on banking landing page
When User login into application with username "John" and password "125"
Then Home page is populated
And Cards displayed "false"


@RegTest
Scenario: Home page login with additional credentials
Given User is on banking landing page
When User login into application with following details
| Jenny | pass11 | jenny001@example.com | Australia |
Then Home page is populated
And Cards displayed "true"


@SmokeTest
Scenario Outline: Home page login with different credentials
Given User is on banking landing page
When User login into application with many <Username> and <Password>
Then Home page is populated
And Cards displayed "true"

Examples:
| Username | Password |
| user1    | pass1    |
| user2    | pass2    |
| user3    | pass3    |
| user4    | pass4    |