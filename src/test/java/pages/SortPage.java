package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SortPage {
    public SortPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }
    @AndroidFindBy(accessibility = "Ana Sayfa")
    public WebElement anasayfaBtn;
    @AndroidFindBy(id = "com.dmall.mfandroid:id/etSearch")
    public WebElement search;
    @AndroidFindBy(id = "com.dmall.mfandroid:id/tvHomeSearchBar")
    public WebElement search1;
    @AndroidFindBy(id = "com.dmall.mfandroid:id/listingSortTV")
    public WebElement smartSort;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/sortingName\").instance(1)")
    public WebElement artanFiyat;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/keywordTV\").instance(0)")
    public WebElement kadinAyakkabi;

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/checkView\").instance(2)")
    public WebElement azalanFiyat;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/checkView\").instance(3)")
    public WebElement cokSatanlar;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/sortingName\").instance(4)")
    public WebElement cokYorumAlanlar;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/checkView\").instance(5)")
    public WebElement enYeniler;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/tvProductBannerItemPrice\").instance(0)")
    public WebElement increasedPrice1;
    @AndroidFindBy(uiAutomator = "text(\"34,90 TL\").instance(0)")
    public WebElement increasedPrice2;
    @AndroidFindBy(id = "com.dmall.mfandroid:id/listingRV")
    public WebElement scrol;
    @AndroidFindBy(uiAutomator = "text(\"43.897,14 TL\")")
    public WebElement decreasingPrice1;
    @AndroidFindBy(uiAutomator = "text(\"23.950,00 TL\")")
    public WebElement decreasingPrice2;
    @AndroidFindBy(id = "com.dmall.mfandroid:id/tvProductBannerItemPrice")
    public WebElement bestsellers;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/tvProductBannerItemRating\").instance(0)")
    public WebElement bestsellersProduct;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/sortingName\").instance(3)")
    public WebElement cokSatanlarr;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/rbProductBannerItemReview\").instance(0)")
    public WebElement bestsellersProductstar;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/tvProductBannerItemRating\").instance(0)")
    public WebElement aLotOfComments1;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/tvProductBannerItemRating\").instance(1)")
    public WebElement aLotOfComments2;

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/tvProductBannerItemRating\").instance(0)")
    public WebElement newests;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/tvProductBannerItemRating\").instance(0)")
    public WebElement newestsPruduct;

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/rbProductBannerItemReview\").instance(0)")
    public WebElement newestsProductstar;







//   @AndroidFindBy(accessibility = "Kategoriler")
//   public WebElement kategorilerBtn;
//
//   @AndroidFindBy(uiAutomator = "text(\"Elektronik\")")
//   public WebElement elektronikBtn;
//
//   @AndroidFindBy(uiAutomator = "text(\"Bilgisayar\")")
//   public WebElement bilgisayarBtn;
//
//   @AndroidFindBy(uiAutomator = "text(\"Tablet\")")
//   public WebElement tabletBtn;
//
//   @AndroidFindBy(xpath = "(//*[@resource-id=\"com.dmall.mfandroid:id/ivImage\"])[1]")
//   public WebElement ilkUrun;
//
//   @AndroidFindAll({@AndroidBy(xpath = "//*[@resource-id=\"com.dmall.mfandroid:id/productImagesIndicator\"]//*[@class=\"android.view.View\"]")})
//   public List<WebElement> urunResimNoktalar;
//




}
