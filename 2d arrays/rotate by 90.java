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
