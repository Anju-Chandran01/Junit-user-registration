package com.blz.userregistrationjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodTest {

    @Test
    public void happyTestCase() {
        UserValidator validator = new UserValidator();
        boolean resultFirstName = validator.validateFirstName("Anju");
        Assertions.assertTrue(resultFirstName);

        boolean resultLastName = validator.validateLastName("Chandran");
        Assertions.assertTrue(resultLastName);

        boolean resultEmail = validator.validateEmailAddress("anju@123.cvv");
        Assertions.assertTrue(resultEmail);

        boolean resultPhoneNum = validator.validatePhoneNumber("91 9874563210");
        Assertions.assertTrue(resultPhoneNum);

        boolean resultPassword = validator.validatePassword("Anju@007");
        Assertions.assertTrue(resultPassword);
    }

    @Test
    public void sadTestCase() {
        UserValidator validator = new UserValidator();
        boolean resultFirstName = validator.validateFirstName("Anju");
        Assertions.assertTrue(resultFirstName);

        boolean resultLastName = validator.validateLastName("Chandran");
        Assertions.assertTrue(resultLastName);

        boolean resultEmail = validator.validateEmailAddress("anju@123.cvv");
        Assertions.assertTrue(resultEmail);

        boolean resultPhoneNum = validator.validatePhoneNumber("91 9874563210");
        Assertions.assertTrue(resultPhoneNum);

        boolean resultPassword = validator.validatePassword("anju@007");//missing a caps causing fail in test case
        Assertions.assertTrue(resultPassword);
    }
}
