package com.javafullstackguru;

public class RemoveDuplicateCharacter1 {
    public static void main(String[] args) {
        String s ="laxman";
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            boolean isDuplicate = false;
            char ch = s.charAt(i);
            for (int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if(isDuplicate){
                System.out.println(arr[i]);
            }
        }
    }
}
