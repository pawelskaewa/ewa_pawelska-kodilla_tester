Feature: Cash Withdrawal

  Scenario Outline: Successful or unsuccessful withdrawal from a wallet in credit
    Given I have deposited <amount> in my wallet
    When I request <withdrawal>
    Then <withdrawal> should be dispensed
    Examples:
      | amount | withdrawal |
      | $200   | $30        |
      | $20    | $30        |
      | $30    | $30        |