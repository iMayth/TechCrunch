Feature: User should be able to go to main page and verify title and links
  @assignment
  Scenario: Go to https://techcrunch.com/
    Given the user is on the main page
    When  the user clicks any of the latest news
    Then  the user should be able to see the full content of the latest new
    And   the user should be able to see the browser title is the same with the news title
    And   the user should be able to see the the links within the news content