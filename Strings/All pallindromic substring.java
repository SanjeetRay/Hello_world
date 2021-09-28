/*

abcc
a
b
c
cc
c

*/

import java.util.*;
class Test2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                String s = str.substring(i,j);
                if(isPallindrome(s)==true)
                   System.out.println(s);
            }
        }
        
    }
    public static boolean isPallindrome(String str)
    {
        int l =0;
        int r = str.length()-1;
        boolean isPallindrome = true;
        while(l<r)
        {
            if(str.charAt(l)!=str.charAt(r))
              {
                  isPallindrome = false;
                  break;
              }
              l++;
              r--;
        }
        return isPallindrome;
    }
}
