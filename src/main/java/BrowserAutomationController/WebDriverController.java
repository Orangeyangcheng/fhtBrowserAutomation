package BrowserAutomationController;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static BrowserAutomationController.SystemProperty.CHROME;
import static BrowserAutomationController.SystemProperty.CHROME_DRIVER;
import static BrowserAutomationController.SystemProperty.CHROME_DRIVER_ADDRESS;

public class WebDriverController {

    public static WebDriver driver = null;


    public static void startBrowser(TestConfig testConfig){

        if (testConfig.getBrowsersType()!= null && testConfig.getBrowsersType() == CHROME) {
            testConfig.setWebDriverAddress(CHROME_DRIVER_ADDRESS);
            System.setProperty(CHROME_DRIVER,testConfig.getWebDriverAddress());
            driver = new ChromeDriver();
            setScreenSize(testConfig);
            driver.get(testConfig.getUrl());

        }
        else {
            System.out.println("还不支持其它浏览器哦~~~");
        }

    }

    private static void setScreenSize(TestConfig testConfig){
        switch (testConfig.getScreenSize()){
            case 0:
                break;
            case 1:
                System.out.println("浏览器全屏幕尺寸显示");
                driver.manage().window().fullscreen();
                break;
            case 2:
                System.out.println("浏览器最大化尺寸显示");
                driver.manage().window().maximize();
                break;
            case 3:
                if (testConfig.getScreenHeight()!=0&&testConfig.getScreenSize()!=0){
                    Dimension dimension = new Dimension(testConfig.getScreenWidth(),testConfig.getScreenHeight());
                    System.out.println("浏览器按"+dimension.getWidth()+"*"+dimension.getHeight()+"尺寸显示");
                    driver.manage().window().setSize(dimension);
                }
                else {
                    return;
                }
                break;
            default:
                break;
        }



    }



    @Test
    public void startBroswerTest() throws InterruptedException {
        TestConfig testConfig = new TestConfig();
        testConfig.setBrowsersType("chrome");
        testConfig.setUrl("https://www.baidu.com/");
        testConfig.setScreenSize(3);
        testConfig.setScreenHeight(1000);
        testConfig.setScreenWidth(1000);
        startBrowser(testConfig);
        if (driver!=null){
            System.out.println(driver.getTitle());
            driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("bilibili");
            driver.findElement(By.id("su")).click();
            Thread.sleep(3000);
            driver.quit();
        }
    }
}
