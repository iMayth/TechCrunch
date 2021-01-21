Feature: User should be able to go to main page and verify image and author
  @assignment
  Scenario: Go to https://techcrunch.com/
    Given the user is on the main page
    When  the user checks the latest news
    Then  the user should be able to see each news has an author
    And   the user should be able to see each news has an image

