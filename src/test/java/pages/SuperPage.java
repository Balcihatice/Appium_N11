package pages;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SuperPage {

    public SuperPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/ivShortcutItem\").instance(2)")
    public WebElement superFirsatlar;

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/productImageView\").instance(0)")
    public WebElement gununFirsati;

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/productTitleTextView\")")
    public WebElement gununFirsatiName;

    @AndroidFindBy(uiAutomator = "text(\"Sepete Ekle\")")
    public WebElement sepeteEkle;
   @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/basketItemTitleTV\")")
    public WebElement sepetItemName;

    @AndroidFindBy(uiAutomator = "text(\"Seçileni Sil\")")
    public WebElement sepetItemDelete;

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/productImageView\").instance(1)")
    public WebElement mobileOzelFirsat;

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/productTitleTextView\").instance(1)")
    public WebElement mobileOzelFirsatName;

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/double_shocking_deal_title\")")
    public WebElement sonrakiFirsatlar;


    @AndroidFindBy(uiAutomator = "text(\"GÜNÜN DİĞER FIRSATLARI\")")
    public WebElement gununDigerFirsatlari;
    @AndroidFindBy(uiAutomator = "text(\"Tüm Özellikler\")")
    public WebElement tumOzellikler;

    @AndroidFindBy(uiAutomator = "text(\"Ürün Bilgileri\")")
    public WebElement urunBilgileri;

     @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/iv_daily_deal_row_product_image\").instance(0)")
    public WebElement sonrakiFirsatlarFirstItem;

    @AndroidFindBy(uiAutomator = "text(\"Tüm Fırsatlar\")")
    public WebElement tumFirsatlar;
    @AndroidFindBy(uiAutomator = "text(\"Tüm Kategoriler\")")
    public WebElement tumKategoriler;
    @AndroidFindBy(uiAutomator = "text(\"Elektronik\")")
    public WebElement kategoriElektronik;

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/other_deals_item_product_image_iv\").instance(0)")
    public WebElement electronikFirstItem;

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/productDetailsTitleTV\")")
    public WebElement electronikFirstItemName;

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/basketItemTitleTV\")")
    public WebElement sepetFirstItemName;

    @AndroidFindBy(uiAutomator = "text(\"Yeni Başlayan Fırsatlar\")")
    public WebElement yeniBaslayanFirsatlar;

    @AndroidFindBy(uiAutomator = "text(\"Ev & Yaşam\")")
    public WebElement kategoriEvYasam;

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/other_deals_item_product_image_iv\").instance(0)")
    public WebElement evYasamFirstItem;

    @AndroidFindBy(uiAutomator = "text(\"Bugün Bitecek Fırsatlar\")")
    public WebElement bugunBitecekFirsatlar;

    @AndroidFindBy(uiAutomator = "text(\"Moda\")")
    public WebElement kategoriModa;

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/other_deals_item_product_image_iv\").instance(0)")
    public WebElement modaFirstItem;

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/other_deals_item_product_name_tv\").instance(0)")
    public WebElement modaFirstItemName;

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/basketItemTitleTV\")")
    public WebElement modaSepetItem;


    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/iv_closePopupIcon\")")
    public WebElement kapat;




}
