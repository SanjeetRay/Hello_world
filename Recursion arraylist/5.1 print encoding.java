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


// leetcode 91. Decode ways optimized solution | we have to only get count of strings not the string.

class Solution {
    public int numDecodings(String s) {
        StringBuilder sb = new StringBuilder(s);
        int[] dp = new int[sb.length()+1];
        Arrays.fill(dp, -1);
        int n = numDecodingRec(sb, 0, new StringBuilder(""), dp);
        return n;     
    }
    public int numDecodingRec(StringBuilder sb, int idx, StringBuilder ans, int[] dp)
    {
        if(idx==sb.length())
        {
          //System.out.println(ans);
          return dp[idx] = 1;
        }
        char ch1 = sb.charAt(idx);
        int num1 = ch1 -'0';    // converting from character '1' to integer 1 by subtracting ascii value of '1' from ascii value of '0' i.e. 49(ascii of 1)-48(ascii of 0) =1.
        if(num11==0)
          return 0;
        if(dp[idx]!=-1)
            return dp[idx];
        int count =0; 
        char code = (char)('a'+ (num1-1));
        count += numDecodingRec(sb, idx+1, ans.append(code), dp);
        if(idx<sb.length()-1){           // checking if the 2 length string is available to call further or not.
            int num2 = (sb.charAt(idx)-'0')*10 + (sb.charAt(idx+1) -'0') ;
            if(num2<=26){
                char code2 = (char)('a'+ (num2-1));
                count += numDecodingRec(sb, idx+2, ans.append(code2), dp);
            }
        }
        return dp[idx] = count;
    }
}
