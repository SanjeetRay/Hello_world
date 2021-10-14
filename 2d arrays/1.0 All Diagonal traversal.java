/*

11 12 13 14 
21 22 23 24
31 32 33 34
41 42 43 44

Printing diagonally top to down
41 
31 42 
21 32 43 
11 22 33 44 
12 23 34 
13 24 
14 
printing diagonally down to top
41 
42 31 
43 32 21 
44 33 22 11 
34 23 12 
24 13 
14

*/

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

        pirntDiagonalTopToDown(arr);
        printDiagonalDownToTop(arr);

    }

    public static void pirntDiagonalTopToDown(int[][] arr)
    {
        System.out.println("Printing diagonally top to down");
        for(int gap = arr.length-1; gap>=0; gap--)
        {
            for(int row = gap, col= 0; row<arr.length; row++, col++)
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }


        for(int gap = 1; gap<arr.length; gap++)
        {
            for(int row = 0, col= gap; col<arr.length; row++, col++)
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }

    public static void printDiagonalDownToTop(int[][] arr)
    {
        System.out.println("printing diagonally down to top");
        for(int dia = 0; dia<=arr.length-1; dia++)
        {
            for(int row = arr.length-1, col= dia; col>=0; row--, col--)
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        for(int dia = arr.length-2; dia>=0; dia--)
        {
            for(int row = dia, col= arr.length-1; row>=0; row--, col--)
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }

}
