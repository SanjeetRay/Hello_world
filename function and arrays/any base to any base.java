import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int res = anyBaseToanyBase(n,sourceBase, destBase);
     System.out.println(res);
   } 
    public static int anyBaseToanyBase(int n, int sourceBase, int destBase)
    {
       int dec_number = anyBaseToDecimal(n, sourceBase);
       int res = DecimalToAnyBase(dec_number, destBase);
       return res;
    }
    
    public static int anyBaseToDecimal(int n, int b){
      int multiplier= 1;
      int sum = 0;
      while(n>0)
      {
          int lastdigit = n%10;
          n = n/10;
          sum += lastdigit*multiplier;
          multiplier *= b;
      }
      return sum;
   }
    public static int DecimalToAnyBase(int n, int base){
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
