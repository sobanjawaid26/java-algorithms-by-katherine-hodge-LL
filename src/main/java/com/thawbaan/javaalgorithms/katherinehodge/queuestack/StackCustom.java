package com.thawbaan.javaalgorithms.katherinehodge.queuestack;

import java.util.Stack;

public class StackCustom {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        System.out.println("START main");
        stack.add("main");
        System.out.println("START builder");
        stack.add("builder");
        System.out.println("START external-service");
        stack.add("external-service");
        System.out.println("END " + stack.pop());
        System.out.println("START parse-external-data/");
        stack.add("parse-external-data");
        System.out.println("END " + stack.pop());
        System.out.println("END " + stack.pop());
        System.out.println("END " + stack.pop());
    }
}
