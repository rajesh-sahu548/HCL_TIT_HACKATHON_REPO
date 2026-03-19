package pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@type='text']")
    WebElement searchBox;

    @FindBy(xpath="//div[@class='_3wPu_']//span//*[name()='svg']")
    WebElement searchButton;

//  
    
//    public void searchProduct(String product) throws InterruptedException
//    {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        WebElement box = wait.until(ExpectedConditions.elementToBeClickable(searchBox));
   
//    	
//    	searchBox.click();
//
//        for(char c : product.toCharArray())
//        {
//            searchBox.sendKeys(String.valueOf(c));
//            Thread.sleep(100);   // typing delay
//        }
//
//        searchBox.sendKeys(Keys.ENTER);
//    Actions act = new Actions(driver);
//
//    	act.sendKeys(Keys.ENTER).perform();
//    
//
//    	searchBox.sendKeys(product);
//
//    	Actions act1 = new Actions(driver);
//
//    	act1.sendKeys(Keys.ENTER).perform();
//    
//    	
//    }
    
    	

        public void searchFor(String string) {
        	
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement sb = wait.until(ExpectedConditions.elementToBeClickable(searchBox));
            sb.clear();
         
            
            sb.sendKeys(string);
            sb.sendKeys(Keys.ENTER);
        }

		
}
        

