/*

    '-'   '-'  '-' '-'  '-'  '-'   <---- empty string return from base case 
     \    |    /   \    |    /
     v+" "w   x     v   w   x+" "  <---- adding v/w/x in front of " " (empty) string. 
       \  |  /       \  |  /
         [t]8          [u]8
           \           /
  t+"v/w/x"  \       /u+"v/w/x"    <----adding t and u in front of  v,w and x returned from previous state.
               \   /
                 78
  input  --> 78               
  output --> [tv, tw, tx, uv, uw, ux]   
  
  key pad given in question :- 
  
      0 -> .;
      1 -> abc
      2 -> def
      3 -> ghi
      4 -> jkl
      5 -> mno
      6 -> pqrs
      7 -> tu
      8 -> vwx
      9 -> yz
                              
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         Scanner scn = new  Scanner(System.in);
         String str  = scn.nextLine();
         ArrayList<String> rs = getKPC(str,0);
         System.out.println(rs);
    }
    
    public static String[] kpd = {".;","abc", "def", "ghi", "jkl", "mno", "pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str, int idx) {
        
        if(idx==str.length())
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(idx);
        ArrayList<String> rres = getKPC(str, idx+1);
        ArrayList<String> res = new ArrayList<>();
        
            for(int i=0; i<kpd[ch-'0'].length(); i++)
            {
                for(String s : rres)
                {
                   res.add(kpd[ch-'0'].charAt(i) + s);
                }
            }
        return res;
    }

}
