package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FilterPage {
    public FilterPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }
    @AndroidFindBy(uiAutomator = "text(\"Filtrele\")")
    public WebElement filter;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/typeNameTV\").instance(0)")
    public WebElement category;

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/nameTV\").instance(1)")
    public WebElement subcategory;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/nameTV\").instance(3)")
    public WebElement subcategory2;
    @AndroidFindBy(id = "com.dmall.mfandroid:id/tv_name")
    public WebElement apply;
    @AndroidFindBy(id = "com.dmall.mfandroid:id/tv_name")
    public WebElement getShowResult;
  @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/tvTitle\").instance(0)")
    public WebElement showResults;

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/nameTV\").instance(4)")
    public WebElement sneaker;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/typeNameTV\").instance(2)")
    public WebElement brand;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/nameTV\").instance(0)")
    public WebElement subBrand;
    @AndroidFindBy(uiAutomator = "text(\"Adidas\")")
    public WebElement selectedBrand;
    @AndroidFindBy(uiAutomator = "text(\"Bej\")")
    public WebElement selectedColor;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/typeNameTV\").instance(1)")
    public WebElement number;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/nameTV\").instance(4)")
    public WebElement subNumber;
    @AndroidFindBy(uiAutomator = "text(\"30\")")
    public WebElement selectedNumber;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/typeNameTV\").instance(3)")
    public WebElement color;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/nameTV\").instance(2)")
    public WebElement subColor;
    @AndroidFindBy(id = "com.dmall.mfandroid:id/minPriceET")
    public WebElement minPrice;
    @AndroidFindBy(id = "com.dmall.mfandroid:id/maxPriceET")
    public WebElement maxPrice;
    @AndroidFindBy(uiAutomator = "text(\"Sonuçları Göster\")")
    public WebElement sonuclariGoster;
    @AndroidFindBy(uiAutomator = "text(\"1.044,99 TL\")")
    public WebElement priceResult;

    @AndroidFindBy(id = "com.dmall.mfandroid:id/tvSelectedCargoOption")
    public WebElement cargo;
    @AndroidFindBy(uiAutomator = "text(\"Ücretsiz Kargo\")")
    public WebElement subCargo;
    @AndroidFindBy(uiAutomator = "text(\"Ücretsiz Kargo\")")
    public WebElement selectedCargo;
    @AndroidFindBy(xpath = "(//*[@class='androidx.appcompat.widget.LinearLayoutCompat'])[2]")
    public WebElement filterScroll;

  @AndroidFindBy(uiAutomator = "text(\"Kampanya ve İndirimler\")")
  public WebElement promotionsAndDiscounts;
  @AndroidFindBy(uiAutomator = "text(\"Sepette Ek İndirim\")")
  public WebElement discountsCart;

    @AndroidFindBy(uiAutomator = "resourceId(\"com.dmall.mfandroid:id/ivImage\").instance(0)")
    public WebElement firstProduct;

    @AndroidFindBy(uiAutomator = "text(\"Sepete Ekle\")")
    public WebElement sepeteEkle;
    @AndroidFindBy(uiAutomator = "text(\"SEPETTE\")")
    public WebElement indirim;

}
