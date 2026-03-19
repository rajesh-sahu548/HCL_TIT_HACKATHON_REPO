package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.SearchResultPage;
import pages.ProductDetailsPage;
import utility.ScreenshotUtils;

public class OLXTest extends BaseTest {

//    @Test
//    public void verifySearchAndViewProductDetails() throws InterruptedException {
//
//        HomePage home = new HomePage(driver);
//
//        SearchResultPage results = new SearchResultPage(driver);
//
//        ProductDetailsPage product = new ProductDetailsPage(driver);
//
//        home.searchProduct("Used Mobile Phone");
//
//
//    }
	
	

	
	 @Test
	    public void TC_OLX_002_searchValidKeyword() throws InterruptedException {

	        HomePage home = new HomePage(driver);

	        home.searchFor("Used Mobile Phone");

	        Assert.assertTrue(driver.getCurrentUrl().contains("search"));
	    }

	 
//	    @Test
//	    public void TC_OLX_003_verifyProductCards() {
//
//	        HomePage home = new HomePage(driver);
//	        SearchResultPage results = new SearchResultPage(driver);
//
//	        home.searchProduct("Used Mobile Phone");
//
//	        Assert.assertTrue(results.getResultCount() > 0);
//	    }
//
//	    @Test
//	    public void TC_OLX_004_openProductDetails() {
//
//	        HomePage home = new HomePage(driver);
//	        SearchResultPage results = new SearchResultPage(driver);
//
//	        home.searchProduct("Used Mobile Phone");
//
//	        results.selectProduct();
//
//	        Assert.assertTrue(driver.getTitle().length() > 0);
//	    }
//
//	    @Test
//	    public void TC_OLX_005_validateProductTitle() {
//
//	        HomePage home = new HomePage(driver);
//	        SearchResultPage results = new SearchResultPage(driver);
//	        ProductDetailsPage product = new ProductDetailsPage(driver);
//
//	        home.searchProduct("Used Mobile Phone");
//
//	        results.selectProduct();
//
//	        Assert.assertFalse(product.getTitle().isEmpty());
//	    }
//
//	    @Test
//	    public void TC_OLX_006_validateProductPrice() {
//
//	        HomePage home = new HomePage(driver);
//	        SearchResultPage results = new SearchResultPage(driver);
//	        ProductDetailsPage product = new ProductDetailsPage(driver);
//
//	        home.searchProduct("Used Mobile Phone");
//
//	        results.selectProduct();
//
//	        Assert.assertFalse(product.getPrice().isEmpty());
//	    }
//
//	    @Test
//	    public void TC_OLX_007_validateSellerInfo() {
//
//	        HomePage home = new HomePage(driver);
//	        SearchResultPage results = new SearchResultPage(driver);
//	        ProductDetailsPage product = new ProductDetailsPage(driver);
//
//	        home.searchProduct("Used Mobile Phone");
//
//	        results.selectProduct();
//
//	        Assert.assertNotNull(product.getSellerInfo());
//	    }
//
//	    @Test
//	    public void TC_OLX_008_validateDescription() {
//
//	        HomePage home = new HomePage(driver);
//	        SearchResultPage results = new SearchResultPage(driver);
//	        ProductDetailsPage product = new ProductDetailsPage(driver);
//
//	        home.searchProduct("Used Mobile Phone");
//
//	        results.selectProduct();
//
//	        Assert.assertFalse(product.getDescription().isEmpty());
//	    }
//
//	    @Test
//	    public void TC_OLX_009_captureScreenshot() {
//
//	        HomePage home = new HomePage(driver);
//	        SearchResultPage results = new SearchResultPage(driver);
//
//	        home.searchProduct("Used Mobile Phone");
//
//	        results.selectProduct();
//
//	        ScreenshotUtils.captureScreenshot(driver, "ProductPage");
//
//	        Assert.assertTrue(true);
//	    }
//
//	    // Negative Tests
//
//	    @Test
//	    public void TC_OLX_010_emptySearch() {
//
//	        HomePage home = new HomePage(driver);
//
//	        home.searchProduct("");
//
//	        Assert.assertTrue(driver.getTitle().length() > 0);
//	    }
//
//	    @Test
//	    public void TC_OLX_011_invalidKeyword() {
//
//	        HomePage home = new HomePage(driver);
//	        SearchResultPage results = new SearchResultPage(driver);
//
//	        home.searchProduct("abcxyz123invalid");
//
//	        Assert.assertTrue(results.getResultCount() >= 0);
//	    }
//	
//	
//	
//	
//	
	
	
}