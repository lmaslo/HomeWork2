package test;

import com.github.javafaker.Faker;

import java.util.Locale;

import static utils.RandomUtils.getRandomString;


public class TestData {

    // Faker faker = new Faker();
    public static Faker faker = new Faker(new Locale("ru"));
    public static String lastName = faker.name().lastName();


    public static String email = "lMaslo@mail.ru",
            number = "8999932146",
            firstName = getRandomString(8);

}




