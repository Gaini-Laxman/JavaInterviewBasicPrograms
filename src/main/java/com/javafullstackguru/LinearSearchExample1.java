package com.javafullstackguru;

public class LinearSearchExample1 {
    public static void main(String[] args) {
        int[] arr = {8,4,3,2,5,1};
        int target = 6;
        int index = LinearSearch(arr, target);
        if(index != -1){
            System.out.println(target+", Found at index : "+index);
        }else{
            System.out.println(target+", not found in array");
        }
    }
    private static int LinearSearch(int[] arr, int target) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
