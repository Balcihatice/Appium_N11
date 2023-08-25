package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class LoginLogout_Page {
    public LoginLogout_Page() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }
    @AndroidFindBy(uiAutomator = "text(\"Üye Ol / Giriş Yap\")")
    public WebElement uyeOlGirisYap;
    @AndroidFindBy(uiAutomator = "text(\"E-Posta Adresi\")")
    public WebElement ePostaAdresi;
    @AndroidFindBy(uiAutomator = "text(\"Şifre\")")
    public WebElement sifre;
    @AndroidFindBy(id = "com.dmall.mfandroid:id/btn_login")
    public WebElement girisYap;
    @AndroidFindBy(id = "com.dmall.mfandroid:id/btnClose")
    public WebElement kapat;
    @AndroidFindBy(uiAutomator = "text(\"Hesabım\")")
    public WebElement hesabim;
    @AndroidFindBy(uiAutomator = "text(\"Merhaba, Sdet\")")
    public WebElement merhabaSdet;
    @AndroidFindBy(id = "com.dmall.mfandroid:id/iv_account_settings")
    public WebElement ayarlar;
    @AndroidFindBy(uiAutomator = "text(\"Çıkış Yap\")")
    public WebElement cikisYap;
    @AndroidFindBy(id = "com.dmall.mfandroid:id/customInfoDialogBtn1")
    public WebElement cikisYapTeyit;
}