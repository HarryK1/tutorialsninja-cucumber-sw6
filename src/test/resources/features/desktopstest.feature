Feature: DesktopTest

  @sanity @regression
  Scenario: verify product arranged in alphabetical order
    Given I am on the homepage
    And I hover on the Desktops tab and click
    And click on "Show AllDesktops"
    And select sort by position "Name: Z to A"
    Then I can see the products in descending order


  @smoke @regression
  Scenario Outline: verify product arranged in alphabetical order
    Given I am on the homepage
    And I hover on the Desktops tab and click
    And click on "Show AllDesktops"
    And select sort by the position "Name: A to Z"
    And select <product>
    Then I can see the text "HP LP3065"
    And select delivery date '2023-11-30'
    And enter qty 1 using select class
    And click on 'Add to Cart' button
    Then I can see the text "Success: You have added HP LP3065 to your shopping cart!"
    And I click on link 'shopping cart' display into success message
    Then I can see the text 'Shopping Cart'
    Then I can see the Product name "HP LP3065"
    Then I can see the Delivery Date "2022-11-30"
    Then I can see the '<model>'
    Then I can see the '<price>'

    Examples:
      | product      | model      | price            |
      | HTC Touch HD | Product 1  | £74.73           |
      | iPhone       | product 11 | £75.46           |
      | iPod Classic | product 20 | £74.73           |
      | MacBook      | Product 16 | £368.73          |
      | MacBook Air  | Product 17 | £736.23          |
      | Sony VAIO    | Product 19 | £736.23          |


