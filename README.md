# Ring_rotate
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] arr = new int[n][m];
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < m; j++)
      {
        arr[i][j] = scn.nextInt();
      }
    }

    int s = scn.nextInt();
    int r = scn.nextInt();
    // extracting the shell out of the matrix and storing it into one-D array
    int[] oneD = getShell(arr, s);
    // rotating the one - D array obtained
    rotate(oneD, r);
    // filling back the rotated array in place into the matrix
    fillShell(oneD, arr, s);
    display(arr);
  }

  public static int[] getShell(int[][] arr, int s)
  {
    int n  = arr.length, m = arr[0].length;
    int frow = s - 1, fcol = s - 1;
    int lrow = n - s,  lcol = m - s;

    int size = 2 * (lrow - frow) + 2 * (lcol - fcol);
    int count = 0;
    int[] oneD = new int[size];
    while (count < size)
    {
      //left wall
      int col = fcol;
      for (int row = frow; row <= lrow; row++)
      {
        // extracting the shell into a one-D array
        oneD[count] = arr[row][col];
        count++;
        if (count == size)
          return oneD;
      }
      // To avoid repetition of bottom left corner element
      fcol++;

      //bottom wall
      int row = lrow;
      for (col = fcol; col <= lcol; col++)
      {
        // extracting the shell into a one-D array
        oneD[count] = arr[row][col];
        count++;
        if (count == size)
          return oneD;
      }
      // To avoid repetition of bottom right corner element
      lrow--;

      //right wall
      col = lcol;
      for (row = lrow; row >= frow; row--)
      {
        // extracting the shell into a one-D array
        oneD[count] = arr[row][col];
        count++;
        if (count == size)
          return oneD;
      }
      // To avoid repetition of top right corner element
      lcol--;

      //top wall
      row = frow;
      for (col = lcol; col >= fcol; col--)
      {

        oneD[count] = arr[row][col];
        count++;
        if (count == size)
          return oneD;
      }
      

    }
    return oneD;
  }

  public static void rotate(int[] oneD, int r)
  {
    int n = oneD.length;
    r = (r % n + n) % n;
    reverse(oneD, 0, n - 1 - r);
    reverse(oneD, n - 1 - r + 1, n - 1);
    reverse(oneD, 0, n - 1);
  }

  public static void reverse(int[] a, int s, int e)
  {
    int left = s;
    int right = e;
    while (left < right)
    {
      int temp = a[left];
      a[left] = a[right];
      a[right] = temp;
      left++;
      right--;
    }
  }

  public static void fillShell(int[] oneD, int[][] arr, int s)
  {
    int n  = arr.length, m = arr[0].length;
    int frow = s - 1, fcol = s - 1;
    int lrow = n - s,  lcol = m - s;

    int size = 2 * (lrow - frow) + 2 * (lcol - fcol);
    int count = 0;

    while (count < size)
    {
      //left wall
      int col = fcol;
      for (int row = frow; row <= lrow; row++)
      {
        // code for filling back the rotated array into the matrix
        arr[row][col] = oneD[count];
        count++;
        if (count == size)
          return ;
      }
      // To avoid repetition of bottom left corner element
      fcol++;

      //bottom wall
      int row = lrow;
      for (col = fcol; col <= lcol; col++)
      {
        // code for filling back the rotated array into the matrix
        arr[row][col] = oneD[count];
        count++;
        if (count == size)
          return ;
      }
      // To avoid repetition of bottom right corner element
      lrow--;

      //right wall
      col = lcol;
      for (row = lrow; row >= frow; row--)
      {
        // code for filling back the rotated array into the matrix
        arr[row][col] = oneD[count];
        count++;
        if (count == size)
          return ;
      }
      // To avoid repetition of top right corner element
      lcol--;

      //top wall
      row = frow;
      for (col = lcol; col >= fcol; col--)
      {
        // code for filling back the rotated array into the matrix
        arr[row][col] = oneD[count];
        count++;
        if (count == size)
          return ;
      }

    }
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

