Feature: Login page of ParaBank Application




Scenario Outline: Checking credentials on Login

Given  login page URL
When User enters username as "<uname>"
And User enters password as "<pass>"
And User clicks login 
Then User will login or fails

Examples:
				|uname	   |pass	       |
				| Admin1 	 | admin1	     |
				| apps 	   | welcome@123 |