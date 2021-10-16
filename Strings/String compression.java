/*
input :
wwwwaaadexxxxxx
 
outputs : 
compression1 : wadex
compression2 :  w4a3dex6
 
*/
import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
	    String s = "";
	  
		for(int i=0; i<str.length()-1; i++)
		{
		    if(str.charAt(i)==str.charAt(i+1));
		    else
		    {
		        s += str.charAt(i);
		    }
		}
		s += str.charAt(str.length()-1);

		return s;
	}

	public static String compression2(String str){
		String s  = "";
		//int count =0;
		int count =1;
		for(int i=0; i<str.length()-1; i++)
		{
		    
		    if(str.charAt(i)==str.charAt(i+1))
		    {
		        count++;
		    }
		    else
		    {
		       //count++;
		       s += str.charAt(i);
		       if(count>1)
		       {
		           s += count;
		       }
		       //count   =0;
		       count =1;
		       
		    }
		}
		//count++;
		s += str.charAt(str.length()-1);
           if(count>1)
           {
               s += count;
           }

		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
