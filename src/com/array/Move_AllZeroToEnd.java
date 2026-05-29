package com.array;

import java.util.Arrays;

public class Move_AllZeroToEnd {
    static void main() {
        int[] arr = {2, 4, 0, 1, 0, 3};
        int insert = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[insert] = arr[i];
                insert++;
            }
        }
        while (insert < arr.length) {
            arr[insert] = 0;
            insert++;
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
