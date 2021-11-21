package com.thawbaan.javaalgorithms.katherinehodge.stringalgorithms;

public class ReverseString {

    static final String string1 = "Soban";

    public static String reverse(String s) {
        if(s == null || s.isEmpty()){
            return s;
        }
        StringBuilder revered = new StringBuilder();

        for(int i = s.length() - 1; i >= 0; i--){
            revered.append(s.charAt(i));
        }
        return revered.toString();
    }

    public static String reverse2(String s){
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse(string1));
        System.out.println(reverse2(string1));
    }
}
