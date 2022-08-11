package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;


public class ListOfPeoplePage {
    @FindBy(how = How.ID, using = "addPersonBtn")
    private WebElement addPersonButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"person3\"]//*[@class=\"name\"]")
    private WebElement userName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"person3\"]//*[@class=\"surname\"]")
    private WebElement userSurname;

    @FindBy(how = How.XPATH, using = "//*[@id=\"person3\"]//*[@class=\"job\"]")
    private WebElement userJob;

    @FindBy(how = How.XPATH, using = "//*[@id=\"person3\"]//*[@class=\"dob\"]")
    private WebElement userBirthDate;

    @FindBy(how = How.XPATH, using = "//*[@id=\"person3\"]//*[@class=\"language\"]")
    private WebElement userLanguages;

    @FindBy(how = How.XPATH, using = "//*[@id=\"person3\"]//*[@class=\"gender\"]")
    private WebElement userGender;

    @FindBy(how = How.XPATH, using = "//*[@id=\"person3\"]//*[@class=\"status\"]")
    private WebElement userEmployeeStatus;

    @FindBy(how = How.XPATH, using = "//*[@id=\"person3\"]//*[@onclick=\"openModalForEditPerson(3)\"]")
    private WebElement editButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"person3\"]//*[@onclick=\"deletePerson(3)\"]")
    private WebElement deleteButton;


    public String getPageUrl() {
        return "https://kristinek.github.io/site/tasks/list_of_people.html";
    }

    public void clickAddPerson() {
        addPersonButton.click();
    }


    public void checkName(String name) {
        assertEquals(name, userName.getText());
    }

    public void checkSurname(String surname) {
        assertEquals(surname, userSurname.getText());
    }

    public void checkJob(String job) {
        assertEquals(job, userJob.getText());
    }

    public void checkDateOfBirth(String dateOfBirth) {
        assertEquals(dateOfBirth, userBirthDate.getText());
    }

    public void checkKnowsLanguage(String knowsLanguage) {
        assertEquals(knowsLanguage, userLanguages.getText());
    }

    public void checkGender(String gender) {
        assertEquals(gender, userGender.getText());
    }

    public void checkEmployeeStatus(String employeeStatus) {
        assertEquals(employeeStatus, userEmployeeStatus.getText().substring(0, 1).toUpperCase() + userEmployeeStatus.getText().substring(1));
    }

    public void clickEditButton() {
        editButton.click();
    }

    public void clickDeleteButton() {
        deleteButton.click();
    }

}
