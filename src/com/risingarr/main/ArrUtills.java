package com.risingarr.main;

public class ArrUtills {
    public static int randomNumber(int min, int max) {
        return (int) ((max - min) * Math.random() + min);
    }

    public static int[] randomRisingNumber(int length, int min, int max) {
        int[] arr = new int[length];
        int size, h_max, h_min = min;
        size = Math.round((max - min) / length);
        for (int i = 0; i < arr.length; i++) {
            int h_x = i + i * size;
        h_max = h_min + h_x + size < max ? h_min + h_x + size : max; ;
            min = randomNumber(min, h_max);
            arr[i] = min;
        }
        return arr;
    }
}
