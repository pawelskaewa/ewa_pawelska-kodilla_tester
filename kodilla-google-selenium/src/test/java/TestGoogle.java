//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import pages.GoogleSearch;
//
//
//public class TestGoogle {
//
//    static WebDriver driver;
//
//    @BeforeAll
//    public static void testSetup() {
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.navigate().to("http://www.google.com");
//    }
//
////    @AfterEach
////    public void tearDown() {
////        driver.close();
////    }
//
//    @Test
//    public void testGooglePage() {
//        GoogleSearch googleSearch = new GoogleSearch(driver);
//        googleSearch.searchResults();
//    }
//}