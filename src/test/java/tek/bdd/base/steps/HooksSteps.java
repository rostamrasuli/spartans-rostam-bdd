package tek.bdd.base.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import tek.bdd.utility.SeleniumUtility;

public class HooksSteps extends SeleniumUtility {


    @Before
    public void beforeEachScenario() {
        setupBrowser();
    }

    @After
public void afterEacheScenario() {
        quitBrowser();

}
}
