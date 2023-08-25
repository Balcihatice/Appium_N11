package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.ProductSpecificationsPage;

import static org.junit.Assert.assertEquals;
import static utilities.ReusableMethods.*;

public class ProductSpecificationsDef {

    ProductSpecificationsPage proSpePage = new ProductSpecificationsPage();
    String yorumExpected;
    String kuponBilgileriTextExpected;


    @When("The user clicks on the categories button")
    public void the_user_clicks_on_the_categories_button() {
        // clickJS(proSpePage.closeBtn);
        //clickJS(proSpePage.kategorilerBtn);

        try {

            if (proSpePage.closeBtn.isDisplayed()) {

                clickJS(proSpePage.closeBtn);
            }
        } catch (Exception e) {

        }

        clickJS(proSpePage.kategorilerBtn);
    }

    @When("The user clicks on the Elektronik button")
    public void the_user_clicks_on_the_elektronik_button() {

        clickJS(proSpePage.elektronikBtn);
    }

    @When("The user clicks on the Computer button")
    public void the_user_clicks_on_the_computer_button() {

        clickJS(proSpePage.bilgisayarBtn);
    }

    @When("The user clicks on the Tablet button")
    public void the_user_clicks_on_the_tablet_button() {

        clickJS(proSpePage.tabletBtn);
    }

    @When("The user clicks on the first product that appears")
    public void the_user_clicks_on_the_first_product_that_appears() {

        clickJS(proSpePage.ilkUrun);
    }
    @Then("The user confirms that the photos of the product appear")
    public void the_user_confirms_that_the_photos_of_the_product_appear() {
        for (int i = 0; i < proSpePage.urunResimNoktalar.size(); i++) {
            Assert.assertTrue(proSpePage.urunResim.isDisplayed());
            swipe(proSpePage.urunResim, "left", 10);
        }}
        @When("The user clicks on all features of the product")
        public void the_user_clicks_on_all_features_of_the_product () {
        clickJS(proSpePage.tumOzellikler);


        }
        @Then("The user sees product information")
        public void the_user_sees_product_information () {

        Assert.assertTrue(proSpePage.urunBilgileri.isDisplayed());
        }

        @Then("The user sees comments about the product")
        public void the_user_sees_comments_about_the_product () {

          Assert.assertTrue(proSpePage.DegerlendirmeVeYorumlar.isDisplayed());


            Assert.assertTrue(proSpePage.DegerlendirmeVeYorumlar.isDisplayed());
            String yorumActual = proSpePage.DegerlendirmeVeYorumlar.getText();
           yorumExpected = "Değerlendirme ve Yorumlar";
            assertEquals(yorumExpected, yorumActual);
            System.out.println();
        }

        @When("The user clicks on the more information button")
        public void the_user_clicks_on_the_more_information_button () {

        clickJS(proSpePage.dahaFazlaBilgi);

        }
        @When("The user sees product features")
        public void the_user_sees_product_features () {
            Assert.assertTrue(proSpePage.urunÖzellikleri.isDisplayed());
            Assert.assertTrue(proSpePage.urunÖzellikleri.getText().equals("Samsung Galaxy Tab A7 Lite SM-..."));
        }

        @When("The user clicks the return exchange button")
        public WebElement the_user_clicks_the_return_exchange_button () {

            waitForClickAbility(proSpePage.İadeDeğisimButton, 10);
            clickJS(proSpePage.İadeDeğisimButton);


            return null;
        }
        @Then("The user sees the return exchange information page")
        public void the_user_sees_the_return_exchange_information_page () {

            Assert.assertTrue(proSpePage.iadeTalebi.isDisplayed());
        }

    @And("The user confirms coupon related information")
    public void theUserConfirmsCouponRelatedInformation() {

        clickJS(proSpePage.kuponBilgileri);
        Assert.assertTrue(proSpePage.kuponBilgileri.isDisplayed());

        kuponBilgileriTextExpected = "Bu ürün avantajlı bir ürün olduğu için bazı kuponlar geçerli olmayabilir.";

        String kuponBilgileriTextActual = proSpePage.kuponBilgileri.getText();

        assertEquals(kuponBilgileriTextExpected, kuponBilgileriTextActual);
        System.out.println();
    }
}
