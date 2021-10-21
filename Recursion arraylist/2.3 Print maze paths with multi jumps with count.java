/*
h1h1v1v1
h1h1v2
h1v1h1v1
h1v1v1h1
h1v1d1
h1v2h1
h1d1v1
h2v1v1
h2v2
v1h1h1v1
v1h1v1h1
v1h1d1
v1h2v1
v1v1h1h1
v1v1h2
v1d1h1
v2h1h1
v2h2
d1h1v1
d1v1h1
d1d1
d2
22
*/
package com.user;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
	    int count =getMazePathsWithMultiJumps(0,0,2,2,"");	
	    System.out.println(count);

	}
	public static int getMazePathsWithMultiJumps(int sr, int sc, int dr, int dc,String ans)
	{
		if(sr==dr&&sc==dc)
		{
			System.out.println(ans);
			return 1;
		}
		
	    int count=0;
		ArrayList<String> H = new ArrayList<>();
		ArrayList<String> V = new ArrayList<>();
		ArrayList<String> D = new ArrayList<>();
		ArrayList<String> res = new ArrayList<>();
		for(int jump=1; sc+jump<=dc; jump++)
		{
			count += getMazePathsWithMultiJumps(sr, sc+jump, dr, dc, ans+"h"+jump);

		}
		for(int jump=1; sr+jump<=dr; jump++)
		{
			count += getMazePathsWithMultiJumps(sr+jump, sc, dr, dc, ans+"v"+jump);

		}
		for(int jump=1; sr+jump<=dr&&sc+jump<=dc; jump++)
		{
			count += getMazePathsWithMultiJumps(sr+jump, sc+jump, dr, dc, ans+"d"+jump);

		}
			
     return count;		
	}

}
