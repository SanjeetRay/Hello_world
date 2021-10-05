import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int base, int n1, int n2){
     
      // making n2 always bigger than n1 for positive subtraction.
      // here we have made n2 bigger than n1 and hence we will subtract n2 - n1 irrespective of user input.
     
      if(n2>n1);
      else
          {
              int tmp = n2;
              n2=n1;
              n1 = tmp;
          }
         
       int borrow = 0;
       int res = 0;
       int weight = 1;
     
       while(n2>0)
       {
           int d1 = n1%10;
           int d2 = n2%10;
           n1 = n1/10;
           n2 = n2/10;
           int diff = (d2-borrow)-d1;
           if(diff<0)
           {
               diff += base;
               borrow =1;
           }
           else 
               borrow =0;
            res += diff*weight;
            weight *=10;
       }
       return res;
   }
  
  }
