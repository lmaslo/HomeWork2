package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class RegistrationForm {
    //components
    private CalendarComponent calendarComponent = new CalendarComponent();

    //locators
    private SelenideElement firstNameInput = $("#firstName");
    private SelenideElement lastNameInput = $("#lastName");
    private SelenideElement mainHeader = $(".main-header");
    private SelenideElement userEmail = $("#userEmail");
    private SelenideElement gender = $("#gender-radio-2");
    private SelenideElement userNumber = $("#userNumber");
    private SelenideElement dateOfBirth = $("#dateOfBirthInput");
    private SelenideElement subjectsInput = $("#subjectsInput");
    private SelenideElement hobbiesInput = $("#hobbies-checkbox-1");
    private SelenideElement uploadPicture = $("#uploadPicture");
    private SelenideElement currentAddress = $("#currentAddress");
    private SelenideElement stateInput = $("#state");
    private SelenideElement cityInput = $("#city");
    private SelenideElement buttonSubmit = $("#submit");


    private SelenideElement resultsTable = $(".table-responsive");


    //actions
    public RegistrationForm openPage() {
        step("открываем главную страницу", () -> {
            open("/automation-practice-form");
            mainHeader.shouldHave(text("Practice Form"));
        });
        return this;
    }

    public RegistrationForm setFirstName(String firstName) {
        step("Вводим имя", () -> {
            firstNameInput.setValue(firstName);
        });
        return this;
    }

    public RegistrationForm setLastName(String lastName) {
        step("Вводим фамилию", () -> {
            lastNameInput.setValue(lastName);
        });
        return this;
    }

    public RegistrationForm setEmail(String email) {
        step("Заполняем email", () -> {
            userEmail.setValue(email);
        });
        return this;
    }

    public RegistrationForm setGender() {
        step("Выбираем пол", () -> {
            gender.parent().click();
        });
        return this;
    }

    public RegistrationForm setNumber(String number) {
        userNumber.setValue(number);
        return this;
    }

    public RegistrationForm setBirthDate(String year, String month, String day) {
        dateOfBirth.click();
        calendarComponent.setDate(year, month, day);
        return this;
    }

    public RegistrationForm setSubject(String subject) {
        subjectsInput.setValue(subject).pressEnter();
        return this;
    }

    public RegistrationForm setHobbies(String hobbies) {
        hobbiesInput.parent().click();
        //$(byText(hobbies)).click();
        return this;
    }

    public RegistrationForm setUploadFile(String fileName) {
        uploadPicture.uploadFromClasspath(fileName);
        return this;
    }

    public RegistrationForm setAddress(String address) {
        currentAddress.setValue(address);
        return this;
    }

    public RegistrationForm setState(String state) {
        stateInput.click();
        $(byText(state)).click();
        return this;
    }

    public RegistrationForm setCity(String city) {
        cityInput.click();
        $(byText(city)).click();
        return this;
    }

    public RegistrationForm setSubmit() {
        buttonSubmit.click();
        return this;
    }

    public RegistrationForm checkTable(String value) {
        resultsTable.shouldHave(text(value));
        return this;
    }
}
