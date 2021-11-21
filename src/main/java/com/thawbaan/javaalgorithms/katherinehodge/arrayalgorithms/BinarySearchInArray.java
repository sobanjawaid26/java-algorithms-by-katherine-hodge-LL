package com.thawbaan.javaalgorithms.katherinehodge.arrayalgorithms;

public class BinarySearchInArray {

    static final int arr[] = {0,1,2,3,4,5,6,7,8,9};

    static int binarySearch(int[] arr, int item){
        int min = 0;
        int max = arr.length - 1;
        while(min <= max){
            int mid = (min + max) / 2;
            if(arr[mid] == item)
                return mid;
            else if(item < arr[mid])
                max = mid - 1;
            else
                min = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(arr,0));
        System.out.println(binarySearch(arr,1));
        System.out.println(binarySearch(arr,2));
        System.out.println(binarySearch(arr,3));
        System.out.println(binarySearch(arr,4));
        System.out.println(binarySearch(arr,5));
        System.out.println(binarySearch(arr,6));
        System.out.println(binarySearch(arr,7));
        System.out.println(binarySearch(arr,8));
        System.out.println(binarySearch(arr,9));
    }
}
