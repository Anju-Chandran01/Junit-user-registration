package com.blz.userregistrationjunit;

import java.util.regex.Pattern;

public class UserValidator {
    //First Name Regular Expression
    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}";
    //Last Name Regular Expression
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    //Email Address Regular Expression
    private static final String EMAIL_ADDRESS_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";;
    //Phone Number Regular Expression
    private static final String PHONE_NUMBER_PATTERN = "^[0-9]{2}+[\\s][0-9]{10}$";
    //Password Regular Expression
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?!(?:.*[!@#$%^&*]){2})[a-zA-Z0-9!@#$%^&*]{8,}$";

    //Checking boolean Value for First Name
    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }

    //Checking boolean Value for Last Name
    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }

    //Checking boolean Value for Email Address
    public boolean validateEmailAddress(String email) {
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        return pattern.matcher(email).matches();
    }

    //Checking boolean Value for Phone Number
    public boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
        return pattern.matcher(phoneNumber).matches();
    }

    //checking boolean value for password
    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}
