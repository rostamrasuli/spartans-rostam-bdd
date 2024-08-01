package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SetupTestSteps extends SeleniumUtility {

    @Given("open the browser and navigate to the retail app")
    public void openBrowserAndNavigate() {
        setupBrowser();
    }
    @Then("validate to the top left corner is TEKSCHOOL")
    public void validateTopLeftLogo(){
         String text = getElementText(By.className("top-nav__logo"));
        System.out.println(text);

    }
@Then("close the browser")
    public void closeBrowser(){
        quitBrowser();
    }
}
