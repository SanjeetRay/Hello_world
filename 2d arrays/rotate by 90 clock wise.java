/*
   1. Transpose the matrix
   2. Reverse the values in rows of transforse matrix and we will get 90 clockwise rotated array.
   
   
                             ----->
  input matrix -->   {1, 2, 3, 4}, |                      1 5 9  13
                     {5, 6, 7, 8}, |        transpose-->  2 6 10 14
                     {9,10,11,12}, V                      3 7 11 15
                     {13,14,15,16}                        4 8 12 16


   Ansr matrix
   
    13  9 5 1
    14 10 6 2
    15 11 7 3
    16 12 8 4
   
  ****** NOTE --> for 90 anticlockwise just do the step 1 and reverse the elements of columns.******
                           
 */
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
    int r1 =  scn.nextInt();

  
    int[][] arr = new int[r1][r1];
   
    for(int i=0; i<r1; i++)
    {
        for(int j=0; j<r1; j++)
        {
            arr[i][j] = scn.nextInt();
        }
    }
    
     for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
           
        }
        
    for(int i=0; i<arr.length; i++)
    {
        int li =0;
        int ri= arr[0].length-1;
        while(li<ri)
        {
            int temp = arr[i][li];
            arr[i][li] = arr[i][ri];
            arr[i][ri]= temp;
            
            li++;
            ri--;
        }
    }
    
    display(arr);
    
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
