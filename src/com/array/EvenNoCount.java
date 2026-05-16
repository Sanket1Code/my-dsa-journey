package com.array;

public class EvenNoCount {
    static void main() {
        int[] arr = {2, 4, 3, 1, 6, 5, -8};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
