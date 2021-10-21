/* 

 Output :  [h1h1v1v1, h1h1v2, h1v1h1v1, h1v1v1h1, h1v1d1, h1v2h1, h1d1v1, h2v1v1, h2v2, v1h1h1v1, v1h1v1h1, v1h1d1, v1h2v1, v1v1h1h1, v1v1h2, v1d1h1, v2h1h1, 
 v2h2, d1h1v1, d1v1h1, d1d1, d2]

*/
package com.user;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al = getMazePathsWithMultiJumps(0,0,2,2);
		System.out.println(al);
		

	}
	public static ArrayList<String> getMazePathsWithMultiJumps(int sr, int sc, int dr, int dc)
	{
		if(sr==dr&&sc==dc)
		{
			ArrayList<String> bal = new ArrayList<>();
			bal.add("");
			return bal;
		}
		
	
		ArrayList<String> horizontal = new ArrayList<>();
		ArrayList<String> vertical = new ArrayList<>();
		ArrayList<String> diagonal = new ArrayList<>();
		ArrayList<String> res = new ArrayList<>();
		for(int jump=1; sc+jump<=dc; jump++)
		{
			horizontal= getMazePathsWithMultiJumps(sr, sc+jump, dr, dc);
			for(String hpaths : horizontal)
				res.add("h"+jump+hpaths);
		}
		for(int jump=1; sr+jump<=dr; jump++)
		{
			vertical= getMazePathsWithMultiJumps(sr+jump, sc, dr, dc);
			for(String vpaths : vertical)
				res.add("v"+jump+vpaths);
		}
		for(int jump=1; sr+jump<=dr&&sc+jump<=dc; jump++)
		{
			diagonal= getMazePathsWithMultiJumps(sr+jump, sc+jump, dr, dc);
			for(String dpaths : diagonal)
				res.add("d"+jump+dpaths);
		}
		
     return res; 		
		
	}

}
