/*
        fcol
         |
         V
frow --> 11 12 13 14 15 16 17
         21 22 23 24 25 26 27
         31 32 34 35 36 37 38
         41 42 43 44 45 46 47
         51 52 53 54 55 56 57 <-- lrow
                            ^
                            |
                           lcol
                           
         *  *****************
         *  *  ***********  *  
         *  *  *   ****  *  *
         *  *  ********  *  *
         *  **************  *
         *  *****************
         
   Output : - 11 21 31 41 51 52 53 54 55 56 57 47 38 27 17 16 15 14 13 12 22 32 42 43 44 45 46............36      
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int r =  scn.nextInt();
    int c = scn.nextInt();
  
    int[][] arr = new int[r][c];
   
    for(int i=0; i<r; i++)
    {
        for(int j=0; j<c; j++)
        {
            arr[i][j] = scn.nextInt();
        }
    }
    int frow = 0, fcol =0;
    int lrow = arr.length-1;
    int lcol = arr[0].length-1;
    int count=0;
    int size = r*c;
    while(count<size)
    {
        //left wall
        for(int i=frow, j=fcol; i<=lrow; i++)
        {
            if(count>=size)
             break;
            System.out.println(arr[i][j]);
            count++;
            
        }
        fcol++;
        //botton wall
        for(int i=lrow, j=fcol; j<=lcol; j++)
        {
            if(count>=size)
             break;
            System.out.println(arr[i][j]);
            count++;
            
        }
        lrow--;
        //right wall
        for(int i=lrow, j=lcol; i>=frow; i--)
        {
            if(count>=size)
             break;
            System.out.println(arr[i][j]);
            count++;
          
        }
        lcol--;
        //topwall
        for(int i=frow, j=lcol; j>=fcol; j--)
        {
            if(count>=size)
             break;
            System.out.println(arr[i][j]);
            count++;

        }
        frow++;
        
    }
    
    
    }

}
