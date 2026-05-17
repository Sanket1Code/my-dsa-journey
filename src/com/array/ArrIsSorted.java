package com.array;

public class ArrIsSorted {

    static boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        boolean result = isSorted(arr);

        System.out.println(result);
    }
}