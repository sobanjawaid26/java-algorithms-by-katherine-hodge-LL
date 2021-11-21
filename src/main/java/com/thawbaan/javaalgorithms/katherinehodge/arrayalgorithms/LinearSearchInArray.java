package com.thawbaan.javaalgorithms.katherinehodge.arrayalgorithms;

import java.util.Arrays;
import java.util.OptionalInt;

public class LinearSearchInArray {

    static final int arr[] = {1,2,3,4,5,6,7,8,9};

    static boolean linearSearch(int[] arr, int item){
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == item)
                return true;
        }
        return false;
    }

    static OptionalInt linearSearch2(int[] arr, int item){
        return Arrays.stream(arr).filter(n -> n == item).findFirst();
    }

    public static void main(String[] args) {
        System.out.println(linearSearch(arr, 1));
        System.out.println(linearSearch(arr, 10));
        System.out.println("Using Stream");
        linearSearch2(arr, 1).ifPresent(System.out::println);
        linearSearch2(arr, 10).ifPresent(System.out::println);
    }
}
