Feature: Calculator

  Scenario: addition
    Given X is 1
    And Y is 2
    When X plus y is calculated
    Then The result is 3

  Scenario: subtraction
    Given X is 2
    And Y is 1
    When X minus y is calculated
    Then The result is 1

  Scenario Outline: various addition cases
    Given X is <x>
    And Y is <y>
    When X plus y is calculated
    Then The result is <expected>

Examples:
    | x | y | expected |
    | 1 | 2 | 3        |
    | 3 | 4 | 7        |