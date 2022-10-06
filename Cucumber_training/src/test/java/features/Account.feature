Feature: Application Login


Scenario: Home page default login
Given User is on banking landing page
When User login into application with username "Jihn" and password "123"
Then Home page is populated
And Cards displayed "true"