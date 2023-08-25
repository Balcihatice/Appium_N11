package pages;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ProductSpecificationsPage {


    public ProductSpecificationsPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(accessibility = "Kategoriler")
    public WebElement kategorilerBtn;
    @AndroidFindBy(xpath = "(//*[@resource-id=\"com.dmall.mfandroid:id/ivImage\"])[1]")
    public WebElement ilkUrun;
    @AndroidFindAll({@AndroidBy(xpath = "//*[@resource-id=\"com.dmall.mfandroid:id/productImagesIndicator\"]//*[@class=\"android.view.View\"]")})
    public List<WebElement> urunResimNoktalar;

    @AndroidFindBy(id = "com.dmall.mfandroid:id/productImageIV")
    public WebElement urunResim;

    // @AndroidFindBy(uiAutomator = "text(\"(Ev & Yaşam\")")
    // public WebElement EvYasamButton;

    @AndroidFindBy(uiAutomator = "text(\"Elektronik\")")
    public WebElement elektronikBtn;

    @AndroidFindBy(uiAutomator = "text(\"Tüm Özellikler\")")
    public WebElement tumOzellikler;

    @AndroidFindBy(id = "com.dmall.mfandroid:id/productFeaturesTV")
    public WebElement urunBilgileri;
    @AndroidFindBy(id = "com.dmall.mfandroid:id/productFeaturesContainerCL")
    public WebElement urunBilgileriContainer;

    @AndroidFindBy(id = "com.dmall.mfandroid:id/productDetailsAllProductFeaturesTV")
    public WebElement dahaFazlaBilgi;

    @AndroidFindBy(id = "com.dmall.mfandroid:id/titleTV")
    // //android.widget.LinearLayout[@content-desc="Ürün Özellikleri"]/android.widget.TextView
    public WebElement urunÖzellikleri;



    @AndroidFindBy(xpath = "(//android.widget.LinearLayout[@content-desc=\"Ürün Açıklaması\"]/android.widget.TextView")
    public WebElement urunAcıklaması;


    @AndroidFindBy(id = "com.dmall.mfandroid:id/returnExchangeTitleTV")
    public WebElement İadeDeğisimButton;
    @AndroidFindBy(accessibility = "İade Talebi Oluştur")
    public WebElement iadeTalebi;
    @AndroidFindBy(id = "com.dmall.mfandroid:id/returnExchangeTitleTV")
    public WebElement IadeDegisimBilgileriButton;


    @AndroidFindBy(id = "com.dmall.mfandroid:id/btnClose")
    public WebElement closeBtn;

    @AndroidFindBy(id = "com.dmall.mfandroid:id/productCommentsTitleTV")
    public WebElement DegerlendirmeVeYorumlar;

    @AndroidFindBy(id = "com.dmall.mfandroid:id/subsidyMessageTV")
    public WebElement kuponBilgileri;

        @AndroidFindBy(uiAutomator = "text(\"Bilgisayar\")")
        public WebElement bilgisayarBtn;

        @AndroidFindBy(uiAutomator = "text(\"Tablet\")")
        public WebElement tabletBtn;






}