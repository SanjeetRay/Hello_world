/*

input : abcc
output :
a
b
c
cc
c

*/

import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean isPalindrome(String str)
    {
        int left = 0;
        int right = str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
              return false;
             left++;
             right--;
        }
        return true;
    }

	public static void solution(String str){
		for(int i=0; i<str.length(); i++)
		{
		    for(int j=i+1; j<=str.length(); j++)
		    {
		        String sub = str.substring(i,j);
		        if(isPalindrome(sub)==true)
		          System.out.println(sub);
		    }
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
        /* 
        
        String s = scn.next();
 		StringBuilder str = new StringBuilder(s);  // with StringBuilder
		solution(str.toString());
        */
		solution(str);
	}

}
