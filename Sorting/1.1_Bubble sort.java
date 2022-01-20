// T(n) = On^2
// bubbling the biggest element to the right
public class Student{  

	 public static void main(String args[]){  
		int[] arr = {9,1,5,6,2,3};            
		for(int j=1; j<=arr.length-1; j++)
		for(int i=0; i<arr.length-j; i++)
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
