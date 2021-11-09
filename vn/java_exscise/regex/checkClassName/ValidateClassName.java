package com.java_exscise.regex.checkClassName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static Pattern pattern;
    private  Matcher matcher;

    private static final String VALIDATECLASSNAME = "^[C,A,P][0-9]{4}[G, H, I, K, L, M]";
    public boolean checkPattern(String nameClass){
        pattern = Pattern.compile(VALIDATECLASSNAME);
        matcher = pattern.matcher(nameClass);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidateClassName validateClassName = new ValidateClassName();
        boolean result = validateClassName.checkPattern("C0318G");
        System.out.println(result);
    }
}
