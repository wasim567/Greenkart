Feature: Greenkart app validation

Scenario: Verify user is successsfully navigated to Green kart Landing page

Given user navigated to the Greenkart site "https://rahulshettyacademy.com/seleniumPractise/#/"
Then user is able to validate the Logo


Scenario: Verify the user is able to search the brinjal

Given user navigated to the Greenkart site "https://rahulshettyacademy.com/seleniumPractise/#/"
When user entered the text "brinjal" in search box
Then user is able to see the search result


Scenario: verify the user is able to add the vegetable to the cart

Given user navigated to the Greenkart site "https://rahulshettyacademy.com/seleniumPractise/#/"
When user entered the text "brinjal" in search box
Then user is able to see the search result
When user clicks on Add to cart
And clicks on cart icon
Then the user is able to see the added item in the cart


