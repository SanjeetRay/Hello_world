/*

11 12 13 14 
21 22 23 24
31 32 33 34
41 42 43 44

*/

package com.company;
import java.io.*;
import java.util.*;

public class Test3 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);
        int r1 =  scn.nextInt();


        int[][] arr = new int[r1][r1];

        for (int i = 0; i < r1; i++)
        {
            for (int j = 0; j < r1; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        int ele = scn.nextInt();

        int i= 0, j=arr[0].length-1;
        int count =0;
        while(j>=0)
        {
            if(ele>arr[i][j])
            {
                i++;

            }
            else if(ele<arr[i][j])
            {
                j--;
            }
            else if(arr[i][j]==ele)
            {
                System.out.println("element found at "+i+ ","+ j);
                return;
            }
        }
        System.out.println("element not found");

    }

}
