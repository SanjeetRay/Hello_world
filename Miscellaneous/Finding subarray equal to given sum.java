
/* This problem takes O(n) time complexity to find the subarray equal to the given sum contrary to O(n^2) of going with the normal approach.
 *
 * 
 * Algorithm
 * maintain a current sum variable initially 0
 * run a for loop
 * add the array elements in the current sum for each cycle (first cycle starts with i=0 till i=5, second with i=1 till i=5 and so on...)
 * check if currents sum exceeds the given sum
 *   if exceeds then set the i pointer for the next cycle(form i=1 to 5 here) i.e. increasing it by one
 *   and put the current sum to 0 for the next cycle
 * if current sum is equals to the given sum then print and break(to get only the first sub array equal to given sum not the 2nd or 3rd or so forth..)
 * 
 */

package com.user;
import sanjeet.*;
public class Main {

	public static void main(String[] args) {
		int[] arr = {5,2,1,3,2,4};
		int max = -1;
		int current_sum =0;
		int counter  =0;
		boolean flag = true;
		for(int i=0; i<arr.length; i++)
		{
        current_sum += arr[i];
        if(current_sum>max)
        {
          current_sum =0;
          i =counter++;
        }
        else if(current_sum == max)
        {
          flag = false;
          break;
        }
		}
		if(flag == true)
			System.out.println("not found");
	}

}
