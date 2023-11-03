Feature: Register page of ParaBank

@ValidCredentials
Scenario: Checking register

Given Give Url
When Giving firstname and lastname
And Giving address and city
And Giving state and zipcode
And Giving phone number and ssn
And Giving username,password and confirm password
Then Click register button
