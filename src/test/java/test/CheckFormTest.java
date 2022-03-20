package test;

import org.junit.jupiter.api.Test;
import pages.RegistrationForm;

import java.util.Locale;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static test.TestData.*;


public class CheckFormTest extends TestBase {
    // Faker faker = new Faker();
    //Faker faker = new Faker(new Locale("ru"));


    RegistrationForm registrationForm = new RegistrationForm();

    String gender = "Female";
    String year = "1993";
    String month = "8";
    String mouthText = "September";
    String day = "10";

    String subject = "English";
    String hobbies = "Sports";
    String fileName = "1.jpg";
    String address = "Address 1 2 3 4 5";
    String state = "NCR";
    String city = "Delhi";


    @Test
    void successFillTest() {
        registrationForm.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender()
                .setNumber(number)
                .setBirthDate(year, month, day)
                .setSubject(subject)
                .setHobbies(hobbies)
                //.setUploadFile(fileName)
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .setSubmit();


        //check data
        $(".modal-header").shouldHave(text("Thanks for submitting the form"));
        registrationForm.checkTable(firstName + " " + lastName)
                .checkTable(email)
                .checkTable(gender)
                .checkTable(number)
                .checkTable(day + " " + mouthText + "," + year)
                .checkTable(subject)
                .checkTable(hobbies)
                .checkTable(fileName)
                .checkTable(address)
                .checkTable(state + " " + city);

    }
}
