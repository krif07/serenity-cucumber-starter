Feature: Adding products to cart

#  @nokia
#  Scenario: Adding a Nokia Cellphone to cart
#    Given juan is looking for products in demo blaze
#    When he selects the product "Nokia lumia 1520"
#    Then he should see the product name "Nokia lumia 1520"
#    And he should see the product price "$820"
#
#  @iphone
#  Scenario: Adding an Iphone to cart
#    Given juan is looking for products in demo blaze
#    When he selects the product "Iphone 6 32gb"
#    Then he should see the product name "Iphone 6 32gb"
#    And he should see the product price "$790"

  @phones
  Scenario Outline: Adding an Iphone to cart
    Given juan is looking for products in demo blaze
    When he selects the product "Iphone 6 32gb"
    Then he should see the product name "Iphone 6 32gb"
    And he should see the product price "$790"

    Examples:
    | phone            | price |
    | Nokia lumia 1520 | $790  |
    | Iphone 6 32gb    | $790  |