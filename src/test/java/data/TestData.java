package data;

import com.github.javafaker.Faker;

import java.util.Locale;


public class TestData {
    Faker faker = new Faker(new Locale("fr"));

    public String userEmail = faker.internet().emailAddress(),
                  name = faker.name().firstName();
//            lastName = faker.name().lastName(),
//            userEmail = faker.internet().emailAddress(),
//            gender = faker.options().option("Male", "Female", "Other"),
//            userNumber = faker.phoneNumber().subscriberNumber(10),
//            day = String.format("%02d", faker.number().numberBetween(1,28)),
//            month = faker.options().option("January", "February", "March", "April", "May", "June", "July",
//                    "August", "September", "October", "November", "December"),
//            year = String.valueOf(faker.number().numberBetween(1990, 2023)),
//            subjects = faker.options().option("Social Studies", "Arts", "Chemistry"),
//            hobbies = faker.options().option("Sports", "Reading", "Music"),
//            picture = faker.options().option("IMG_0063.JPG"),
//            streetAddress = faker.address().streetAddress(),
//            state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan"),
//            city = setCity(state);

//    public String setCity(String state) {
//        switch (state) {
//            case "NCR":
//                return faker.options().option("Delhi", "Gurgaon", "Noida");
//            case "Uttar Pradesh":
//                return faker.options().option("Agra", "Lucknow", "Merrut");
//            case "Haryana":
//                return faker.options().option("Karnal", "Panipat");
//            case "Rajasthan":
//                return faker.options().option("Jaipur", "Jaiselmer");
//            default:
//                return null;
//        }
    }

