package com.thawbaan.javaalgorithms.katherinehodge.stringalgorithms;

public class ReverseEachWordInSentence {

    static final String string1 = "This is a cute cat";
    static final String string2 = "Sally is a great worker";
    static final String string3 = "what can I do today";

    public static String[] reverseEachWordInSentence(String s){
        String wordArr[] = s.split(" ");
        String[] result = new String[wordArr.length];
        for (int i = 0; i < wordArr.length; i++){
            String reversedWord = new StringBuilder(wordArr[i]).reverse().toString();
            result[i] = reversedWord;
        }
        for(String st : result){
            System.out.print(st + " ");
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(reverseEachWordInSentence(string1).length);
        reverseEachWordInSentence(string1);
    }
}
