
 /*
     
 n1=      1 1 2 3
 n2=      * 1 1 2   ---> n2 here has 3 digits viz. 1, 1 and 2 these digits are to be multiplied with n1 one by one in the given base system.
          --------
r1=       2 2 4 6   ---> r1 is shifted by 0 place (x by 1)
r2=     1 1 2 3 0   ---> notice r2 is shifted by one place to the left (x by 10)
r3=  +1 1 2 3 0 0   ---> notice r3 is shifted by two place to the left (x by 100)
     --------------
      1 2 5 7 7 6   ---> addition should be in the given base sytem
     --------------
 
 --------------------------------------------------------------------------------------------
 for any base multiplication each digit of n2 (viz. 1, 1 and 2) must me multiplied with n1 in 
 that perticular base system and the result of all the n2's digits multiplication with 
 n1 (i.e. r1, r2 and r3) must be added in that perticular base system only.
 */
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int base, int n1, int n2){
     int sumfinal = 0;
     int multiplier =1;
     while(n1>0)
     {
         int d1 = n1%10;
         n1 = n1/10;
         //first call the function to multiply in given base ex. octal multiplication
         int prod = getProdInBase(n2, d1, base);
         //call the function to add in ex. octal base.
         sumfinal  = getSum(sumfinal, prod*multiplier, base);
         multiplier *= 10;
     }
    return sumfinal;
 }
 
 //code for any multiplication with base system
 public static int getProdInBase(int n2, int d, int b)
 {
     int c=0;
     int weight = 1;
     int sum =0;
     
     while(n2>0 || c>0)
     {
         int d1 = n2%10;
         n2 = n2/10;
         int p = d1*d +c;
         int ud = p%b;
         c = p/b;
         sum = sum + ud*weight;
         weight *=10;
     }
     return sum;
 }
 
 //code for any base addition
 public static int getSum(int n1, int n2,int b)
 {
     int sum =0 ;
     int weight =1;
     int c = 0;
     while(n1>0||n2>0||c>0)
     {
         int d1 = n1%10;
         int d2 = n2%10;
         n1 = n1/10;
         n2 = n2/10;
         int add = d1+ d2+ c;
         int unitval = add%b;
         c = add/b;
         sum += unitval*weight;
         weight *=10;
     }
     
     return sum;
 }
}
