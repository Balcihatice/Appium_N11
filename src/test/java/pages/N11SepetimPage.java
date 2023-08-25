package pages;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class N11SepetimPage {

    public N11SepetimPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.dmall.mfandroid:id/navigation_bar_item_icon_view\"])[2]")
    public WebElement kategorilerBtn;

    @AndroidFindBy(xpath = "(//*[@resource-id=\"com.dmall.mfandroid:id/ivImage\"])[1]")
    public WebElement ilkUrun;

    @AndroidFindBy(id = "com.dmall.mfandroid:id/tvBasketTitle")
    public WebElement basketTitle;

    @AndroidFindBy(id = "com.dmall.mfandroid:id/tvHomeSearchBar")
    public WebElement searchbox;

    @AndroidFindBy(id = "com.dmall.mfandroid:id/etSearch")
    public WebElement searchbar;

    @AndroidFindBy(id = "com.dmall.mfandroid:id/keywordTV")
    public WebElement searchKeywordDyson;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.dmall.mfandroid:id/keywordTV\"])[1]")
    public WebElement searchKeywordElidor;

    @AndroidFindBy(uiAutomator = "text(\"Sepete Ekle\")")
    public WebElement sepeteEkle;

    @AndroidFindBy(id = "com.dmall.mfandroid:id/basketItemTitleTV")
    public WebElement basketItemTitle;

    @AndroidFindAll({@AndroidBy(xpath = "//*[@resource-id=\"com.dmall.mfandroid:id/basketItemTitleTV\"]")})
    public List<WebElement> productNamesInBasket;

    @AndroidFindBy(accessibility = "Ana Sayfa")
    public static WebElement anasayfaBtn;

    @AndroidFindBy(uiAutomator = "text(\"Sepetim\")")
    public WebElement sepetimBtn;

    @AndroidFindBy(id = "com.dmall.mfandroid:id/basketItemPriceTV")
    public WebElement productPrice;


    @AndroidFindBy(id = "com.dmall.mfandroid:id/totalAmountOfBasket")
    public WebElement totalAmountOfBasket;

    @AndroidFindBy(id = "com.dmall.mfandroid:id/basketItemDeleteSelectedTV")
    public WebElement basketItemDeleteSelected;

    @AndroidFindBy(id = "com.dmall.mfandroid:id/emptyBasketTitleTv")
    public WebElement emptyBasketTitle;

    @AndroidFindBy(id = "com.dmall.mfandroid:id/basketContinueBtn")
    public WebElement basketContinueBtn;
















}
