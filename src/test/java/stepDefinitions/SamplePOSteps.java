package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages_sample.*;

import java.util.Map;
import java.util.Objects;

import static org.junit.Assert.*;

public class SamplePOSteps {
    private WebDriver driver;

    static EnterNewPersonPage enterNewPersonPage;

    static ListOfPeoplePage listOfPeoplePage;


    public SamplePOSteps() {
        this.driver = Hooks.driver;
        listOfPeoplePage = PageFactory.initElements(Hooks.driver, ListOfPeoplePage.class);
        enterNewPersonPage = PageFactory.initElements(Hooks.driver, EnterNewPersonPage.class);
    }


    @Given("^I am on list of people page$")
    public void iAmOnListOfPeoplePage() throws Throwable {
        driver.get(listOfPeoplePage.getPageUrl());
    }


    @Then("^I fill the form and click to Add button$")
    public void iFillsTheForm(Map<String, String> valuesToEnter) throws Throwable {
        enterNewPersonPage.enterName(valuesToEnter.get("name"));
        enterNewPersonPage.enterSurname(valuesToEnter.get("surname"));
        enterNewPersonPage.enterJob(valuesToEnter.get("job"));
        enterNewPersonPage.enterDateOfBirth(valuesToEnter.get("dateOfBirth"));
        enterNewPersonPage.enterKnowsLanguage(valuesToEnter.get("knowsLanguage"));
        enterNewPersonPage.selectGender(valuesToEnter.get("gender"));
        enterNewPersonPage.enterEmployeeStatus(valuesToEnter.get("employeeStatus"));
        enterNewPersonPage.clickAddButton();
    }


    @Then("^I check that the form fields are displayed correctly on the page$")
    public void iCheckThatTheFormFieldsAreDisplayedCorrectlyOnThePage(Map<String, String> valuesToEnter) throws Throwable {
        listOfPeoplePage.checkName(valuesToEnter.get("name"));
        listOfPeoplePage.checkSurname(valuesToEnter.get("surname"));
        listOfPeoplePage.checkJob(valuesToEnter.get("job"));
        listOfPeoplePage.checkDateOfBirth(valuesToEnter.get("dateOfBirth"));
        listOfPeoplePage.checkKnowsLanguage(valuesToEnter.get("knowsLanguage"));
        listOfPeoplePage.checkGender(valuesToEnter.get("gender"));
        listOfPeoplePage.checkEmployeeStatus(valuesToEnter.get("employeeStatus"));


    }

    @When("^I click to \"([^\"]*)\" button$")
    public void iClickToButton(String whichButton) throws Throwable {
        if (Objects.equals(whichButton, "add")) {
            listOfPeoplePage.clickAddPerson();
        } else if (Objects.equals(whichButton, "edit")) {
            listOfPeoplePage.clickEditButton();
        } else if (Objects.equals(whichButton, "delete")) {
            listOfPeoplePage.clickDeleteButton();
        }
    }

    @Then("^I check the user \"([^\"]*)\" has been deleted$")
    public void iCheckTheUserHasBeenDeleted(String userName) throws Throwable {
        assertFalse(driver.getPageSource().contains(userName));
    }


}

