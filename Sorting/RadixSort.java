package com.user;

public class RadixSort {

	public static void main(String[] args) {
		int[] arr = {8256, 1109, 12, 345,5666,2345, 8};
		RadixSort(arr);
        
		for(int i: arr)
			System.out.println(i+" ");
	}
	
	public static void RadixSort(int[] arr)
	{
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		
		int place =1;
		while(max/place>0)
		{
			CountSort(arr, place);
			place = place*10;
		}
	}
	
	public static void CountSort(int[] arr, int place) {
		//creating freq and ans array
		int[] farr = new int[10];
		int[] ans = new int[arr.length];
		
		//filling the freq array or collecting the frequency
		for(int i=0; i<arr.length; i++)
		{
			int val = arr[i]/place%10;
			farr[val]++;
		}
		
		//preparing the prefix sum array
		for(int i=1; i<farr.length; i++)
		{
			farr[i] += farr[i-1];
		}
		
		// filling the ansr array
		for(int i=ans.length-1; i>=0; i--)
		{
			int val = arr[i]/place%10;
			int pos = farr[val];
			ans[pos-1] = arr[i];        // storing the whole value instead of only one digit
			farr[val]--;
		}
		
		// putting back again into original array
		for(int i=0; i<arr.length; i++)
		{
			arr[i]= ans[i];
		}
	}
	
	

}
