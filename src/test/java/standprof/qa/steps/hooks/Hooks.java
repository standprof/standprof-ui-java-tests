package standprof.qa.steps.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import standprof.qa.base.UiBase;

import java.util.Hashtable;

public class Hooks extends UiBase {

    private UiBase uiBase;
    private  Hashtable drivers = new java.util.Hashtable<Integer, WebDriver>();

    public Hooks(UiBase uiBase){
        this.uiBase = uiBase;
    }

    @Before()
    public void startDriver()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        uiBase.driver = new ChromeDriver();
        drivers.put(uiBase.driver.hashCode(), uiBase.driver);
    }

    @After()
    public void stopDriver()
    {
        WebDriver driver = (WebDriver) drivers.get(uiBase.driver.hashCode());
        driver.quit();
    }
}
