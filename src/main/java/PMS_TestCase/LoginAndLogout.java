package PMS_TestCase;

import BrowserAutomationController.TestConfig;
import BrowserAutomationController.WebDriverController;
import TestTools.Assertion;
import TestTools.AssertionListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;
@Listeners({TestTools.AssertionListener.class})
public class LoginAndLogout extends WebDriverController {

    @Test(groups = "PMS3.0",enabled = true)
    public void loginByAccountAndPassword() throws InterruptedException {
        TestConfig testConfig = new TestConfig();
        testConfig.setUrl("https://pms.mdguanjia.com/#/login");
        testConfig.setBrowsersType("chrome");
        startBrowser(testConfig);
        if (driver!=null){
            Assert.assertEquals(driver.getTitle(),"麦滴管家","网页名称不匹配~");
            WebElement account = driver.findElement(By.className("login-form-row")).findElement(By.name("username"));
            account.sendKeys("13305710000");
            List<WebElement> L = driver.findElements(By.className("login-form-row"));
            WebElement password = L.get(1).findElement(By.name("password"));
            password.sendKeys("123456");
            driver.findElement(new By.ByCssSelector("[class='el-button el-button--primary el-button--small']")).click();
            Thread.sleep(3000);
            Assertion.verifyEquals(driver.getTitle(), "麦滴管家", "网页名称不匹配~");
        }
        driver.quit();
    }

}
