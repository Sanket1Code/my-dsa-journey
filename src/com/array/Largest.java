package com.array;

public class Largest {
    static void main() {
        int arr[] = {3, 4, 5, 1, 6, 4};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

