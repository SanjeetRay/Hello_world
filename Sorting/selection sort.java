
// T(n) = On^2

//selection sort
	   for(int i=0; i<arr.length-2; i++)
	   {
		   for(int j = i+1; j<arr.length; j++)
		   {
			   if(arr[i]>arr[j])
			   {
    			   int temp = arr[i];
				   arr[i] = arr[j];
			       arr[j] = temp;
		       }
	     }
	   }
