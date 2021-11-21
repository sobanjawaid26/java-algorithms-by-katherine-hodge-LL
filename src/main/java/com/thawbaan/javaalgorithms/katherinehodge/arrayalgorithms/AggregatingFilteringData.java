package com.thawbaan.javaalgorithms.katherinehodge.arrayalgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class AggregatingFilteringData {

    /**

     We have 2 arrays, we want to create a single array which contains all the
     even numbers from each array
     3 ways
     Merge Arrays and then remove the invalid items
     Check each element and only keep valid items
     Sort each array and take only valid items

     **/

    static int arr1[] = {-9, 3,2,-8,12,-16};
    static int arr2[] = {0,-3,-8,-35,40,20,7};

//    public static int[] mergeArraysWithEvenElements(int[] arr1, int[] arr2){
//        ArrayList<int> res = new ArrayList<int>();
//
//        for(int i = 0; i < arr1.length; i++){
//            if(arr1[i] % 2 == 0)
//                res.add(arr1[i]);
//        }
//
//        for(int j = 0; j < arr2.length; j++){
//            if(arr2[j] % 2 == 0)
//                res.add(arr2[j]);
//        }
//        return res.stream().mapToInt(Integer::intValue).toArray();
//    }

    public static int[] mergeArraysWithEvenElements2(int[] arr1, int[] arr2){
        IntPredicate isEvenPredicate = n -> n % 2 == 0;
        return Stream.of(arr1,arr2)
                .flatMapToInt(Arrays::stream)
                .filter(n -> n % 2 == 0)
                .toArray();
    }

    public static void main(String[] args) {
        int arr1[] = {-9, 3,2,-8,12,-16};
        int arr2[] = {0,-3,-8,-35,40,20,7};

        Arrays.stream(mergeArraysWithEvenElements2(arr1,arr2)).forEach(System.out::println);
    }
}
