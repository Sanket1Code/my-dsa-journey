package com.array;

public class Second_Largest {
    static void main(String[] args) {

        int[] arr = {10, 20, 5, 8, 15};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {

                secondLargest = arr[i];

            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println(secondLargest);
        }
    }
}
