import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int base, int n1, int n2){
       int res =0;
       int carry =0;
       int weight =1;
       while(n1>0 || n2>0 || carry !=0)
       {
           int ld1 = n1%10;
           n1 = n1/10;
           int ld2 = n2%10;
           n2 = n2/10;
           int sum = ld1 + ld2 + carry;
           
           int unitplace = sum%base;
           carry = sum/base;
           
           res += unitplace*weight;
           weight *=10;
       }
       return res;
   }
  }
