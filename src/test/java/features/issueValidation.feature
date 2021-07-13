Feature: Validating Create an issue
@issue
Scenario: Verify if user can create an issue add comment and attachment
Given User can login with admin credentials using post method
And Create new issue using post method
And Add comment on issue
Then Add attachment using post method