package com.thawbaan.javaalgorithms.katherinehodge.stringalgorithms;

public class ParsingSearchingString {

    static final String string1 = "HeLLo";

    public static void parseContents(String s){
        System.out.println("Option 1");
        for (char c : s.toCharArray()){
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Option 2");
        for (int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
//        System.out.println(parseContents(string1));
        parseContents(string1);
    }
}
