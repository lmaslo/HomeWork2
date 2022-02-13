package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.registrationForm;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class checkFormTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";

    }

    @Test
    void successFillTest() {
        //check form
        open("/automation-practice-form");
        $(".main-header").shouldHave(text("Practice Form"));

        //input data
        new registrationForm().setFirstName("Lena");
        new registrationForm().setLastName("Masloboishchikova");



        $("#userEmail").setValue("lMaslo@mail.ru");
        //разобраться с selectRadio("Female")
        $(byText("Female")).click();
        $("#userNumber").setValue("8999932145");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOptionByValue("1993");
        $(".react-datepicker__month-select").selectOptionByValue("8");
        $(byText("10")).click();
        $("#subjectsInput").setValue("English").pressEnter();
        $(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("1.jpg");
        $("#currentAddress").setValue("Address 1 2 3 4 5");
        $("#state").click();
        $(byText("NCR")).click();
        $("#city").click();
        $(byText("Delhi")).click();

        $("#submit").click();

        //check data
        $(".modal-header").shouldHave(text("Thanks for submitting the form"));
        new registrationForm().setFirstName("Lena Masloboishchikova");


      /*  $(".table-responsive").shouldHave(
                text("Lena Masloboishchikova"),
                text("lMaslo@mail.ru"),
                text("Female"),
                text("8999932145"),
                text("10 September,1993"),
                text("English"),
                text("Sports"),
                text("1.jpg"),
                text("Address 1 2 3 4 5"),
                text("NCR Delhi")
        );*/
    }
}
