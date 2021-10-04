import java.util.*;
class Test1{
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int val;
       int a=0, b=1;
       for(int i=1; i<=n ; i++)
       {
         for(int j=1; j<=i; j++)
         {
          System.out.print(a +"\t");
           val = a+b;
           a=b;
           b=val;
           
         }
         System.out.println();
       }
    }
}

/*
4
0
1       1
2       3       5
8       13      21      34
*/