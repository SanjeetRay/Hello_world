/*

arr = 1 2 3 4 5
k = 2
left rotation by 2 elements or 2 times = 3 4 5 1 2

*/
import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] arr, int k){
    int n = arr.length;
    k = (n + k%n)%n;  //handling negative as well as positive values of rotaion greater than no of elements of array. example 10, 17, -6, -1 etc.
    
    reverse(arr, 0, n-k-1);
    reverse(arr, n-k, n-1);
    reverse(arr, 0, n-1);
  }
  
  public static void reverse(int[] arr, int start, int end)
  {
      while(start<end)
      {
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end --;
      }

  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}
