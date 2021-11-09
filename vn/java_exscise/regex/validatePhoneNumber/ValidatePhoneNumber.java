package com.java_exscise.regex.validatePhoneNumber;

import com.java_exscise.regex.checkClassName.ValidateClassName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String VALIDATECLASSNAME = "^[(]+[0-9]+[)]-[(0]+[0-9]{9}[)]";
    private boolean checkPattern(String phoneNumber){
        pattern = Pattern.compile(VALIDATECLASSNAME);
        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        boolean result = validatePhoneNumber.checkPattern(" (84)-(0978489648)");
        System.out.println(result);
    }
}
