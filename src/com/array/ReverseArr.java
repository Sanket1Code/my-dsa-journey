package com.array;

public class ReverseArr {
    public static void main() {
        int arr[] = {1, 2, 3, 4};
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
