package TestCase;




import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

class WebDriverTest {

//    public static void main( String[] args ) {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\10057\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.baidu.com/");
//    }

    public static void startChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\10057\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
    }


    public static void main( String[] args ) {
        startChrome();
        System.out.println();
    }




}
