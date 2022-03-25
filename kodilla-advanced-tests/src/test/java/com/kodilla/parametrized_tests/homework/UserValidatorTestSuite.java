package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"password", "098765", "bTYUjbhgt75", "09877.", "se4567ujkkkkkkkk.", "._-", "667"})
    public void testPasswordWithCorrectCharacters(String input) {
        boolean result = userValidator.validateUsername(input);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"hjk[", "098765&*(", "bhTYUhgt75#$%", "!@#09877.", "/se4567ujkkkkkkkk.", "._-_)", "6"})
    public void testPasswordWithIncorrectCharacters(String input) {
        boolean result = userValidator.validateUsername(input);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"email@email.com", "email.email@email.com", "email123@email123.com", "EMAIL@EMAIL.COM", "EMAIL.EMAIL123-_@EMAILL.EMAIL.COM", "ERTwer.ertyFGH@RTYU678567.RTY"})
    public void testEmailWithCorrectCharacters(String input) {
        boolean result = userValidator.validateEmail(input);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"hjk[", "098765&*(", "bhTYUhgt75#$%", "email123-_;'.EMAIL.EMAIL@email.com", "EMAIL\\EMAIL123-_@EMAILL.EMAIL.COM", "email123@", "@", "E@E", "E.E@E.E", ".EMAIL@EMAIL.COM"})
    public void testEmailWithIncorrectCharacters(String input) {
        boolean result = userValidator.validateEmail(input);
        assertFalse(result);
    }
}