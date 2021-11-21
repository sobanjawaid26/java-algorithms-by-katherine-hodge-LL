package com.thawbaan.javaalgorithms.katherinehodge.stringalgorithms;

public class CustomParsingSearchingString {

    static final String string1= "Soban";

    public static boolean isAtEvenIndex(String s, char item){
        if(s == null || s.isEmpty()){
            return false;
        }

        for (int i = 0; i < s.length(); i = i + 2){
            if(s.charAt(i) == item)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAtEvenIndex(string1, 'S'));
        System.out.println(isAtEvenIndex(string1, 'o'));
        System.out.println(isAtEvenIndex(string1, 'b'));
        System.out.println(isAtEvenIndex(string1, 'a'));
        System.out.println(isAtEvenIndex(string1, 'n'));
    }
}
