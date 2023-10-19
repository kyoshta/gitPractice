package com.digital.utils;

import com.github.javafaker.Faker;

public class FakeDataProvider {

    static Faker faker = new Faker();

    public static String generateFakeFullName(){
        return faker.name().fullName();
    }

    public static String generateFakeEmail(){
        return faker.internet().emailAddress();
    }

    public static String generateFakeAddress(){
        return faker.address().fullAddress();

    }

    public static String generateFakePermanentAddress(){
        return faker.address().streetName() + " " + faker.address().streetAddress();

    }



    public static void main(String[] args) {
        System.out.println(generateFakeFullName());
    }
}
