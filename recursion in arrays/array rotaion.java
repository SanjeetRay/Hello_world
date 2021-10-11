//rotating the array by k positions to the right
package com.company;

import java.util.Scanner;

public class Test4 {
    public static void main (String[]args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        k = (arr.length+k%arr.length)%arr.length;
        //int[] res = rotateBruteForce(arr, k);
        int[] res = rotateOptimized(arr, k);
        for(int i=0; i<res.length; i++)
            System.out.print(res[i]+" ");
    }
    // shifting each elements n times for K rotations O(n.k) or On^2 complexity
    public static int[] rotateBruteForce(int[] arr, int k)
    {
        for(int i=0; i<k; i++)
        {
            int last = arr[arr.length-1];
            for(int j=arr.length-1; j>0; j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        return arr;
    }
    //by reversing the array itself with O(n) time and O(1) space complexity
    public static int[] rotateOptimized(int[] arr, int k)
    {
        int l = arr.length;
        reverse(arr, 0,l-k-1);
        reverse(arr, l-k, l-1);
        reverse(arr, 0, l-1);
        return arr;
    }
    public static int[] reverse(int[] arr, int left, int right)
    {
        while(left<right)
        {
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right]=temp;
           left++;
           right--;
        }
        return arr;
    }
}
