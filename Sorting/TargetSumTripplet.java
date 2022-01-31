package com.user;

import java.util.Arrays;

public class TargetSumTripplet {

	public static void main(String[] args) {
		int[] arr = {1,9,6,4,8,3,12,14,24,10,15};
		int target = 25;
		tatgetSumTripplet(arr, target);

	}
	
	//total time taken O(n^2)
	public static void tatgetSumTripplet(int[] arr, int tar){
		
		Arrays.sort(arr);
		//1,3,4,6,8,9,10,12,14,15,24
		
	    for(int i=0; i<arr.length; i++)    //<---------- O(n)
	    {
	    	int newtar = tar-arr[i];
	    	
	    	int lo = i+1, hi=arr.length-1;
	    	while(lo<hi)                   //<-------------- O(n)
	    	{
	    		if(arr[lo]+arr[hi]>newtar)
	    		hi--;
	    		else if(arr[lo]+arr[hi]<newtar)
	    		lo++;
	    		else
	    		{
	    			System.out.println(arr[i]+" "+arr[lo]+" "+arr[hi]);
	    			lo++;
	    			hi--;
	    		}
	    	}
	    }
	}

}
