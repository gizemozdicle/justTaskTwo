Feature: People with jobs Tests


  Scenario Outline: Add Person
    Given I am on list of people page
    When I click to "add" button
    Then I fill the form and click to Add button
      | name           | <name>           |
      | surname        | <surname>        |
      | job            | <job>            |
      | dateOfBirth    | <dateOfBirth>    |
      | knowsLanguage  | <knowsLanguage>  |
      | gender         | <gender>         |
      | employeeStatus | <employeeStatus> |
    Then I check that the form fields are displayed correctly on the page
      | name           | <name>           |
      | surname        | <surname>        |
      | job            | <job>            |
      | dateOfBirth    | <dateOfBirth>    |
      | knowsLanguage  | <knowsLanguage>  |
      | gender         | <gender>         |
      | employeeStatus | <employeeStatus> |
    Examples:
      | name  | surname | job       | dateOfBirth | knowsLanguage     | gender | employeeStatus |
      | Gizem | Ozdicle | Jr Tester | 10/01/1993  | English, French,  | female | Intern         |
      | Johan | Bach    | Musician  | 10/01/1988  | English, spanish, | male   | Employee       |


  Scenario: Edit Person
    Given I am on list of people page
    When I click to "add" button
    Then I fill the form and click to Add button
      | name           | Gizem            |
      | surname        | Ozdicle          |
      | job            | Jr Tester        |
      | dateOfBirth    | 10/01/1993       |
      | knowsLanguage  | English, French, |
      | gender         | female           |
      | employeeStatus | Intern           |
    Then I check that the form fields are displayed correctly on the page
      | name           | Gizem            |
      | surname        | Ozdicle          |
      | job            | Jr Tester        |
      | dateOfBirth    | 10/01/1993       |
      | knowsLanguage  | English, French, |
      | gender         | female           |
      | employeeStatus | Intern           |
    When I click to "edit" button
    Then I fill the form and click to Add button
      | name           | Neil Patrick      |
      | surname        | Harris            |
      | job            | Actress           |
      | dateOfBirth    | 10/01/2001        |
      | knowsLanguage  | English, spanish, |
      | gender         | male              |
      | employeeStatus | Employee          |
    Then I check that the form fields are displayed correctly on the page
      | name           | Neil Patrick             |
      | surname        | Harris                   |
      | job            | Actress                  |
      | dateOfBirth    | 10/01/2001               |
      | knowsLanguage  | English, French, Spanish |
      | gender         | male                     |
      | employeeStatus | Employee                 |

  Scenario: Delete Person
    Given I am on list of people page
    When I click to "add" button
    Then I fill the form and click to Add button
      | name           | Gizem            |
      | surname        | Ozdicle          |
      | job            | Jr Tester        |
      | dateOfBirth    | 10/01/1993       |
      | knowsLanguage  | English, French, |
      | gender         | female           |
      | employeeStatus | Intern           |
    Then I check that the form fields are displayed correctly on the page
      | name           | Gizem            |
      | surname        | Ozdicle          |
      | job            | Jr Tester        |
      | dateOfBirth    | 10/01/1993       |
      | knowsLanguage  | English, French, |
      | gender         | female           |
      | employeeStatus | Intern           |
    When I click to "delete" button
    Then I check the user "Gizem" has been deleted