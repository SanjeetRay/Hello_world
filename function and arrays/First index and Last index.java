import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
   int n = scn.nextInt();
   int[] arr = new int[n];
   for(int i=0; i<n ;i++)
    arr[i] = scn.nextInt();
    int d = scn.nextInt();
    
    firstIndex(arr,d);
    lastIndex(arr,d);
 }
 
 public static void firstIndex(int[] arr, int d)
 {
     int lo = 0, hi = arr.length-1;
     int fi =-1;
     while(lo<=hi)
     {
         int mid = (lo+hi)/2;
         if(d<arr[mid])
         {
             hi = mid-1;
         }
         else if (d>arr[mid])
         {
             lo = mid+1;
         }
         else
         {
             fi = mid;   // we dont have to break and stop the loop here instead lower the hi pointer till we get the lowest index of the repeted element.
             hi = mid-1; 
         }
     }
     System.out.println(fi);
 }
 
 public static void lastIndex(int[] arr, int d)
 {
      int lo = 0, hi = arr.length-1;
     int li =-1;
     while(lo<=hi)
     {
         int mid = (lo+hi)/2;
         if(d<arr[mid])
         {
             hi = mid-1;
         }
         else if (d>arr[mid])
         {
             lo = mid+1;
         }
         else
         {
             li = mid;   // smilarly here just increment the lo pointer till we get the heighest index of the repeating element.
             lo  = mid+1;
         }
     }
     System.out.println(li);
 }

}
