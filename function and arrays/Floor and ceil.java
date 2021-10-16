import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++)
      arr[i] = scn.nextInt();
      
      int d = scn.nextInt();
      int lo =0; 
      int hi = arr.length-1;
      int floor = 0, ceil = 0;
      while(lo<=hi)
      {
          int mid = (lo+hi)/2;
          if(d<arr[mid])
          {
              ceil = arr[mid];
              hi = mid-1;
          }
          else if(d>arr[mid])
          {
              floor = arr[mid];
              lo = mid+1;
          }
          else
          {
              ceil = arr[mid];
              floor = arr[mid];
              break;
          }
      }
      
      System.out.println(ceil+ "\n"+floor);
 }

}
