package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import pages.HaticePageFilter;
import pages.HaticePageSort;
import pages.N11Page;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.scrollDown;

public class N11_Sort_Filter_StepDefs {
    HaticePageSort sort = new HaticePageSort();
    HaticePageFilter filter = new HaticePageFilter();

    @Given("The User clicks on the Anasayfa buttonH")
    public void the_user_clicks_on_the_homepageH() {
        sort.anasayfaBtn.click();

    }
    @Given("The user types Woman shoes into the search field and enter button")
    public void the_user_types_woman_shoes_into_the_search_field_and_enter_button() {
        sort.search1.click();
        sort.search.sendKeys(ConfigReader.getProperty("arananUrun"));
        sort.kadinAyakkabi.click();
    }

    @When("The user clicks on the sort button")
    public void the_user_clicks_on_the_sort_button() {
        sort.smartSort.click();
    }

    @When("The user clicks on the bestsellers")
    public void the_user_clicks_on_the_bestsellers() {
        sort.cokSatanlarr.click();
    }

    @Then("The user verifies that the best-selling women's shoes are displayed")
    public void the_user_verifies_that_the_best_selling_women_s_shoes_are_displayed() {
        sort.bestsellersProduct.isDisplayed();
        sort.bestsellersProductstar.isDisplayed();
    }


    //Item_Search_Sort_Newests
    @When("The user clicks on the Newests")
    public void the_user_clicks_on_the_newests() {
        sort.enYeniler.click();
    }

    @Then("The user verifies that the newests women's shoes are displayed")
    public void the_user_verifies_that_the_newests_women_s_shoes_are_displayed() {
        sort.newestsPruduct.isDisplayed();
        sort.newestsProductstar.isDisplayed();
    }


    //Item_Search_Sort_IncreasedPrice
    @When("The user clicks on the Increased price")
    public void the_user_clicks_on_the_ıncreased_price() {
        sort.artanFiyat.click();

    }

    @Then("The user Verifies sorted by ascending price")
    public void the_user_verifies_sorted_by_ascending_price() throws InterruptedException {
        String price1 = sort.increasedPrice1.getText();
        System.out.println(price1);
        scrollDown(sort.scrol, 25);
        String price2 = sort.increasedPrice2.getText();
        double priceValue = Double.parseDouble(price1.replace("TL", "").replace(",", ".").trim());
        double priceTwoValue = Double.parseDouble(price2.replace("TL", "").replace(",", ".").trim());

        Assert.assertTrue("priceTwo is not greater than price", priceTwoValue > priceValue);

    }

    //Item_Search_Sort_decreasingPrice
    @When("The user clicks on the decreasing price")
    public void the_user_clicks_on_the_decreasing_price() {
        sort.azalanFiyat.click();
    }

    @Then("The user Verifies sorted by descending price")
    public void the_user_verifies_sorted_by_descending_price() {
        String priceDec = sort.decreasingPrice1.getText();
        scrollDown(sort.scrol, 25);
        String priceDec2 = sort.decreasingPrice2.getText();
        String cleanedPrice = priceDec.replace("TL", "").replace(".", "").trim();
        double priceValue = Double.parseDouble(cleanedPrice.replace(",", "."));
        String cleanedPrice2 = priceDec2.replace("TL", "").replace(".", "").trim();
        double priceValue2 = Double.parseDouble(cleanedPrice2.replace(",", "."));
        Assert.assertTrue("priceValue is not greater than priceTwoValue", priceValue > priceValue2);

    }

    //Item_Search_Sort_comments
    @When("The user clicks on the a lot of comments")
    public void the_user_clicks_on_the_a_lot_of_comments() {
        sort.cokYorumAlanlar.click();
    }

    @Then("The user The first line of the product with the most comments is correct")
    public void the_user_the_first_line_of_the_product_with_the_most_comments_is_correct() {
        String comment1 = sort.aLotOfComments1.getText();
        String cleanedComment1 = comment1.replaceAll("[^\\d-]", "");
        String comment2 = sort.aLotOfComments2.getText();
        String cleanedComment2 = comment2.replaceAll("[^\\d-]", "");
        int commentValue1 = Integer.parseInt(cleanedComment1);
        int commentValue2 = Integer.parseInt(cleanedComment2);
        Assert.assertTrue(commentValue1 > commentValue2);
    }

    //Filter_Category
    @When("The user clicks on the filter button")
    public void the_user_clicks_on_the_filter_button() {
        filter.filter.click();
    }

    @When("The user clicks on the Category")
    public void the_user_clicks_on_the_category() {
        filter.category.click();
        filter.subcategory2.click();
    }

