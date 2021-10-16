package com.company;

import java.util.*;

public class Test2 {


    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int[] arr = new int[n];
       for(int i=0 ;i< n; i++)
       {
           arr[i] = scn.nextInt();
       }

       int[] res = new int[n];
       for(int i = 0; i< arr.length; i++)
       {
           int count = 0;
           for(int j=i ; j>=0; j--)
           {
                if(arr[j] <= arr[i])
                   count++;
                else break;
           }

           res[i] = count;
       }
        for(int i=0 ;i< n; i++)
        {
            System.out.print(res[i] + " ");
        }

    }

}

