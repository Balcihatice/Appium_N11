@super
Feature: N11_Super_Firsatlar_modul_testi

  Background:


  @super1
  Scenario:  Gunun Firsati (Today's Deal)

    When User enters the super firsatlar module
    And User sees the Gunun Firsati item
    And User adds selected item to the cart1
    Then User verify the selected item is the same as item added to the cart
    And User deletes the item added to the cart

  @super2
  Scenario: Mobile Ozel Firsat (Deal for the mobile app only)

    When User enters the super firsatlar module
    And User sees the Mobile Ozel Firsat item
    And User adds selected item to the cart
    Then User verify the selected Mobile Ozel item is the same as item added to the cart
    And User deletes the item added to the cart

  @super3
  Scenario: Sonraki Firsatlar (The Other Deals)

    When User enters the super firsatlar module
    And User goes to the Sonraki Firsatlar
    And User selects first item at the page
    Then User sees the all about the selected item

  @super4
  Scenario: Tum Firsatlar (All Deals)

    When User enters the super firsatlar module
    And User goes to the Tum Firsatlar page
    And User selects the Electronics category from dropdown menu
    And User adds the first item to the cart at the page
    Then User verify the selected first Elektronik item is the same as item added to the cart
    And User deletes the item added to the cart

  @super5
  Scenario: Yeni Baslayan Firsatlar (Upcoming Deals)

    When User enters the super firsatlar module
    And User goes to the Yeni Baslayan Firsatlar page
    And User selects the Ev&Yasam category from dropdown menu
    And User selects the first item at the page
    Then User sees the all about the selected item from Ev&Yasam category

  @super6
  Scenario: Bugun Bitecek Firsatlar (Deals Ended Today)


    When User enters the super firsatlar module
    And User goes to the Bugun Bitecek Firsatlar page
    And User selects the Moda category from dropdown menu
    And User adds the first Moda item to the cart
    Then User verify the selected first Moda item is the same as item added to the cart
    And User deletes the item added to the cart
