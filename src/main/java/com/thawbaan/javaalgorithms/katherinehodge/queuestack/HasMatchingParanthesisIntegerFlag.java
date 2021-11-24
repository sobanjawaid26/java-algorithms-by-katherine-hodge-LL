package com.thawbaan.javaalgorithms.katherinehodge.queuestack;

import java.util.Stack;

public class HasMatchingParanthesisIntegerFlag {

    public static boolean hasMatchingParanthesis(String s){

        int matchingSymbolTracker = 0;

        for(int i = 0; i< s.length(); i++){
            char current = s.charAt(i);
            if(current == '('){
                matchingSymbolTracker++;
            } else if(current == ')'){
                if(matchingSymbolTracker > 0 ){
                    matchingSymbolTracker--;
                } else {
                    return false;
                }
            }
        }
        return matchingSymbolTracker == 0;
    }

    public static void main(String[] args) {

        System.out.println(hasMatchingParanthesis("((algorithm()))"));
        System.out.println(hasMatchingParanthesis("()(algorithm())"));
        System.out.println(hasMatchingParanthesis("((algorithm))"));
        System.out.println(hasMatchingParanthesis("(algorithm)"));

        System.out.println();

        System.out.println(hasMatchingParanthesis("(algorithm("));
        System.out.println(hasMatchingParanthesis(")algorithm)"));
        System.out.println(hasMatchingParanthesis(")algorithm("));
        System.out.println(hasMatchingParanthesis("algorithm(("));
        System.out.println(hasMatchingParanthesis("(algorithm"));
        System.out.println(hasMatchingParanthesis("((algorithm)"));
    }
}
