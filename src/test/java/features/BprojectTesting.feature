Feature: Validating Create a new project
@Addproject
Scenario: Verify if user can successfully create new user
Given User can login with admin credentials using post method
And create new project using post method
Then get all project and show list