    @When("The user the women's casual footwear category, sneakers are chosen")
    public void the_user_the_women_s_casual_footwear_category_sneakers_are_chosen() {
        filter.sneaker.click();
    }

    @When("The user clicks on the apply button")
    public void the_user_clciks_on_the_apply_button() {
        filter.apply.click();
    }

    @When("The user clicks on Show Results")
    public void the_user_clicks_on_show_results() {
        filter.getShowResult.click();

    }

    @Then("The user confirms that she has chosen a sneaker")
    public void the_user_confirms_that_she_has_chosen_a_sneaker() {
        String sneaker = filter.showResults.getText();
        Assert.assertTrue(sneaker.contains("Sneaker"));
    }

    //Filter_Number
    @When("The user clicks on the Number")
    public void the_user_clicks_on_the_number() {
        filter.number.click();

    }

    @When("The user clicks on the option for size {int}")
    public void the_user_clicks_on_the_option_for_size(Integer int1) {
        filter.subNumber.click();
    }

    @Then("The user confirms that size {int} is selected")
    public void theUserConfirmsThatSizeIsSelected(int arg0) {
        String getText = filter.selectedNumber.getText();
        Assert.assertTrue(getText.contains(ConfigReader.getProperty("number")));
    }

    //Filter_Brand
    @When("The user clicks the brand button")
    public void the_user_clicks_the_brand_button() {
        filter.brand.click();
    }


    @When("The user select the Adidas brand")
    public void the_user_select_the_adidas_brand() {
        filter.subBrand.click();
    }

    @When("The user confirms that Adidas brand is selected")
    public void the_user_confirms_that_adidas_brand_is_selected() {
        String getText = filter.selectedBrand.getText();
        Assert.assertTrue(getText.contains(ConfigReader.getProperty("brand")));
    }

    //Filter_Color
    @And("The user clicks the Color button")
    public void the_user_clicks_the_color_button() {
        filter.color.click();
    }

    @And("The user select the white color")
    public void the_user_select_the_white_color() {
        filter.subColor.click();
    }


    @Then("The user confirms that White color is selected")
    public void the_user_confirms_that_white_color_is_selected() {
        String colorText = filter.selectedColor.getText();
        Assert.assertTrue(colorText.contains(ConfigReader.getProperty("color")));
    }


    // Filter_Price
    @When("The user enters the minimum price {int}")
    public void the_user_enters_the_minimum_price(Integer int1) {
        filter.minPrice.sendKeys("1000");
    }

    @When("The user enters the max price {int}")
    public void the_user_enters_the_max_price(Integer int1) {
        filter.maxPrice.sendKeys("2000");

    }

    @And("The user clicks on Price Results")
    public void theUserClicksOnPriceResults() {
        filter.sonuclariGoster.click();
    }

    @When("The user views the shoes that match the price range")
    public void the_user_views_the_shoes_that_match_the_price_range() {
        int minPrice = 1000;
        int maxPrice = 2000;
        String price = filter.priceResult.getText();
        String cleanedPrice = price.replace("TL", "").replace(".", "").trim();
        String cleanedPrice2 = price.replaceAll("[^\\d-]", "");
        int showPrice = Integer.parseInt(cleanedPrice2);
        int truncatedNumber = showPrice / 100;
        Assert.assertTrue(minPrice < truncatedNumber & truncatedNumber < maxPrice);
    }


    // Filter_Cargo
    @When("The user clicks on the shipping options")
    public void the_user_clicks_on_the_shipping_options() {
        scrollDown(filter.filterScroll, 25);
        filter.cargo.click();
    }

    @When("The user clicks on the free shipping")
    public void the_user_clicks_on_the_free_shipping() {
        filter.subCargo.click();
    }

    @When("The user confirms that products with free shipping are visible")
    public void the_user_confirms_that_products_with_free_shipping_are_visible() {
        Assert.assertTrue(filter.selectedCargo.getText().contains(ConfigReader.getProperty("selectedCargo")));
    }

    //Filter_Promotions_and_discounts
    @When("The user clicks on the Promotions and discounts")
    public void the_user_clicks_on_the_promotions_and_discounts() {
        filter.promotionsAndDiscounts.click();
    }

    @When("The user clicks on the Additional discount in the cart")
    public void the_user_clicks_on_the_additional_discount_in_the_cart() {
        filter.discountsCart.click();
    }

    @When("The user confirms that the message {string} is displayed")
    public void the_user_confirms_that_the_message_is_displayed(String string) {
        Assert.assertTrue(filter.indirim.getText().contains("SEPETTE"));
    }
}
