package com.blz.userregistrationjunit;

import java.util.regex.Pattern;

public class UserValidator {

    //First Name Regular Expression
    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}";

    //Checking boolean Value for First Name
    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
}
