package com.blz.userregistrationjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Asim");
        Assertions.assertTrue(result);
    }

    //Name Written in LowerCase for Testing
    @Test
    public void givenFirstName_WhenFirsLetterSmall_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("asim");
        Assertions.assertFalse(result);
    }

    //Name Written Less Than 3 Character
    @Test
    public void givenFirstName_WhenLessThanThreeCharacter_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("As");
        Assertions.assertFalse(result);
    }

    //Testcase for special Characters
    @Test
    public void givenFirstName_WhenSpCharacters_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("as@#$");
        Assertions.assertFalse(result);
    }

    //Last Name In Proper Way
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Ahammed");
        Assertions.assertTrue(result);
    }

    //Test for Lowercase
    @Test
    public void givenLastName_WhenLowerCase_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("ahammed");
        Assertions.assertFalse(result);
    }

    //Test for less than 3 character
    @Test
    public void givenLastName_WhenLessThanThreeCharacter_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("ah");
        Assertions.assertFalse(result);
    }

    //Test for Special Character
    @Test
    public void givenLastName_WhenSpecialCharacter_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("ah@#$%");
        Assertions.assertFalse(result);
    }

    //Test for Email Should Return True
    @Test
    void givenEmailAddress_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("asim123@gmail.com");
        Assertions.assertTrue(result);
    }

    //Test for invalid Email
    @Test
    void givenEmailAddress_WhenWrong_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("abc@.com.my");
        Assertions.assertFalse(result);
    }

    //Test for valid Mobile Number Should Return True
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePhoneNumber("91 1234567890");
        Assertions.assertTrue(result);
    }

    //Test for Invalid Mobile Number Should return false
    @Test
    public void givenPhoneNumber_WhenNoSpaceFollow_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePhoneNumber("911234567890");
        Assertions.assertFalse(result);
    }

    //Test for less than 10 digit Number Should return false
    @Test
    public void givenPhoneNumber_WhenLessThanTenDigit_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePhoneNumber("91 159784");
        Assertions.assertFalse(result);
    }

    //Test for Valid Password Should Return True ( minimum 8 Character)
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("12345678");
        Assertions.assertTrue(result);
    }

    //Test for Password Without eight letters Should Return False
    @Test
    void givenPassword_WhenWithoutUppercaseCharacters_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("a122");
        Assertions.assertFalse(result);
    }
}