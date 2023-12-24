package data;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestDataFakers {
    Faker faker = new Faker(new Locale("fr"));
    public String firstNameInput = faker.name().firstName(),
            lastNameInput = faker.name().lastName(),
            userEmailInput = faker.internet().emailAddress(),
            userPassword = faker.code().ean8();

}
