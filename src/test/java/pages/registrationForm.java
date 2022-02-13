package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
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

    public void checkTable (String value) {
        resultsTable.shouldHave(text(value));
    }
}
