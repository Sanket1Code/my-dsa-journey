package com.array;

public class ArrIsPanlindrome {
    static void main() {
        int[] arr = {1, 7, 3, 2, 1};
        int start = 0;
        int end = arr.length - 1;
        boolean Palindrome = true;
        while (start < end) {

            if (arr[start] != arr[end]) {
                Palindrome = false;
                break;
            }
            start++;
            end--;

        }
        if (Palindrome) {
            System.out.println("array is palindrome ");

        } else {
            System.out.println("array is not palindrgome ");
        }

    }
}
