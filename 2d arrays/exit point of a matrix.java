import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int r =  scn.nextInt();
    int c = scn.nextInt();
  
    int[][] arr = new int[r][c];
   
    for(int i=0; i<r; i++)
    {
        for(int j=0; j<c; j++)
        {
            arr[i][j] = scn.nextInt();
        }
    }
    
  
    int dir = 0;
    int i=0, j=0;
    int topwall = 0, rightwall= arr[0].length-1, bottomwall= arr.length-1, leftwall=0;
    
    while(true)
    {
        
            dir = (dir+arr[i][j])%4;
            // east dir 
            if(dir==0)
            {
                j++;
                if(j>rightwall)
                {
                    j--;
                    break;
                }
            }
              // south dir 
            if(dir==1)
            {
                i++;
                if(i>bottomwall)
                {
                    i--;
                    break;
                }
            }
              // west dir 
            if(dir==2)
            {
                j--;
                if(j<leftwall)
                {
                    j++;
                    break;
                }
            }
              // north dir 
            if(dir==3)
            {
                i--;
                if(i<topwall)
                {
                    i++;
                    break;
                }
            }
        
        
    }
    System.out.println(i);
    System.out.println(j);
    
    
    }

}
