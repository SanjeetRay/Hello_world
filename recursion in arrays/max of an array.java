import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = scn.nextInt();
    //int x = scn.nextInt();
    int index = maxOfArray(arr, 0);
    System.out.println(index);
  }
    

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length-1)
         return arr[idx];
         
        int currentval = arr[idx];
        int msf = maxOfArray(arr, idx+1);
        return Math.max(currentval,msf);
    }

}
