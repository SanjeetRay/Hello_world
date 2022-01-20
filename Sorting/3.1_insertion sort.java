
 //Tn = On^2

  // insertion sort
	   for(int i=1; i<=arr.length-1; i++)
	   {
		for(int j=i; j>0; j--)   
		   {
			  if(arr[j-1]>arr[j])
			  {
				  int temp = arr[j-1];
				  arr[j-1] = arr[j];
				  arr[j] = temp;
			  }
			  else
				  break;
		   }
	   }
	   
	   for(int a : arr)
	    	System.out.print(a+" ");
