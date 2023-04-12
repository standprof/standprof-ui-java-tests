package standprof.qa.steps;

import org.openqa.selenium.WebElement;
import standprof.qa.base.UiBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class HomePageSteps extends UiBase {
    private final UiBase uiBase;

    public HomePageSteps(UiBase uiBase){
        this.uiBase = uiBase;
    }
    @io.cucumber.java.en.Given("^I am on the Home page$")
    public void iAmOnTheHomePage() {
        uiBase.driver.get("https://standprof.co.uk");
    }

    @io.cucumber.java.en.Then("^I should see the menu$")
    public void iShouldSeeMenu() {
        WebElement element = uiBase.driver.findElement(By.className("menu1"));
        Assert.assertTrue(element.isDisplayed());
    }
}
