Feature: Application Login

Scenario: Home page default login
Given User is on banking landing page
When User login into application with username "Jihn" and password "123"
Then Home page is populated
And Cards displayed "true"


Scenario: Home page login negative scenario
Given User is on banking landing page
When User login into application with username "John" and password "125"
Then Home page is populated
And Cards displayed "false"


Scenario: Home page login with additional credentials
Given User is on banking landing page
When User login into application with following details
| Jenny | pass11 | jenny001@example.com | Australia |
Then Home page is populated
And Cards displayed "true"