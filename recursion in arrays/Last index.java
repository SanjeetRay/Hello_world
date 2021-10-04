import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = scn.nextInt();
    int x = scn.nextInt();
    int index = lastIndex(arr, arr.length-1, x);
    System.out.println(index);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        //if index reaches to the start means no element found
        if(idx==0)
         return -1;
        //start checking from the end
        if(arr[idx]==x)
          return idx;
        else
         {
             int a = lastIndex(arr, idx-1, x);
             return a;
         }
    }

}
