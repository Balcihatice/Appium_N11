package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;
import static org.junit.Assert.assertEquals;
import static utilities.ReusableMethods.clickJS;

public class LoginLogout_StepDefs {
    LoginLogout_Page loginLogout_page = new LoginLogout_Page();
    String expectedName = "Merhaba, Sdet";
    String actualName = "";
    @When("The user clicks Uye Ol Giris Yap button")
    public void the_user_clicks_uye_ol_giris_yap_button() {
        clickJS(loginLogout_page.uyeOlGirisYap);
    }
    @And("The user enters e-mail into the E-Posta Adresi section")
    public void the_user_enters_e_mail_into_the_e_posta_adresi_section() {
        clickJS(loginLogout_page.ePostaAdresi);
        loginLogout_page.ePostaAdresi.sendKeys("sdet.test.23@gmail.com");
    }
    @And("The user enters password into the Sifre section")
    public void the_user_enters_password_into_the_sifre_section() {
        clickJS(loginLogout_page.sifre);
        loginLogout_page.sifre.sendKeys("Vaydin71");
    }
    @And("The user clicks the Giris Yap button")
    public void the_user_clicks_the_giris_yap_button() {
        clickJS(loginLogout_page.girisYap);
    }
    @And("The user clicks the Hesabim button")
    public void the_user_clicks_the_hesabim_button() {
        clickJS(loginLogout_page.hesabim);
    }
    @Then("The user sees name as Merhaba name")
    public void the_user_sees_name_as_merhaba_name() {
        clickJS(loginLogout_page.merhabaSdet);
        actualName = loginLogout_page.merhabaSdet.getText();
        assertEquals(expectedName, actualName);
        System.out.println("actualName = " + actualName);
    }
    @And("The user clicks the settings button")
    public void the_user_clicks_the_settings_button() {
        clickJS(loginLogout_page.ayarlar);
    }
    @And("The user clicks the Cikis Yap button")
    public void the_user_clicks_the_cikis_yap_button() {
        clickJS(loginLogout_page.cikisYap);
    }
    @And("The user clicks the Cikis Yap button again on the confirmation box")
    public void the_user_clicks_the_cikis_yap_button_again_on_the_confirmation_box() {
        clickJS(loginLogout_page.cikisYapTeyit);
    }
    @Then("The user sees Uye Ol Giris Yap button")
    public void the_user_sees_uye_ol_giris_yap_button() {
        Assert.assertTrue(loginLogout_page.uyeOlGirisYap.isDisplayed());
    }
    @And("The user enters {string} into the E-Posta Adresi section")
    public void theUserEntersIntoTheEPostaAdresiSection(String email) {
        clickJS(loginLogout_page.ePostaAdresi);
        loginLogout_page.ePostaAdresi.sendKeys(email);
    }
    @And("The user enters {string} into the Sifre section")
    public void theUserEntersIntoTheSifreSection(String password) {
        clickJS(loginLogout_page.sifre);
        loginLogout_page.sifre.sendKeys(password);
    }
    @Then("The user cannot see the Hesabim")
    public void theUserCannotSeeTheHesabim() {
        Assert.assertTrue(loginLogout_page.girisYap.isDisplayed());
    }
}