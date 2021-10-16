/*

input : 
pepCODinG

Output : 
PEPcodINg

*/
import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		StringBuilder sb = new StringBuilder(str);
		for(int i=0; i<sb.length(); i++)
		{
		    char ch = sb.charAt(i);
		    if(ch >= 'A'&& ch <= 'Z')    // ASCII of 'A' is 65 and that of 'a' is 97. Adding 32 to any capital case letter will put it into small case range(from 97 to 123).and
		    {                            // vice-versa.
		        char c =(char)(ch + 32); // difference between any capital and small case letter is always 32 example : 'a' - 'A' ---> 97 - 65 = 32. Adding or subtracting this diff-
		        sb.setCharAt(i,c);       //-erence with letter will convert the characater to small or upper case letter respectivly.
		    }
		    else
		    {
		        char c =(char)(ch - 32);
		        sb.setCharAt(i,c);
		    }
		}

		return sb.toString();  // converted stringbuilder to string as the return type is of String not StringBuilder.
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
