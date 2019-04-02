@requests
Feature: Basic Requests

  Background: 
    Given The users is using the base URI

  @get
  Scenario Outline: Get Request
    When The users makes a GET call using the "<I_D>"
    Then The users checks for the status code

    Examples: 
      | I_D |
      |   1 |
      |   2 |
      |   3 |
      |  20 |

  @delete
  Scenario Outline: Delete Request
    When The users makes a delete call using the "<I_D>"
    Then The users verifies for the status code

    Examples: 
      | I_D |
      |  20 |

  @post
  Scenario Outline: Post Request
    When The user enters the data to be added and the specifies the content type <I_D> , "<f_name>", "<l_name>", "<email>", "<c_typeKey>","<c_typeValue>"
    And The users makes a post call
    Then The users verifies the status code

    Examples: 
      | I_D | f_name | l_name | email               | c_typeKey    | c_typeValue      |
      |  20 | Dr     | jackal | dr.jackal@gmail.com | Content-Type | application/json |

  @put
  Scenario Outline: Put Request
    When The user enters the data to be added and the specify the content type <I_D> , "<f_name>", "<l_name>", "<email>", "<c_typeKey>","<c_typeValue>"
    And The users makes a put call "<I_D>"
    Then The users verifies the status of the code

    Examples: 
      | I_D | f_name | l_name  | email               | c_typeKey    | c_typeValue      |
      |  20 | kurudo | akabane | dr.jackal@gmail.com | Content-Type | application/json |
