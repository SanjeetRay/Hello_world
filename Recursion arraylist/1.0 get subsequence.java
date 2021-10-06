/*
> subsequence in strings = sub set in array. 
  > it is not continuous 
  > total no of subsequence/sub set (2^n)
> whereas substring in string or subarray in arrays are same. 
  > it is non continuous
  > total no of substring/sub array (n(n+1)/2)
  
substring of abc --> [ a, ab, abc, b, bc, c ]
subsequence -->
[
   ---
   -b-
   --c
   -bc
   a--
   ab-
   a-c  <--- non continuous
   abc
 ]

*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       String str  = scn.nextLine();
       ArrayList<String> res = gss(str, 0);
       System.out.println(res);
    }

    public static ArrayList<String> gss(String str, int idx) {
        if(idx==str.length())
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(idx);
        ArrayList<String> rres = gss(str, idx+1);
        ArrayList<String> rstring = new ArrayList<>();
        for(String s : rres)
        {
            rstring.add("" + s);
            rstring.add(ch + s);
        }
        
        return rstring;
    }

}
