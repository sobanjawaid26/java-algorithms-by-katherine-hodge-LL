package com.thawbaan.javaalgorithms.katherinehodge.stringalgorithms;

public class NormalizeString {

    static final String string1 = "      Hello There, BUDDY ";

    public static String normalizeString(String s){
        return s.toLowerCase().trim().replace(",", "");
//        String loweCased = s.toLowerCase();
//        String trimmed = loweCased.trim();
//        String normalized = trimmed.replace("," , "");
//        return normalized;
    }

    public static void main(String[] args) {
        System.out.println(normalizeString(string1));
    }
}
