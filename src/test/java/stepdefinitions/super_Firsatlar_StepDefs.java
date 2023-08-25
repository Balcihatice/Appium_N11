package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SuperPage;

import static org.junit.Assert.assertEquals;
import static utilities.ReusableMethods.*;

public class super_Firsatlar_StepDefs {
    SuperPage superPage = new SuperPage();
    String sepetExpected;
    String sepetExpectedMobile;
    String expectedFirstItemName;
    String modaFirstItemNameExpected;


    @When("User enters the super firsatlar module")
    public void user_enters_the_super_firsatlar_module() {
        clickJS((superPage.kapat));
        clickJS(superPage.superFirsatlar);
    }
    @When("User sees the Gunun Firsati item")
    public void user_sees_the_gunun_firsati_item() {

        sepetExpected = superPage.gununFirsatiName.getText();
        System.out.println(sepetExpected);
        clickJS(superPage.gununFirsati);
    }
    @When("User adds selected item to the cart")
    public void user_adds_selected_item_to_the_cart() {

        clickJS(superPage.sepeteEkle);
    }
    @Then("User verify the selected item is the same as item added to the cart")
    public void user_verify_the_selected_item_is_the_same_as_item_added_to_the_cart() {

        Assert.assertTrue(superPage.sepetItemName.isDisplayed());
        String sepetActual = superPage.sepetItemName.getText();

        assertEquals(sepetExpected, sepetActual);
    }

    @Then("User deletes the item added to the cart")
    public void user_deletes_the_item_added_to_the_cart() {

        clickJS(superPage.sepetItemDelete);
    }
    @And("User sees the Mobile Ozel Firsat item")
    public void userSeesTheMobileOzelFirsatItem() {

        waitFor(5);

        scrollDown(superPage.mobileOzelFirsat, 20);

        sepetExpectedMobile = superPage.mobileOzelFirsatName.getText();
        System.out.println(sepetExpectedMobile);
        clickJS(superPage.mobileOzelFirsat);
   }

    @Then("User verify the selected Mobile Ozel item is the same as item added to the cart")
    public void userVerifyTheSelectedMobileOzelItemIsTheSameAsItemAddedToTheCart() {

        Assert.assertTrue(superPage.sepetItemName.isDisplayed());
        String sepetMobileOzelActual = superPage.sepetItemName.getText();

        assertEquals(sepetExpectedMobile, sepetMobileOzelActual);
    }
    @And("User goes to the Sonraki Firsatlar")
    public void userGoesToTheSonrakiFirsatlar() {

        waitFor(5);

        scrollDown(superPage.mobileOzelFirsat, 50);
        scrollDown(superPage.sonrakiFirsatlar, 25);
  }
    @And("User selects first item at the page")
    public void userSelectsFirstItemAtThePage() {

        clickJS(superPage.sonrakiFirsatlarFirstItem);
    }
    @Then("User sees the all about the selected item")
    public void userSeesTheAllAboutTheSelectedItem() {

        clickJS((superPage.tumOzellikler));

        Assert.assertTrue(superPage.urunBilgileri.isDisplayed());

    }
    @And("User goes to the Tum Firsatlar page")
    public void userGoesToTheTumFirsatlarPage() {
        clickJS(superPage.tumFirsatlar);
    }
    @And("User selects the Electronics category from dropdown menu")
    public void userSelectsTheElectronicsCategoryFromDropdownMenu() {

        clickJS(superPage.tumKategoriler);
        clickJS(superPage.kategoriElektronik);

    }
    @And("User adds the first item to the cart at the page")
    public void userAddsTheFirstItemToTheCartAtThePage() {

        clickJS(superPage.electronikFirstItem);
        expectedFirstItemName = superPage.electronikFirstItemName.getText();
        clickJS(superPage.sepeteEkle);
    }
    @Then("User verify the selected first Elektronik item is the same as item added to the cart")
    public void userVerifyTheSelectedFirstElektronikItemIsTheSameAsItemAddedToTheCart() {

        String actualFirstItemName = superPage.sepetFirstItemName.getText();
        assertEquals(expectedFirstItemName, actualFirstItemName);
    }
    @And("User goes to the Yeni Baslayan Firsatlar page")
    public void userGoesToTheYeniBaslayanFirsatlarPage() {

        clickJS(superPage.yeniBaslayanFirsatlar);
    }
    @And("User selects the Ev&Yasam category from dropdown menu")
    public void userSelectsTheEvYasamCategoryFromDropdownMenu() {

        clickJS(superPage.tumKategoriler);
        clickJS(superPage.kategoriEvYasam);
    }
    @And("User selects the first item at the page")
    public void userSelectsTheFirstItemAtThePage() {

    clickJS(superPage.evYasamFirstItem);
    }
    @Then("User sees the all about the selected item from Ev&Yasam category")
    public void userSeesTheAllAboutTheSelectedItemFromEvYasamCategory() {

       clickJS((superPage.tumOzellikler));
        Assert.assertTrue(superPage.urunBilgileri.isDisplayed());

    }
    @And("User goes to the Bugun Bitecek Firsatlar page")
    public void userGoesToTheBugunBitecekFirsatlarPage() {

       clickJS(superPage.bugunBitecekFirsatlar);
    }
    @And("User selects the Moda category from dropdown menu")
    public void userSelectsTheModaCategoryFromDropdownMenu() {

        clickJS(superPage.tumKategoriler);
        clickJS(superPage.kategoriModa);
    }

    @And("User adds the first Moda item to the cart")
    public void userAddsTheFirstModaItemToTheCart() {
        modaFirstItemNameExpected = superPage.modaFirstItemName.getText();
        clickJS(superPage.modaFirstItem);
        clickJS(superPage.sepeteEkle);

    }

    @Then("User verify the selected first Moda item is the same as item added to the cart")
    public void userVerifyTheSelectedFirstModaItemIsTheSameAsItemAddedToTheCart() {

        String modaSepetItemActual = superPage.modaSepetItem.getText();
        assertEquals(modaFirstItemNameExpected, modaSepetItemActual);


    }


}
