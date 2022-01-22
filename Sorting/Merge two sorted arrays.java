package com.user;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int b[] = {11,22,33,44,55,66,77};
		int c[] = new int[a.length+b.length];
		
	    int i=0, j=0, k=0;
	    while(i<a.length && j<b.length)
	    {
	    	if(a[i]<b[j]) {
	    		c[k]=a[i];
	    		i++;
	    		k++;
	    	}
	    	else {
	    		c[k]=b[j];
	    		j++;
	    		k++;
	    	}
	    }
	    
	    if(i==a.length)
	    {
	    	while(j<b.length)
	    	{
	    		c[k]=b[j];
	    		j++;
	    		k++;
	    	}
	    }
	   
	    if(j==b.length) {
	    	while(i<a.length) {
	    		c[k]=a[i];
	    		k++;
	    		i++;
	    	}
	    }
	    
	    for(int val:c)
	    	System.out.print(val+" ");
	    	

	}

}
