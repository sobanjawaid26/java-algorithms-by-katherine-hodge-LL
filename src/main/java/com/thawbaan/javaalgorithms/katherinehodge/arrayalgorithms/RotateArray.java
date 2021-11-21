package com.thawbaan.javaalgorithms.katherinehodge.arrayalgorithms;

import java.util.Arrays;

/**

 Rotate array by one space to the left
 {1,2,3,4,5,6};
 {2,3,4,5,6,1};

 **/

public class RotateArray {

    public static int[] rotateArrayLeft(int arr[]){
        int first = arr[0];
        for(int i = 0; i< arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        return arr;
    }

    public static int[] rotateArrayRight(int[] arr){
        int temp = arr[arr.length - 1];
        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println("Print left rottate");
        rotateArrayLeft(arr);
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("Print right rottate");
        arr = new int[]{1, 2, 3, 4, 5, 6};
        rotateArrayRight(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}