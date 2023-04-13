package standprof.qa.steps.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import standprof.qa.base.UiBase;

public class Hooks extends UiBase {

    private final UiBase uiBase;

    public Hooks(UiBase uiBase){
        this.uiBase = uiBase;
    }

    @Before()
    public void startDriver()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        uiBase.driver = new ChromeDriver();
    }

    @After()
    public void stopDriver()
    {
        uiBase.driver.quit();
    }
}
