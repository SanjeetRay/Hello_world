/*

hhvv
hvhv
hvvh
vhhv
vhvh
vvhh
6

*/
package com.user;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		int val = PrintMazePaths(0,0,2,2,"");
		System.out.println(val);

	}
	public static int PrintMazePaths(int sr, int sc, int dr, int dc, String ans)
	{
		if(sr==dr&&sc==dc)
		{
			System.out.println(ans);
			return 1;
		}
		int count=0;
		if(sc+1<=dr)
		count+= PrintMazePaths(sr, sc+1, dr, dc, ans+'h');
		if(sr+1<=dc)
		count+= PrintMazePaths(sr+1, sc, dr, dc, ans+'v');
		return count;
	}

}

// increasing count while destination is reached in base case and hence counting  total no. of paths to reach from source to destination.

/*
package com.user;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		int val = PrintMazePaths(0,0,2,2,"",0);
		System.out.println(val);

	}
	public static int PrintMazePaths(int sr, int sc, int dr, int dc, String ans,int count)
	{
		if(sr==dr&&sc==dc)
		{
			System.out.println(ans);
			count++;
			return count;
		}
		
		if(sc+1<=dr)
		 count=PrintMazePaths(sr, sc+1, dr, dc, ans+'h',count);
		if(sr+1<=dc)
		 count=PrintMazePaths(sr+1, sc, dr, dc, ans+'v',count);
		return count;
	}

}

*/
