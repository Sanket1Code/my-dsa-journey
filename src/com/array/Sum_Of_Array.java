package com.array;

public class Sum_Of_Array {
    static void main(String[] args) {
        int[] arr = {2, 3, 45, 6};
        int sum = 0;
        for (int j : arr) {
            sum +=j;
        }
        System.out.println("Sum of array is: " + sum);
    }
}
