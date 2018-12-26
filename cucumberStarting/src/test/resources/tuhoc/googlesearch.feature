Feature: Search from Google 

Scenario: Show result list from google for anh keyword
Given I am staying google.com.vn
When I provide "Testmaster" keyword into search box field
And  I do search
Then I show see the "Trung tâm đào tạo Testmaster" on search result 
