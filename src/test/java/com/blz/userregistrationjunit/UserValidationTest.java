package com.blz.userregistrationjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Anju");
        Assertions.assertTrue(result);
    }

    //Name Written in LowerCase for Testing
    @Test
    public void givenFirstName_WhenFirsLetterSmall_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("anju");
        Assertions.assertFalse(result);
    }

    //Name Written Less Than 3 Character
    @Test
    public void givenFirstName_WhenLessThanThreeCharacter_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("An");
        Assertions.assertFalse(result);
    }

    //Testcase for special Characters
    @Test
    public void givenFirstName_WhenSpCharacters_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("an@#$");
        Assertions.assertFalse(result);
    }

    //Last Name In Proper Way
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Chandran");
        Assertions.assertTrue(result);
    }

    //Test for Lowercase
    @Test
    public void givenLastName_WhenLowerCase_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("chandran");
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
}