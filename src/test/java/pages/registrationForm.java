package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class registrationForm {
    //locators
    private SelenideElement firstNameInput = $("#firstName");
    private SelenideElement lastNameInput = $("#lastName");


    private SelenideElement resultsTable = $(".table-responsive");


    //actions
    public void setFirstName (String firstName){
        firstNameInput.setValue(firstName);
    }
    public void setLastName (String lastName){
        lastNameInput.setValue(lastName);
    }

    public void setBirthDate (String year, String mounth, String day ){
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOptionByValue(year);
        $(".react-datepicker__month-select").selectOptionByValue(mounth);
        $(byText(day)).click();
    }

    public void checkTable (String value) {
        resultsTable.shouldHave(text(value));
    }
}
