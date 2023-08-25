@deneme2
Feature: N11 Prioritized Items Module Test

  Background:
    Given User access to the N11 mobile app

  Scenario:  Prioritized_Items_Electronics

  When The user clicks "Kategoriler" module.
  And The user clicks on the 'Elektronik' module.
  And The user clicks on the first item from the "Öne Çıkan Ürünler" options.
  And The user verifies all the photos are displayed.
  And The user clicks the "Sepete Ekle" button.
  Then The user verifies that the item was added to the cart.

  Scenario:  Prioritized_Items_Dress & Shoes

    When The user clicks "Kategoriler" module.
    And The user clicks on the 'Giyim & Ayakkabı' module.
    And The user clicks on the "Çok Satanlar" icon.
    And The user clicks on the first item.
    And The user clicks the "Sepete Ekle" button.
    Then The user verifies that the item was added to the cart.

  Scenario:  Prioritized_Items_House & Life

    When The user clicks "Kategoriler" module.
    And The user clicks on the 'Ev & Yaşam' module.
    And The user clicks on the first item from "Öne Çıkanlar" part.
    And The user clicks the "Sepete Ekle" button.
    Then The user verifies that the item was added to the cart.

  Scenario:  Prioritized_Items_Mom & Baby

    When The user clicks "Kategoriler" module.
    And The user clicks on the 'Anne & Bebek' module.
    And The user clicks on the first item from "Öne Çıkan Ürünler" icon.
    And The user verifies all the photos are displayed.
    And The user clicks the "Sepete Ekle" button.
    Then The user verifies that the item was added to the cart.


  Scenario:  Prioritized_Items_Sports & Outdoor

    When The user clicks "Kategoriler" module.
    And The user clicks on the 'Spor & Outdoor' module.
    And The user clicks on the "Öne Çıkanlar" icon.
    And The user clicks on the first item.
    And The user verifies all the photos are displayed.
    And The user clicks the "Sepete Ekle" button.
    Then The user verifies that the item was added to the cart.

  Scenario:  Prioritized_Items_Automobile & Motorbikes

    When The user clicks "Kategoriler" module.
    And The user clicks on the 'Otomotiv & Motosiklet' module.
    And The user clicks on the first item from "Öne Çıkan Ürünler" icon.
    And The user verifies all the photos are displayed.
    And The user clicks the "Sepete Ekle" button.
    Then The user verifies that the item was added to the cart.

