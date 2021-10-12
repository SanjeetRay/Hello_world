import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
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

    // traversing row wise one by one
    for (int i = 0; i < arr.length; i++)
    {
          // for the ith row we find the min element at the jth column
          int min = arr[i][0];
          int saddle = 0;
          for (int j = 0; j < arr[0].length; j++)
          {
            if (arr[i][j] < min)
            {
              min = arr[i][j];  // findig min element in a row at perticula j and
              saddle = j;       // storing the value of j for which it is minimum
    
            }
           
          }
         
          // for that perticular jth column we traverse from top to bottom and find if any maximum element exists or not in that column.
          boolean issaddle = true;
          for (int j = 0; j < arr.length; j++)
          {
            if (arr[j][saddle] > min)
            {
              issaddle = false;
              break;
            }
          }
    
          if (issaddle == true)
           {
                System.out.println(min);
                return;
           }
         
            
    }
    System.out.println("Invalid input");

  }

}
