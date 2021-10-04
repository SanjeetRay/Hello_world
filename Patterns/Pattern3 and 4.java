import java.util.*;
class Test1{
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int spaces = n-1;
       int stars = 1;
	   /*
	    for pattern 4 spaces =0 and stars = n initially.
		and then stars decreases and spaces increases.
		*/
       for(int i=0;i<n;i++)
       {
           for(int j=0; j<spaces; j++)
           {
               System.out.print("\t");
           }
           for(int j=0;j<stars;j++)
           {
               System.out.print("*\t");
           }
           stars++;
           spaces--;
           System.out.println();
       }
    }
}


/*

pattern 3
- - - - *
- - - * *
- - * * *
- * * * *
* * * * *


pattern 4
* * * * *
- * * * *
- - * * *
- - - * *
- - - - *

*/