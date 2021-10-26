package com.user;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		boolean[] vis = new boolean[arr.length];  
		//int count =allPermutationsWithInfiCoins(arr, "");
		// int count =combinationsWithInfiCoins(arr, 0, "");
		 int count =combinationsWithSingleCoins(arr, 0, "");
		// int count =permutationWithSingleCoin(arr, vis, "");
	    //int count =permutationWithSingleCoin_2(arr, "");		  	
		// int count =permutationsWithInfiCoinsEqualToGivenSum(arr, 0, "", 6);	
	    // int count =permutationsWithSingleCoinsEqualToGivenSum(arr, 0, "", vis, 6);
   	    // int count = combinationsWithInfiCoinsEqualToGivenSum(arr, 0, 0, "", 10);
	    //int count = combinationsWithSingleCoinsEqualToGivenSum(arr, 0, 0, "", vis, 5);
	    System.out.println(count);
//	    System.out.println(con);

	}
	
	public static int allPermutationsWithInfiCoins(int[] arr, String res)
	{
		if(res.length()==arr.length)
		{
			System.out.println(res);
			return 1;
		}
		int count =0;
		
		for(int i=0; i<arr.length; i++)
		{   

		     count +=allPermutationsWithInfiCoins(arr, res + arr[i]);

		}
		return count;
	
	}// output : 111,112,113,121,122,123,131,132,133,211,212,213,221,222,223,231,232,233,311,312,313,321,322,323,331,332,333,27
	
	public static int combinationsWithInfiCoins(int[] arr, int idx, String res)
	{
		if(res.length()==arr.length)
		{
			System.out.println(res);
			return 1;
		}
		int count =0;
		for(int i=idx; i<arr.length; i++)
		{
				count +=combinationsWithInfiCoins(arr, i, res + arr[i]);  
		}
		return count;
	
	}// output : 111,112,113,122,123,133,222,223,233,333,10
	
	
	// this method uses visited array to find all the permutations using single coins
	public static int permutationWithSingleCoin(int[] arr, boolean[] vis, String res)
	{
		if(res.length()==arr.length)
		{
			System.out.println(res);
			return 1;
		}
		int count =0;
		
		for(int i=0; i<arr.length; i++)
		{   
			 if(vis[i]==false) {
					vis[i] = true;
				    count +=permutationWithSingleCoin(arr, vis, res + arr[i]);
				    vis[i] = false;
				 }
			 }
		return count;
	
	}// output : 123,132,213,231,312,321,6
	
	public static int combinationsWithSingleCoins(int[] arr, int idx, String res)
	{
		if(res.length()==arr.length)
		{
			System.out.println(res);
			return 1;
		}
		int count =0;
		for(int i=idx; i<arr.length; i++)
		{
				count +=combinationsWithSingleCoins(arr, i+1, res + arr[i]);  
		}
		return count;
	
	}// output : 123,1
	

	
	// this method doesn't use visited array instead it uses same array to mark and find all the permutations using single coins
	public static int permutationWithSingleCoin_2(int[] arr, String res)
	{
		if(res.length()==arr.length)
		{
			System.out.println(res);
			return 1;
		}
		int count =0;
		
		for(int i=0; i<arr.length; i++)
		{   
			 if(arr[i]!=-1) {
                    int val = arr[i];
                    arr[i]  = -1;
				    count +=permutationWithSingleCoin_2(arr, res + val);
				    arr[i] =val;
				 }
			 }
		return count;
	
	}// output : 123,132,213,231,312,321,6
	
	
	public static int permutationsWithInfiCoinsEqualToGivenSum(int[] arr, int sum, String res, int tar)
	{
		if(sum==tar)
		{
			System.out.println(res);
			return 1;
		}
		int count =0;
		for(int i=0; i<arr.length; i++)
		{
			if(sum+arr[i]<=tar)
				count +=permutationsWithInfiCoinsEqualToGivenSum(arr, sum+arr[i], res + arr[i], tar);
		}
		return count;
	
	}
	
	
	public static int permutationsWithSingleCoinsEqualToGivenSum(int[] arr, int sum, String res, boolean[] vis, int tar)
	{
		if(sum==tar)
		{
			System.out.println(res);
			return 1;
		}
		int count =0;
		for(int i=0; i<arr.length; i++)
		{
			if(sum+arr[i]<=tar&&vis[i]==false)
			{
				vis[i] = true;
				count +=permutationsWithSingleCoinsEqualToGivenSum(arr, sum+arr[i], res + arr[i], vis, tar);
				vis[i] = false;
			}
		}
		return count;
	
	}
	
	
	public static int combinationsWithInfiCoinsEqualToGivenSum(int[] arr, int idx, int sum, String res, int tar)
	{
		if(sum==tar)
		{
			System.out.println(res);
			return 1;
		}
		int count =0;
		for(int i=idx; i<arr.length; i++)
		{
			if(sum+arr[i]<=tar)
				count +=combinationsWithInfiCoinsEqualToGivenSum(arr, i, sum+arr[i], res + arr[i], tar);
		}
		return count;
	
	}
	
	public static int combinationsWithSingleCoinsEqualToGivenSum(int[] arr, int idx, int sum, String res, boolean[] vis, int tar)
	{
		if(sum==tar)
		{
			System.out.println(res);
			return 1;
		}
		int count =0;
		for(int i=idx; i<arr.length; i++)
		{
			if(sum+arr[i]<=tar)
			{
		
				count +=combinationsWithSingleCoinsEqualToGivenSum(arr, i+1, sum+arr[i], res + arr[i], vis, tar);
			
			}
		}
		return count;
	
	}
	


}
