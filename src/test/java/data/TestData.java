package data;

import com.github.javafaker.Faker;

import java.util.Locale;


public class TestData {
    Faker faker = new Faker(new Locale("fr"));

    public String userEmail = faker.internet().emailAddress(),
                  name = faker.name().firstName(),
                  number = faker.number().digits(15),
                  subject = faker.options().option("Ratchet", "Cleaner", "Tape");

    }

