package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {

    WebDriver driver;

    public ProductDetailsPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//h1")
    WebElement productTitle;

    @FindBy(xpath="//span[contains(@class,'price')]")
    WebElement productPrice;

    @FindBy(xpath="//div[contains(@class,'description')]")
    WebElement productDescription;

    public boolean validateProductDetails()
    {
        return productTitle.isDisplayed() &&
               productPrice.isDisplayed() &&
               productDescription.isDisplayed();
    }
}