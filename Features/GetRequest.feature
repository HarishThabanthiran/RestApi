Feature: Basic Requests

  @get
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

  @delete
  Scenario Outline: Delete Request
    Given The user is using the base resource URI
    When The user makes a Delete call using the "<I_D>"
    Then The user checks for the status code created "200"

    Examples: 
      | I_D |
      |  20 |

  @post
  Scenario Outline: Post Request
    Given The user uses the base URI
    When The user enters the datas to be added and the specifies the content type <I_D> , "<f_name>", "<l_name>", "<email>", "<c_typeKey>","<c_typeValue>"
    And The user makes a Post call
    Then The user verifies the status code created

    Examples: 
      | I_D | f_name | l_name | email               | c_typeKey    | c_typeValue      |
      |  20 | Dr     | jackal | dr.jackal@gmail.com | Content-Type | application/json |

  @put
  Scenario Outline: put Request
    Given The user uses the base resource URI
    When The user enters the datas to be updated and then specifies the content type <I_D> , "<f_name>", "<l_name>", "<email>", "<c_typeKey>","<c_typeValue>"
    And The user makes a Put call using the "<I_D>"
    Then The user uses assert to verify the status code created

    Examples: 
      | I_D | f_name | l_name  | email               | c_typeKey    | c_typeValue      |
      |  20 | kurudo | akabane | dr.jackal@gmail.com | Content-Type | application/json |
