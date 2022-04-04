package com.blz.userregistrationjunit;

import java.util.regex.Pattern;

public class UserValidator {

    //First Name Regular Expression
    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}";
    //Last Name Regular Expression
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    //Email Address Regular Expression
    private static final String EMAIL_ADDRESS_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";


    //Checking boolean Value for First Name
    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }

    //Checking boolean value for LastName
    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }

    public boolean validateEmailAddress(String email) {
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        return pattern.matcher(email).matches();
    }
}
