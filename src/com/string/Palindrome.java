package com.string;

public class Palindrome {
    static void main() {
        String str = "madam";
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("False");
                return;
            }
            left++;
            right--;
        }
        System.out.println("true");
    }
}
