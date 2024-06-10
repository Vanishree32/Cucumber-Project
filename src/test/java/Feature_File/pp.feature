Feature: search & see the results

@TCS2
Scenario Outline: working of search field
Given User is at Home page of amazon
When user is searching <Name>
Then validate the   <Name> in search results

Examples:
| Name |
|Samsung |
|Nothing|
|Realme |