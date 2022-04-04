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

    @Test
    public void givenFirstName_WhenImroper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("asim");
        Assertions.assertFalse(result);
    }
}
