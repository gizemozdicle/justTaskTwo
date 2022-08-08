package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.Objects;


public class EnterNewPersonPage {
    @FindBy(how = How.ID, using = "name")
    private WebElement nameInput;

    @FindBy(how = How.ID, using = "surname")
    private WebElement surnameInput;

    @FindBy(how = How.ID, using = "job")
    private WebElement jobInput;

    @FindBy(how = How.ID, using = "dob")
    private WebElement dateOfBirthInput;

    @FindBy(how = How.ID, using = "french")
    private WebElement selectFrench;

    @FindBy(how = How.ID, using = "spanish")
    private WebElement selectSpanish;

    @FindBy(how = How.CLASS_NAME, using = "ui-state-default")
    private WebElement dateOfBirthSelect;

    @FindBy(how = How.ID, using = "male")
    private WebElement selectMale;

    @FindBy(how = How.ID, using = "female")
    private WebElement selectFemale;

    @FindBy(how = How.ID, using = "status")
    private WebElement selectStatus;

    @FindBy(how = How.ID, using = "modal_button")
    private WebElement addButton;


    public void enterName(String name) {
        nameInput.clear();
        nameInput.sendKeys(name);
    }

    public void enterSurname(String surname) {
        surnameInput.clear();
        surnameInput.sendKeys(surname);
    }


    public void enterJob(String job) {
        jobInput.clear();
        jobInput.sendKeys(job);
    }

    public void enterDateOfBirth(String dateOfBirth) {
        dateOfBirthInput.clear();
        dateOfBirthInput.sendKeys(dateOfBirth);
        dateOfBirthSelect.click();
    }


    public void enterKnowsLanguage(String enterKnowsLanguage) {
        if (Objects.equals(enterKnowsLanguage, "English, French,")) {
            selectFrench.click();
        } else if (Objects.equals(enterKnowsLanguage, "English, spanish,")) {
            selectSpanish.click();
        }

    }

    public void selectGender(String gender) {
        if (Objects.equals(gender, "female")) {
            selectFemale.click();
        } else if (Objects.equals(gender, "male")) {
            selectMale.click();
        }
    }

    public void enterEmployeeStatus(String employeeStatus) {
        Select dropdown = new Select(selectStatus);
        dropdown.selectByVisibleText(employeeStatus);
    }

    public void clickAddButton() {
        addButton.click();
    }

}
