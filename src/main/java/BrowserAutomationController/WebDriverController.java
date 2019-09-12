package BrowserAutomationController;

import BrowserAutomationController.BrowsersType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static BrowserAutomationController.SystemProperty.CHROME;
import static BrowserAutomationController.SystemProperty.CHROME_DRIVER;
import static BrowserAutomationController.SystemProperty.CHROME_DRIVER_ADDRESS;

public class WebDriverController {

    public static WebDriver driver = null;


    public static WebDriver startBrowser(BrowsersType browsersType){

        if (browsersType.getBrowsersType()!= null && browsersType.getBrowsersType() == CHROME) {
            browsersType.setWebDriverAddress(CHROME_DRIVER_ADDRESS);
            System.setProperty(CHROME_DRIVER,browsersType.getWebDriverAddress());
            driver = new ChromeDriver();
            driver.get(browsersType.getUrl());
        }
        else {
            System.out.println("还不支持其它浏览器哦~~~");
        }

        return driver;
    }



    @Test
    public void startBroswerTest() throws InterruptedException {
        BrowsersType browsersType = new BrowsersType();
        browsersType.setBrowsersType("chrome");
        browsersType.setUrl("https://www.baidu.com/");
        startBrowser(browsersType);
        if (driver!=null){
            System.out.println(driver.getTitle());
            driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("bilibili");
            driver.findElement(By.id("su")).click();
            Thread.sleep(3000);
            driver.quit();
        }
    }
}
