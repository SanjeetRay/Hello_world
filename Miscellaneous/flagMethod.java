package com.user;

import java.util.Arrays;

public class SearchDuplicateInArray {

	public static void main(String[] args) {
		int arr[] = {3,8,89,44,34,12,56};
		Arrays.sort(arr);
		//boolean flag = true;
		int val = -1;
        for(int i=0; i<arr.length-1; i++)
        {
        	if(arr[i]==arr[i+1])
        	{
        		//flag = false;
        		val = arr[i];
        		break;
        	}
        	
        }
//        if(flag==false)
//        	System.out.print(val);
//        else
//        	System.out.print(-1);
        System.out.print(val);
	}

}
