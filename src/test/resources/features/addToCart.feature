Feature: Shopping Cart

  Scenario: Add products to cart

    Given the user enter to the demoblaze page
    When add the product
      | Samsung galaxy s6 |
      | Nokia lumia 1520  |
    Then user can see the total amount
      | 1180 |




