package data;

import com.github.javafaker.Faker;

import java.util.Locale;


public class TestData {
    Faker faker = new Faker(new Locale("fr"));

    public String userEmail = faker.internet().emailAddress(),
            name = faker.name().firstName(),
            number = faker.number().digits(15),
            description = faker.options().option("Best ideas", "Good idea", "Bad idea"),
            country = faker.options().option("Afghanistan", "Bahrain", "Djibouti");

}

