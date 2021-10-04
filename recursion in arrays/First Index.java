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
    int index = firstIndex(arr, 0, x);
    System.out.println(index);
  }

  public static int firstIndex(int[] arr, int idx, int x) {
    //if index reaches to the last means no element found
    if (idx == arr.length) return -1;
    //start cheking from the begining and return if found at first encounter
    if (arr[idx] == x)
      return idx;
    else
    {
      int a = firstIndex(arr, idx + 1, x);
      return a;
    }

  }

}
