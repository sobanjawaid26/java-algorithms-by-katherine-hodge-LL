package com.thawbaan.javaalgorithms.katherinehodge.queuestack;

import java.util.Stack;

public class HasMatchingParanthesis {

    public static boolean hasMatchingParanthesis(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i< s.length(); i++){
            char current = s.charAt(i);
            if(current == '('){
                stack.push(current);
            } else if(current == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
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
