package com.javafullstackguru;

public class ReverseWord1 {
    public static void main(String[] args) {
        String s="AAA,BBB,CCC";
        String[] arr = s.split(",");
        StringBuilder sb = new StringBuilder();
        for(int i= arr.length-1; i>=0; i--){
            sb.append(arr[i]);
            if(i>0){
                sb.append(",");
            }
        }
        System.out.println(sb);
    }
}
