Feature: FizzBuzz_algorithm

  Scenario Outline:  Should return proper FixxBuzz indicator depending on number divisibility
    Given the number is <number>
    When I ask whether it's divisible by <divisor>
    Then I should be told <answer>

    Examples:
      | number | divisor | answer |
      |   43   |    3    | "Nope" |
      |   43   |    5    | "Nope" |
      |   12   |    3    | "Fizz" |
      |   -6   |    3    | "Fizz" |
      |   25   |    5    | "Buzz" |
      |   15   |    3    | "FizzBuzz" |
      |   15   |    5    | "FizzBuzz" |
      |   0    |    3    | "FizzBuzz" |
      |   0    |    5    | "FizzBuzz" |


 
