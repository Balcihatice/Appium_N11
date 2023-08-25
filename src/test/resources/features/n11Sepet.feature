@sepetim
Feature: n11_TestSepetim

  Scenario: n11_TestGoToSepet
    When The User clicks on the Anasayfa button
    And The User clicks on the Sepetim button
    Then The User verifies went to the Sepetim

  Scenario: n11_TestEmptyBasket
    When The User clicks on the Anasayfa button
    And The User clicks on the Sepetim button
    Then The User verifies Sepetiniz Bos Gorunuyor message is visible

  Scenario: n11_TestAddProductToCart
    When The User clicks on the Anasayfa button1
    When The User clicks on the Searchbox enters dyson v15
    And The User clicks on the first product that appears
    And User adds selected item to the cart1
    Then The User verifies that the product in the cart

  Scenario: n11_TestAddMultipleProductsToCart

    And The user clicks on the categories button1
    And The User clicks on the Searchbox enters Elidor
    And The User clicks on the first product that appears
    And User adds selected item to the cart
    Then The User verifies that the products in the cart

  Scenario: n11_TestBasketTotalPrice
    When The User clicks on the Sepetim button
    Then The User verifies the sum of the prices of the products in the cart is the same as the Odenecek Tutar

  Scenario: n11_TestBasketTotalPriceUpdate
    When The User clicks on the Sepetim button
    And The User updates the quantity of the first item in the cart to two and verifies the Odenecek Tutar in the cart has been updated

  Scenario: n11_TestOdemeyeGecButton
    When The User clicks on the Sepetim button
    Then The User verifies the Odemeye Gec button appears

  Scenario: n11_TestEmptyingBasket
    When The User clicks on the Sepetim button
    Then The User clicks on the Secileni Sil button
    Then The User verifies Sepetiniz Bos Gorunuyor message is visible




