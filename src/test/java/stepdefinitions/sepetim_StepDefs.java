package stepdefinitions;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.ScriptKey;
import org.openqa.selenium.WebElement;
import pages.N11SepetimPage;
import io.appium.java_client.android.nativekey.AndroidKey;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static utilities.ReusableMethods.*;

public class sepetim_StepDefs {

    N11SepetimPage n11SepetimPage=new N11SepetimPage();

    @When("The User clicks on the Anasayfa button1")
    public void the_user_clicks_on_the_anasayfa_button1() {
        clickJS(n11SepetimPage.anasayfaBtn);
    }
    @When("The User clicks on the Sepetim button")
    public void the_user_clicks_on_the_sepetim_button() {
        clickJS(n11SepetimPage.sepetimBtn);
    }
    @Then("The User verifies went to the Sepetim")
    public void the_user_verifies_went_to_the_sepetim() {
        assertTrue(n11SepetimPage.basketTitle.isDisplayed());
    }
    @Then("The User verifies Sepetiniz Bos Gorunuyor message is visible")
    public void the_user_verifies_sepetiniz_bos_gorunuyor_message_is_visible() {
        assertTrue(n11SepetimPage.emptyBasketTitle.isDisplayed());

    }
    @When("The User clicks on the Searchbox enters dyson v15")
    public void the_user_clicks_on_the_searchbox_enters_dyson_v15() {
        clickJS(n11SepetimPage.searchbox);
        n11SepetimPage.searchbar.sendKeys("dyson v15");
        clickJS(n11SepetimPage.searchKeywordDyson);
    }
    @When("The User clicks on the first product that appears")
    public void the_user_clicks_on_the_first_product_that_appears() {
        clickJS(n11SepetimPage.ilkUrun);
    }
    @When("User adds selected item to the cart1")
    public void user_adds_selected_item_to_the_cart1() {
        clickJS(n11SepetimPage.sepeteEkle);
    }
    @Then("The User verifies that the product in the cart")
    public void the_user_verifies_that_the_product_in_the_cart() {
        assertTrue(n11SepetimPage.basketItemTitle.isDisplayed());

    }
    @When("The user clicks on the categories button1")
    public void the_user_clicks_on_the_categories_button1() {
        clickJS(n11SepetimPage.kategorilerBtn);
    }
    @When("The User clicks on the Searchbox enters Elidor")
    public void the_user_clicks_on_the_searchbox_enters_iphone() {
        clickJS(n11SepetimPage.searchbox);
        n11SepetimPage.searchbar.sendKeys("Elidor");
        clickJS(n11SepetimPage.searchKeywordElidor);
    }
    @Then("The User verifies that the products in the cart")
    public void the_user_verifies_that_the_products_in_the_cart() {
        String product1="dyson v15";
        String product2="Elidor";
        List<WebElement> products=n11SepetimPage.productNamesInBasket;
        for (WebElement product : products) {
            String productName = product.getText();
            System.out.println(productName);
            if (productName.contains(product2)) {
                System.out.println("Ürün bulundu: " + product2);
                assertTrue(productName.contains(product2));
            }
        }
    }
    @Then("The User verifies the sum of the prices of the products in the cart is the same as the Odenecek Tutar")
    public void the_user_verifies_the_sum_of_the_prices_of_the_products_in_the_cart_is_the_same_as_the_odenecek_tutar() {
        String priceText1=n11SepetimPage.productPrice.getText();
        priceText1=priceText1.replace(".","").replace(",",".").replace("TL","");
        float productPrice1=Float.parseFloat(priceText1);
        System.out.println(productPrice1);

        scrollTo("Üye Ol, Kazan!");
        String priceText2=n11SepetimPage.productPrice.getText();
        priceText2=priceText2.replace(".","").replace(",",".").replace("TL","");
        float productPrice2=Float.parseFloat(priceText2);
        System.out.println(productPrice2);

        float totalProductPrices=productPrice2+productPrice1;
        System.out.println(totalProductPrices);

        String totalAmountText=n11SepetimPage.totalAmountOfBasket.getText();
        totalAmountText=totalAmountText.replace(".","").replace(",",".").replace("TL","");
        float totalAmountOfBasket=Float.parseFloat(totalAmountText) ;
        System.out.println(totalAmountOfBasket);



    }
    @Then("The User verifies the Odemeye Gec button appears")
    public void the_user_verifies_the_odemeye_gec_button_appears() {
        assertTrue(n11SepetimPage.basketContinueBtn.isDisplayed());

    }
    @Then("The User clicks on the Secileni Sil button")
    public void the_user_clicks_on_the_secileni_sil_button() {
        clickJS(n11SepetimPage.basketItemDeleteSelected);
    }


    @And("The User updates the quantity of the first item in the cart to two and verifies the Odenecek Tutar in the cart has been updated")
    public void theUserUpdatesTheQuantityOfTheFirstItemInTheCartToTwoAndVerifiesTheOdenecekTutarInTheCartHasBeenUpdated() {
        String totalAmount1=n11SepetimPage.totalAmountOfBasket.getText();
        clickJS(n11SepetimPage.basketItemTitle);
        clickJS(n11SepetimPage.sepeteEkle);
        String totalAmount2=n11SepetimPage.totalAmountOfBasket.getText();
        assertNotEquals(totalAmount1,totalAmount2);
        System.out.println("Total Amount Updated "+totalAmount1+"!= "+totalAmount2);
    }
}
