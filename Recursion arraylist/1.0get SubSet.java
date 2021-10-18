/*

---
--30
-20-
-2030
10--
10-30
1020-
102030

*/

public class Main {

	public static void main(String[] args) {
		int[] arr  = {10,20,30};
		ArrayList<String>al = getSubset(arr,0);
	    for(String s : al)
	    	System.out.println(s);
	}
	public static ArrayList<String> getSubset(int[] arr, int idx)
	{
		if(idx==arr.length)
		{
			ArrayList<String> bal = new ArrayList<>();
			bal.add("");
			return bal;
		}
		
		int a = arr[idx];
		ArrayList<String> tempal =  getSubset(arr, idx+1);
		ArrayList<String> res = new ArrayList<>();
		for(String s : tempal)
		{
			res.add("-" + s);
			
		}
		for(String s : tempal)
		{
		
			res.add(a + s);
		}
		return res;
	}

}
