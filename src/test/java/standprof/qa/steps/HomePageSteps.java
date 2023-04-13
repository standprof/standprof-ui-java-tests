package standprof.qa.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import standprof.qa.base.UiBase;
import standprof.qa.pages.HomePage;

import static org.junit.Assert.*;

public class HomePageSteps extends UiBase {

    private final HomePage homePage;

    public HomePageSteps(UiBase uiBase){
        homePage = new HomePage(uiBase.driver);
    }

    @Given("^I am on the Home page$")
    public void iAmOnTheHomePage() {
        homePage.goToHomePage();
    }

    @Then("^I should see the menu$")
    public void iShouldSeeMenu() {
        assertTrue(homePage.isMenuDisplayed());
    }
}
