package com.user;
import java.util.*;

public class Solution {
   // this code calculates prefix sum of an array
   /* 
    *    1,4,-2,3,4,-1
    *    
    *    prefix sum array : 1,5,3,6,10,9
    * 
    */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int [] arr = {1,4,-2,3,4,-1};
        for(int i=0; i<arr.length; i++)
        {
        	//How to use ternary operator to handle negative indexes here at i =0 
        	// arr[i-1] will behave as arr[-1] so to handle that we can use if else of ternary operator by one of the following ways.
          
        	/*
        	if(i-1<0)
        		arr[i] = 0 + arr[i];
        	else
        		arr[i] = arr[i-1] + arr[i];
        	*/
          
            //----------------OR-------------------------
          
        	/*
        	int a = (i-1)<0 ? 0 : arr[i-1];
        	arr[i] = a + arr[i];
        	*/
          
        	//-----------------OR------------------------
        	
        	arr[i] = (i-1<0 ? 0 : arr[i-1]) + arr[i];
        	
        	
        	           
        }
        
        for(int i: arr)
        {
        	System.out.println(i);
        }
	}

}
