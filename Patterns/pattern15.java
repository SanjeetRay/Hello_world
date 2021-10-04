import java.util.*;
class Test1{
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int val=1;
       int space = n/2;
       int numbers =1;
       for(int i=1; i<=n ; i++)
       {
         for(int j=1; j<=space; j++)
         {
          System.out.print("\t"); 
         }
         int tval = val;
         for(int j=1; j<=numbers; j++)
         {
           System.out.print(tval+"\t");
           if(j<=numbers/2)
             tval++;
           else
             tval--;
         }
         if(i<=n/2)
         {
           space--;
           numbers+=2;
           val++;
         }
         else
         {
           space++;
           numbers-=2;
           val--;
         }
         System.out.println();
       }
    }
}

/*

5
                1
        2       3       2
3       4       5       4       3
        2       3       2
                1
				
*/