package com.risingarr.main;

public class Main {
    public static void main(String[] args) {
        int[] arr = ArrUtills.randomRisingNumber(10,25,100);
        for (int a: arr
             ) {
            System.out.print(a+" ");
        }
    }
}
