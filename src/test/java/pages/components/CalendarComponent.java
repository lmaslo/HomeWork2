package pages.components;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate (String year, String month, String day ){
        $(".react-datepicker__year-select").selectOptionByValue(year);
        $(".react-datepicker__month-select").selectOptionByValue(month);
       // $(".react-datepicker__day--010:not(.react-datepicker__day--outside-month)").click();
        $(byText(day)).click();
    }

}
