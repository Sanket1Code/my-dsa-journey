package com.array;

public class Remove_Duplicate {
    static void main() {
        int[] arr = {1, 2, 3, 3, 4, 5, 6, 6};

        int start = 0;
      //  int right = 1;
        for (int right=1;right< arr.length-1; right++) {

            if (arr[start] != arr[right]) {
                start++;
                arr[start] = arr[right];

            }
        }
        for (int i=0;i<=start;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
