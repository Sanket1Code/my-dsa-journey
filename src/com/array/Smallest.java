package com.array;

public class Smallest {
    static void main() {
        int arr[] = {2, 4, 5, 11, 1, 2};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
