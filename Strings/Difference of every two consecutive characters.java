/*

Input : pepCODinG

Output :
p-11e11p-45C12O-11D37i5n-39G

*/
import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
	    String res ="";
	    char ch1='a';
	    char ch2='b';
		for(int i=0;i<str.length()-1;i++)
		{
		    ch1 = str.charAt(i);
		    
		      ch2  = str.charAt(i+1);
		    res+=(ch1)+Integer.toString((ch2-ch1));
		    
		    /*
		    
		    res+=ch1;
		    res += ch2-ch1;
		    
		    */
		}
         
		return res+ch2;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}
  
   //--------------------------------------------------------------------------------------------------------
    /* Using StringBuilder
    public static String solution(String str){ 
      StringBuilder res = new StringBuilder("");
	    char ch1='a';
	    char ch2='b';
		 for(int i=0;i<str.length()-1;i++)
	  	{
		    ch1 = str.charAt(i);
		    
		    ch2  = str.charAt(i+1);
		    res.append((ch1)+Integer.toString((ch2-ch1)));
		    
		    
		   // res+=ch1;
		   // res += ch2-ch1;
		    
		    
	  	}
         
	  	return res.append(ch2);
	  }
  	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    StringBuilder str = new StringBuilder(scn.nextLine());	
		System.out.println(solution(str));
    
    }
    
    */

}
