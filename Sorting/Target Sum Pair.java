package com.user;

import java.util.Arrays;

public class Main {
	
	/*conventional method of O(n^2)
	 * 
	 * for(int i=0; i<arr.length; i++)
	 * {
	 *   for(int j=i+1; j<arr.length ;j++)
	 *   {
	 *     code to chek sum equal to target
	 *     
	 *   }
	 * }
	 * 
	 *method 2 by using binary search(O(logN) time complexity)
	 *for(int i=0; i<arr.length; i++)
	 *{
	 *  int tar = Target-arr[i];
	 *
	 *  left = i+1;
	 *  right = arr.length-1;
	 *  while(left<=right)
	 *  {
	 *    mid = (left+right)/2;
	 *    if(tar<arr[mid])
	 *     {
	 *       mid=right-1;
	 *     } 
	 *    else if(tar>arr[mid])
	 *     {
	 *       mid=right+1;
	 *     }
	 *    else
	 *     {
	 *       System.out.println(arr[left]+" "+arr[right];
	 *       break;
	 *     }
	 *   }    
	 *
	*/
  
	// nlogn method, using Arrays.sort and then a for loop
	public static void main(String[] args) {
		int b[] = {6,9,14,7,11,12,3,15};
         targetSumPair(b, 18); 	

	}
	
	public static void targetSumPair(int[] arr, int tar)
	{
		Arrays.sort(arr);    //NlogN time complexity
		int l=0,r=arr.length-1;
		while(l<r)            // O(n) time complexity
		{
			if(arr[l]+arr[r]<tar)
			{
				l++;
			}
			else if(arr[l]+arr[r]>tar)
			{
				r--;
			}
			else
			{
				System.out.println(arr[l]+" "+arr[r]);
				l++;
				r--;
			}
		}
	}

}
