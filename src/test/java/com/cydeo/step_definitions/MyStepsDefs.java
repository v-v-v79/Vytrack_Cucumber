package com.cydeo.step_definitions;

import com.cydeo.pages.VytrackPages;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class MyStepsDefs {
    VytrackPages vytrackPages = new VytrackPages();

    @Given("Manager is on login page")
    public void manager_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        Driver.waitUntilVisible(vytrackPages.userNameInput, 40);
    }

    @When("Manager enters {string} into Username box and pushes Enter")
    public void manager_enters_into_username_box(String userName) {
        Driver.waitUntilVisible(vytrackPages.userNameInput, 40);
        vytrackPages.userNameInput.sendKeys(userName + Keys.ENTER);
    }

    @When("Manager enters {string} into Password box and pushes Enter")
    public void manager_enters_password_into_password_box(String password) {
        Driver.waitUntilVisible(vytrackPages.passWordInput, 40);
        vytrackPages.passWordInput.sendKeys(password + Keys.ENTER);
    }
    @Then("Manager see home page with eight modules")
    public void manager_see_home_page_with_eight_modules() {
        vytrackPages.managerModuleListCheck();
    }

    @And("Manager logs out")
    public void managerLogsOut() {
        vytrackPages.logout();
    }

    @Given("Driver is on login page")
    public void driver_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        Driver.waitUntilVisible(vytrackPages.userNameInput, 40);
    }

    @When("Driver enters {string} into Username box and pushes Enter")
    public void driver_enters_user19_into_username_box_and_pushes_enter(String userName) {
        Driver.waitUntilClickable(vytrackPages.userNameInput, 40);
        vytrackPages.userNameInput.sendKeys(userName + Keys.ENTER);
    }

    @When("Driver enters {string} into Password box")
    public void driver_enters_into_password_box(String password) {
        Driver.waitUntilClickable(vytrackPages.passWordInput, 40);
        vytrackPages.passWordInput.sendKeys(password + Keys.ENTER);
    }

    @Then("Driver see home page with four modules")
    public void driver_see_home_page_with_four_modules() {
        vytrackPages.driverModuleListCheck();
    }

    @And("Driver logs out")
    public void driverLogsOut() {
        vytrackPages.logout();
    }
}
