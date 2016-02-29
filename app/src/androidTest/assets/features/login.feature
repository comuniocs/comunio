Feature: Login
In order to secure my apk,
as a business owner,
I want to implement login functionality
 
Background: Given I am on login page
 
Scenario Outline: Check user's login credentials
Given I have a Login
And I filled <username> and <password>
When I clicked on Login
Then I should see <success or failure> message
 
Examples: Valid login
| username | password | success or failure |
| admin    | admin    | success            |
 
Examples: InValid login
| username | password | success or failure |
| admin    |          | failure            |
