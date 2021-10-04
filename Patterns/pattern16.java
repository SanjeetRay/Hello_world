import java.util.*;
class Test1{
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int val=1;
       int space = 2*n-3;
       int fill =1;
       for(int i=1; i<=n ; i++)
       {
         for(int j=1; j<=val; j++)
         {
          System.out.print(fill+"\t"); 
          fill++;
         }
        
         for(int j=1; j<=space; j++)
         {
           System.out.print("\t");
         }
         if(i==n)
         {
           val--;
           fill--;
         }
         for(int j=1; j<=val; j++)
         {
           fill--;
          System.out.print(fill+"\t"); 
         }
          val++;
          space-=2;
       
         System.out.println();
       }
    }
}

/*

5
1                                                               1
1       2                                               2       1
1       2       3                               3       2       1
1       2       3       4               4       3       2       1
1       2       3       4       5       4       3       2       1

*/