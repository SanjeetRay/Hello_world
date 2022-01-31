package com.user;
import java.util.*;
public class countSort {

	public static void main(String[] args) {
		int[] arr = {2,5,7,3,2,5,6,3,2,5,7};
		int max = arr[0];
		int min= arr[0];
		int i=0;
		while(i<arr.length) {
			if(arr[i]>max) 
				max=arr[i];
			
			
			if(arr[i]<min) 
				min=arr[i];
			
			i++;
			
		}
		
		countSort(arr, min, max);
        
	}
	
	public static void countSort(int[] arr, int min, int max) {
		int range= (max-min)+1;
		int[] farr = new int[range];
		int[] ans = new int[arr.length];
		
		//collecting frequencies 
		for(int i=0; i<arr.length; i++) {
			int val = arr[i];
			farr[val-min]++;
		}
		
		//creating prefix array
		for(int i=1; i<farr.length; i++)
		{
			farr[i] += farr[i-1];    //adding previous sum to the current value
		}
		
		//filling ansr array
		for(int i=arr.length-1; i>=0; i--)
		{
			int val = arr[i];
			int pos = farr[val-min];
			ans[pos-1] = val;
			farr[val-min]--;
		}
		
		for(int i:ans)
			System.out.print(i+" ");
	}

}
