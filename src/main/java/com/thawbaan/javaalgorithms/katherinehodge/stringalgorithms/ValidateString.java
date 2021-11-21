package com.thawbaan.javaalgorithms.katherinehodge.stringalgorithms;

public class ValidateString {

    static final String string1 = "soban";
    static final String password = "MyPassword@";

    public static boolean isUpperCase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }
    public static boolean isLowerCase(String s){
        return s.chars().noneMatch(Character::isUpperCase);
    }
    public static boolean isLowerCase2(String s){
        return s.chars().allMatch(Character::isLowerCase);
    }

    // Valiating more specific properties
    public static boolean isPasswordComplex(String s){
        return (s.chars().anyMatch(Character::isLowerCase)
                && s.chars().anyMatch(Character::isUpperCase)
                && s.chars().anyMatch(Character::isDigit)
                );
    }

    public static void main(String[] args) {
        System.out.println(isUpperCase(string1));
        System.out.println(isLowerCase(string1));
        System.out.println(isLowerCase2(string1));
        System.out.println(isPasswordComplex(password));
    }
}
