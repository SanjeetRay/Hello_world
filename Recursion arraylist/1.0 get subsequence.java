/*
> subsequence in strings = sub set in array. 
  > it is non contiguous
  > total no of subsequence/sub set (2^n)
> whereas substring in string = subarray in arrays. 
  > it is contiguous
  > total no of substring/sub array (n(n+1)/2)
  for a array of size 3 with elements :  10 20 30
  subarray would be(6) : 
  10
  10 20
  10 20 30  <--- all contguous no two element have gap in between them
  20
  20 30 
  30 
  
substring of abc --> [ a, ab, abc, b, bc, c ]
subsequence -->
[
   ---
   -b-
   --c
   -bc
   a--
   ab-
   a-c  <--- non contiguous two elements can have gap between them
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
