/*
index -->  0 1 2

arr1  =    9 9 9  <----  size 3 
arr2  =        1  <----  size 1
          -------
res   =   1 0 0 0  <----  size 4, if max of both input array is n then resultant array would be of size n+1
array
index --> 0 1 2 3
*/
         
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
   int n1 = scn.nextInt();
   int[] arr1 = new int[n1];
   for(int i=0; i<n1 ;i++)
    arr1[i] = scn.nextInt();
  
     int n2 = scn.nextInt();
   int[] arr2 = new int[n2];
   for(int i=0; i<n2 ;i++)
    arr2[i] = scn.nextInt();
    
    
    int i = arr1.length-1;
    int j = arr2.length-1;
    int k = n1>n2 ? n1 : n2;
    int[] res = new int[k+1];//resultant array will be one size larger than both input arrays
    int c = 0;
    while(k>=0)
    {
        int a = i>=0 ? arr1[i] : 0;
        int b = j>=0 ? arr2[j] : 0;
        int sum = a+b+c;
        int d = sum%10;
        c = sum/10;
        res[k] = d;
        i--;
        j--;
        k--;
    }
    
    for(k=0; k<res.length; k++)
    {
        if(res[k]==0&&k==0);
        else
         System.out.println(res[k]);
    }
 }

}
