@allSortFilter
Feature: N11_Search_Sort


  @bestsellers @sort
  Scenario: Item_Search_Sort_bestsellers
    Given The User clicks on the Anasayfa buttonH
    And The user types Woman shoes into the search field and enter button
    When The user clicks on the sort button
    And The user clicks on the bestsellers
    Then The user verifies that the best-selling women's shoes are displayed

  @Newests @sort
  Scenario: Item_Search_Sort_Newests
    Given The User clicks on the Anasayfa buttonH
    When The user types Woman shoes into the search field and enter button
    And The user clicks on the sort button
    And The user clicks on the Newests
    Then The user verifies that the newests women's shoes are displayed

  @IncreasedPrice @sort
  Scenario: Item_Search_Sort_IncreasedPrice
    Given The User clicks on the Anasayfa buttonH
    When The user types Woman shoes into the search field and enter button
    And The user clicks on the sort button
    And The user clicks on the Increased price
    Then The user Verifies sorted by ascending price

  @decreasingPrice @sort
  Scenario: Item_Search_Sort_decreasingPrice
    Given The User clicks on the Anasayfa buttonH
    When The user types Woman shoes into the search field and enter button
    And The user clicks on the sort button
    And The user clicks on the decreasing price
    Then The user Verifies sorted by descending price

  @comments @sort
  Scenario: Item_Search_Sort_comments
    Given The User clicks on the Anasayfa buttonH
    When The user types Woman shoes into the search field and enter button
    And The user clicks on the sort button
    And The user clicks on the a lot of comments
    Then The user The first line of the product with the most comments is correct

  @category
  Scenario: Filter_Category
    Given The User clicks on the Anasayfa buttonH
    When The user types Woman shoes into the search field and enter button
    And The user clicks on the filter button
    And The user clicks on the Category
    And The user the women's casual footwear category, sneakers are chosen
    And The user clicks on the apply button
    And The user clicks on Show Results
    Then The user confirms that she has chosen a sneaker

  @number
  Scenario: Filter_Number
    Given The User clicks on the Anasayfa buttonH
    When The user types Woman shoes into the search field and enter button
    And The user clicks on the filter button
    And The user clicks on the Number
    And The user clicks on the option for size 30
    And The user clicks on the apply button
    Then The user confirms that size 30 is selected

  @brand
  Scenario: Filter_Brand
    Given The User clicks on the Anasayfa buttonH
    When The user types Woman shoes into the search field and enter button
    And The user clicks on the filter button
    And The user clicks the brand button
    And The user select the Adidas brand
    And The user clicks on the apply button
    And The user confirms that Adidas brand is selected

  @color
  Scenario: Filter_Color
    Given The User clicks on the Anasayfa buttonH
    When The user types Woman shoes into the search field and enter button
    And The user clicks on the filter button
    And The user clicks the Color button
    And The user select the white color
    And The user clicks on the apply button
    And The user confirms that White color is selected

  @price
  Scenario: Filter_Price
    Given The User clicks on the Anasayfa buttonH
    When The user types Woman shoes into the search field and enter button
    And The user clicks on the filter button
    And The user enters the minimum price 200
    And The user enters the max price 10000
    And The user clicks on Price Results
    And The user views the shoes that match the price range

  @cargo
  Scenario: Filter_Cargo
    Given The User clicks on the Anasayfa buttonH
    When The user types Woman shoes into the search field and enter button
    And The user clicks on the filter button
    And The user clicks on the shipping options
    And The user clicks on the free shipping
    And The user clicks on the apply button
    And The user confirms that products with free shipping are visible


  @discounts
  Scenario: Filter_Promotions_and_discounts
    Given The User clicks on the Anasayfa buttonH
    When The user types Woman shoes into the search field and enter button
    And The user clicks on the filter button
    And The user clicks on the Promotions and discounts
    And The user clicks on the Additional discount in the cart
    And The user clicks on the apply button
    And The user clicks on Show Results
    And The user confirms that the message 'This product has a coupon' is displayed








