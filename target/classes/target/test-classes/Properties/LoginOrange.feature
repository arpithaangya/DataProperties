Feature: Login for OrangeHrm

Scenario: Login with given username and password
Given User is on Login page Url
When User gives username and password
And User clicks on login 
Then User successfully logged in 