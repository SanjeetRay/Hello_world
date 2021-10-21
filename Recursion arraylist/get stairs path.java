import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n  = Integer.parseInt(scn.nextLine());
        ArrayList<String> res = getStairPaths(n, 0);
        System.out.println(res);
    }

    public static ArrayList<String> getStairPaths(int top, int bottom) {
        if(bottom==top)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
//        if(bottom>top) // if we not handle calls then we have to return empty arraylist seperately when -ve case is reached.
//        {
//            ArrayList<String> bres = new ArrayList<>();
//            return bres;
//        }
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        ArrayList<String> a3 = new ArrayList<>();
      //handeled calles here
        if(bottom+1<=top)
           a1 = getStairPaths(top, bottom+1);  // we can move either 1 step up,
        if(bottom+2<=top)
           a2 = getStairPaths(top, bottom+2);  // or either 2 step up,
        if(bottom+3<=top)
           a3 = getStairPaths(top, bottom+3);  // or either 3 steps up at a time.
        ArrayList<String> res = new ArrayList<>();
        for(String s1 : a1)
           res.add("1"+s1);
        for(String s2 : a2)
           res.add("2"+s2);
        for(String s3 : a3)
           res.add("3"+s3);
        return res;
    }

}

