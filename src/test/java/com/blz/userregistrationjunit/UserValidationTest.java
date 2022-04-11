package com.blz.userregistrationjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.FirstNameValidate("Anju");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.FirstNameValidate("an");
        Assertions.assertFalse(result);			}

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.LastNameValidate("Anju");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.LastNameValidate("an");
        Assertions.assertFalse(result);			}

    @Test
    public void givenEmailAddress_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.emailValidator("anju162@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmailAddress_WhenInvalid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.emailValidator("abc()*@gmail.com");
        Assertions.assertFalse(result);			}

    @Test
    public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.phoneNumberValidator("919923456789");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenInvalid_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.phoneNumberValidator("9825236");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.passwordValidator("Anju@123");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenInvalid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.passwordValidator("anju@#$12");
        Assertions.assertFalse(result);
    }
}