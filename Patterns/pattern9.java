import java.util.*;
class Test1{
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int spaces = n/2;
       int stars = 1;
       for(int i=0;i<n;i++)
       {
           for(int j=0; j<n; j++)
           {
               if(j==i || i+j==n-1)
                System.out.print("*\t");
                else
                System.out.print("\t");
           }
           
         System.out.println();
       }
    }
}

/*

5
*                               *
        *               *
                *
        *               *
*                               *

*/