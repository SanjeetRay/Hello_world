package com.user;

public class Student{  

	 public static void main(String args[]){  
		int[] arr = {9,1,5,6,2,3};            // bubble sort
		for(int j=arr.length; j>=2; j--)
		for(int i=1; i<j;i++)
		{
			if(arr[i-1]>arr[i])
			{
				int temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
			}
		}
		for(int i : arr)
			System.out.println(i);
	 }  
	}  
