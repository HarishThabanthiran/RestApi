Feature: Basic Requests

  Scenario Outline: Get Request
    Given The user is using the base URI
    When The user makes a GET call using the "<I_D>"
    Then The user checks for the status code "200"

    Examples: 
      | I_D |
      |   1 |
      |   2 |
      |   3 |
      |  20 |
