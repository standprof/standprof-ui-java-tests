package standprof.qa.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import standprof.qa.base.UiBase;
import standprof.qa.pages.HomePage;

public class HomePageSteps extends UiBase {

    private final HomePage homePage;

    public HomePageSteps(UiBase uiBase){
        homePage = new HomePage(uiBase.driver);
    }

    @Given("^I am on the Home page$")
    public void iAmOnTheHomePage() {
        System.out.format("Thread ID - %2d.\n",
                Thread.currentThread().getId());
        homePage.goToHomePage();
    }

    @Then("^I should see the menu$")
    public void iShouldSeeMenu() {
        Assert.assertTrue(homePage.isMenuDisplayed());
    }
}
