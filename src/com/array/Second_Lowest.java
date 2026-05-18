package com.array;

public class Second_Lowest {
    static void main() {
        int[] arr = {4, 5, 2, 9, 11};
        int min = Integer.MAX_VALUE;
        int SecMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                SecMin = min;
                min = arr[i];
            } else if (arr[i] < min && arr[i] != min) {

                SecMin = arr[i];

            }
        }
        if (SecMin == Integer.MAX_VALUE) {
            System.out.println("No second minimum found (all elements are same)");
        } else {
            System.out.println("Second Lowest: " + SecMin);
        }
    }
}
