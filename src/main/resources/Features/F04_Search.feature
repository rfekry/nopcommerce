@smoke
Feature: Logged User could search for any product

  Scenario Outline: user can search using product name
    When user clicks on search field
    And user search with "<productName>"
    Then user can find "<productName>" relative results
    Examples:
      | productName |
      | laptop      |
      | nike        |

    Scenario Outline: user can search for product using sku
      When user clicks on search field
      And user search with "<sku>"
      Then user find "<sku>" inside product detail page
      Examples:
      |sku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|
