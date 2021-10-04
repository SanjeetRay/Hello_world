import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int number = scn.nextInt();
      int base = scn.nextInt();
      int res = getValueInBase(number, base);
      System.out.println(res);
   }
  
   public static int getValueInBase(int n, int base){
       int multiplier =1;
       int sum =0;
       while(n>0)
       {
           int lastdigit = n%base;
           n = n/base;
           sum = sum +lastdigit*multiplier;
           multiplier*=10;
       }
       return sum;
   }
  }
