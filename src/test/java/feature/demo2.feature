Feature: Verify the facebook login functionality

Scenario: verify the user is able to see the facebook logo in landing page

Given user navigated to the facebook login page "https://www.facebook.com/"
Then user is able to see the facebook logo

Scenario Outline: Verify the user is able to enter different users cred's in fb login fields

Given user navigated to the facebook login page "https://www.facebook.com/"
When user entered the username<Username> and password<Password>
And clicked on Login
Then user is able to login to fb account

Examples:
|Username|Password|
|user1|123|
|user2|456|
|8790148056|123019290|