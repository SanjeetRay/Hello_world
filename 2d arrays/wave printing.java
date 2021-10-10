
/*

 1  2  3  4
 5  6  7  8
 9 10 11 12


row wise output --> 1 2 3 4 8 7 6 5 9 10 11 12
column wise output --> 1 5 9 10 6 2 3 7 11 12 8 4

*/
import java.util.*;

public class Test1 {


    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = arr.length;
        int size = 0;
        int c = 0;
        int[] res = new int[size];
        // row wise printing
        /*

        left to right ---->
        right to left <---

        */
        for(int i=0;i<n;i++)
        {
            if(i%2==0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else
            {
                for (int j = n-1; j >=0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        System.out.println();

        //column wise printing
        /*
            top to bottom 
            bottom to top
            
        */
        for(int j=0;j<n;j++)
        {
            if(j%2==0) {
                for (int i= 0; i < n; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else
            {
                for (int i = n-1; i >=0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }

        }

    }
}
