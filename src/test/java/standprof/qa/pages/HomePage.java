package standprof.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import standprof.qa.base.UiBase;

public class HomePage extends UiBase{

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHomePage() {
        this.driver.get("https://standprof.co.uk");
    }

    public boolean isMenuDisplayed() {
        return this.driver.findElement(By.className("menu1")).isDisplayed();
    }
}
