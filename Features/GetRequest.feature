Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario outline
    Given The user enters base uri "<URI>"
    When the user enters values "<ID>""<FN>","<LN>","<EID>","<CL>"
    Then the user sees success message

    Examples: 
      | URI                   | ID      | FN         | LN | EID               | CL |
      | http://localhost:3000 | users/1 | Harish     | T  | harisht@gmail.com | 91 |
      | http://localhost:3000 | users/2 | bhuva      | p  | bhuva@gmail.com   | 88 |
      | http://localhost:3000 | users/3 | thalllaaaa | a  | thala@gmail.com   | 93 |
      | http://localhost:3000 | users/4 | kalai      | k  | kalai@gmail.com   | 88 |
