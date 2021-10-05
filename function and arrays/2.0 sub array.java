/*

arr[3] = 10|20|30|40

10	
10	20	
10	20	30	
10  20  30  40
20	
20	30	
20	30	40
30	
30	40
40

*/
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for(int i =0 ; i<arr.length; i++)
       arr[i] = scn.nextInt();
       
    for(int i=0; i<arr.length; i++)
    {
        for(int j =i; j<arr.length; j++)
        {
            for(int k=i; k<=j; k++)
            {
                System.out.print(arr[k]+"\t");
            }
            System.out.println();
        }
    }
 }

}
