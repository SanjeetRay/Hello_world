import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n =  scn.nextInt();
    int m = scn.nextInt();

    int[][] arr1 = new int[n][m];

    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < m; j++)
      {
        arr1[i][j] = scn.nextInt();
      }
    }

    int shell = scn.nextInt();
    int k = scn.nextInt();

    int[] ring = getRing(arr1, shell);
    
    k = (ring.length + k%ring.length)%ring.length;
    
    int[] rng = rotate(ring, k);

    int[][] res = getFilledArray(arr1, rng, shell);
    
    display(res);

  }

  public static int[] getRing(int[][] arr, int shell)
  {
    int n = arr.length, m = arr[0].length;
    int frow = shell - 1, fcol = shell - 1;
    int lrow = n - shell, lcol = m - shell;
    int sizeofring = 2 * ((lrow - frow) + 1) + 2 * ((lcol - fcol) + 1) - 4;

    int[] res = new int[sizeofring];

    int count = 0;
    //left wall
    for (int i = frow, j = fcol; i <= lrow; i++)
    {
      res[count] = arr[i][j];
      count++;

    }
    fcol++;

    //bottom wall
    for (int i = lrow, j = fcol; j <= lcol; j++)
    {
      res[count] = arr[i][j];
      count++;

    }
    lrow--;

    //right wall
    for (int i = lrow, j = lcol; i >= frow; i--)
    {
      res[count] = arr[i][j];
      count++;

    }
    lcol--;;

    //top wall
    for (int i = frow, j = lcol; j >= fcol; j--)
    {
      res[count] = arr[i][j];
      count++;

    }
    return res;
  }
  public static int[][] getFilledArray(int[][] arr, int[]res, int shell)
  {
    int n = arr.length;
    int m = arr[0].length;
    int frow = shell - 1, fcol = shell - 1;
    int lrow = n - shell, lcol = m - shell;



    int count = 0;
    //left wall
    for (int i = frow, j = fcol; i <= lrow; i++)
    {
      arr[i][j] = res[count];
      count++;

    }
    fcol++;

    //bottom wall
    for (int i = lrow, j = fcol; j <= lcol; j++)
    {
      arr[i][j] = res[count];
      count++;

    }
    lrow--;

    //right wall
    for (int i = lrow, j = lcol; i >= frow; i--)
    {
      arr[i][j] = res[count];
      count++;

    }
    lcol--;;

    //top wall
    for (int i = frow, j = lcol; j >= fcol; j--)
    {
      arr[i][j] = res[count];
      count++;

    }
    return arr;
  }
  
  public static int[] rotate(int[] ring, int k)
  {
      
    int l = ring.length;
    reverse(ring, 0, l - k - 1);
    reverse(ring, l - k, l - 1);
    reverse(ring, 0, l - 1);
    return ring;
  }

  public static int[] reverse(int[] arr, int left, int right)
  {
    while (left < right)
    {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
    return arr;
  }

  public static void display(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

}
