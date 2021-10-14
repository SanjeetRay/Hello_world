
package com.company;
import java.io.*;
import java.util.*;

public class Test3 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);
        int ele =  scn.nextInt();
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int left = 0;
        int right = arr.length-1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(ele>arr[mid])
            {
                left = mid+1;
            }
            else if (ele<arr[mid])
            {
                right = mid-1;
            }
            else
            {
                System.out.println("element present at "+mid);
                return;
            }

        }
        System.out.println("not found");


    }

}
