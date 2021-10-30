/*

655196

Output :
feeaif
feesf

*/
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
     String str = scn.nextLine();
     printEncodings(str,"");
  }

  
  public static void printEncodings(String str,String ans) {
    if(str.length()==0)
    {
        System.out.println(ans);
        return;
    }
    char ch = str.charAt(0);
    int v = ch-'0';
    if(v==0)
     return;
    else
    {
        char codeval = (char)('a'+ v-1);
        printEncodings(str.substring(1),ans+codeval);
    }
    if(str.length()>=2)
    {
        String s = str.substring(0,2);
        int v1 = Integer.parseInt(s);
        if(v1<=26)
        {
          char codeval1 = (char)('a'+ v1-1);
          printEncodings(str.substring(2),ans+codeval1);
    
        }
        }
    
  }

}
