@ProductSpecificationsAll
Feature:ProductSpecifications module test

  Background:

  @ProductSpecifications1
  Scenario:See product photos
    When The user clicks on the categories button
    And The user clicks on the Elektronik button
    And The user clicks on the Computer button
    And The user clicks on the Tablet button
    And The user clicks on the first product that appears
    Then The user confirms that the photos of the product appear

  @ProductSpecifications2
  Scenario:
    When The user clicks on the categories button
    And The user clicks on the Elektronik button
    And The user clicks on the Computer button
    And The user clicks on the Tablet button
    And The user clicks on the first product that appears
    And The user clicks on all features of the product
    Then The user sees product information

  @ProductSpecifications3
  Scenario:

    When The user clicks on the categories button
    And The user clicks on the Elektronik button
    And The user clicks on the Computer button
    And The user clicks on the Tablet button
    And The user clicks on the first product that appears
    And The user clicks on all features of the product

    Then The user sees comments about the product

  @ProductSpecifications4
  Scenario:
    When The user clicks on the categories button
    And The user clicks on the Elektronik button
    And The user clicks on the Computer button
    And The user clicks on the Tablet button
    And The user clicks on the first product that appears
    And The user clicks on all features of the product
    And The user clicks on the more information button
    And The user sees product features

  @ProductSpecifications5
  Scenario:
    When The user clicks on the categories button
    And The user clicks on the Elektronik button
    And The user clicks on the Computer button
    And The user clicks on the Tablet button
    And The user clicks on the first product that appears
    And The user clicks on all features of the product
    And The user clicks the return exchange button
    Then The user sees the return exchange information page

  @ProductSpecifications6
  Scenario:
    When The user clicks on the categories button
    And The user clicks on the Elektronik button
    And The user clicks on the Computer button
    And The user clicks on the Tablet button
    And The user clicks on the first product that appears
    And The user confirms coupon related information


