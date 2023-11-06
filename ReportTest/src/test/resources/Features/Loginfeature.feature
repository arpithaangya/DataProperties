Feature: Login for OrangeHrm PAGE

Scenario: Login with given username and password CREDENTIALS
Given User is on Login  Url
When User gives username , password
And User clicks  login 
Then User successfully logged  