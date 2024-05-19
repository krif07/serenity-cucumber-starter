Feature: Adding products to cart

  @phones
  Scenario Outline: Adding an Iphone to cart
    Given juan is looking for products in demo blaze
    When he selects the product "<phone>"
    Then he should see the product name "<phone>"
    And he should see the product price "<price>"

    Examples:
    | phone            | price |
    | Nokia lumia 1520 | $820  |
    | Iphone 6 32gb    | $790  |
