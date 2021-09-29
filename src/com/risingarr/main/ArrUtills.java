package com.risingarr.main;

public class ArrUtills {
    public static int randomNumber(int min, int max) {
        return (int) ((max - min) * Math.random() + min);
    }

    public static int[] randomRisingNumber(int length, int min, int max) {

        ///--------------------------------------------------------
        /// /* testy vysly takto: 10 50 100
        ///                     ->53 60 63 64 73 75 81 84 87 99
        ///                     ->53 58 58 64 64 78 84 89 94 96
        ///                     ->51 54 64 72 73 74 75 95 98 98
        ///                       10 25 100
        ///                     ->26 37 45 53 55 63 71 82 90 98
        ///                     ->31 35 38 44 55 67 77 85 85 98
        ///                     ->30 37 39 41 45 51 57 58 79 96
        ///--------------------------------------------------------

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
