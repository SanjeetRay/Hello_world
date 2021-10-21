package com.user;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		ArrayList<String> res= getMazePaths(0,0,2,2);
		System.out.println(res);

	}
	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc)
	{
		if(sr==dr&&sc==dc)
		{
			ArrayList<String> bal = new ArrayList<>();
			bal.add("");
			return bal;
		}
	
		ArrayList<String> H = new ArrayList<>();
		ArrayList<String> V = new ArrayList<>();
		ArrayList<String> res = new ArrayList<>();
		if(sc+1<=dc)
		H= getMazePaths(sr, sc+1, dr, dc);
		if(sr+1<=dr)
		V= getMazePaths(sr+1, sc, dr, dc);
    /* if Diagonal is also given
    ArrayList<String> D = new ArrayList<>();
    if(sr+1<=dr && sc+1<=dc)
    D = getMazePaths(sr+1, sc+1, dr, dc);
    */
		for(String h : H)
			res.add('h'+h);
		for(String v : V)
			res.add('v'+v);
    /*
    for(String d : D)
			res.add('d'+v);
     */
		return res;
	}

}
