Feature: Do we get FizzBuzz?

  Scenario Outline: The number is or isn't FizzBuzz
    Given the number is <number>
    When  I ask whether it's FizzBuzz
    Then  I should be told <answer>
    Examples:
      | number | answer     |
      | 1      | "None"     |
      | -2     | "None"     |
      | 3      | "Fizz"     |
      | 5      | "Buzz"     |
      | 15     | "FizzBuzz" |
      | 100    | "Buzz"     |
      | 30     | "FizzBuzz" |
      | -10    | "Buzz"     |
      | -999   | "Fizz"     |