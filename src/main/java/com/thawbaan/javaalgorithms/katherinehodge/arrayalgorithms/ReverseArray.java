package com.thawbaan.javaalgorithms.katherinehodge.arrayalgorithms;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverse(int[] arr){
        int[] result = new int[arr.length];

        for(int i = 0; i<arr.length; i++){
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public static int[] revereseArrayInPlace(int[] arr){
        for(int i = 0; i< arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        //        Arrays.stream(reverse(arr)).forEach(System.out::println);
        Arrays.stream(revereseArrayInPlace(arr)).forEach(System.out::println);

    }
}
