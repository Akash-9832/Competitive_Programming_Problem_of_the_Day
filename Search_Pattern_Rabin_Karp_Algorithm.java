import java.util.*;
import java.io.*;

public class Search_Pattern_Rabin_Karp_Algorithm
{
	public static void main(String[] args) {
	    Solution obj = new Solution();
	    ArrayList<Integer> res = obj.search("geek","geeksforgeeks");
	    for(int i=0;i<res.size();i++){
	        System.out.print(res.get(i)+" ");
	    }
	}
}

class Solution
{
    ArrayList<Integer> search(String pattern, String text)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        String str = "";
        int n = pattern.length();
        for(int i=0;i<=text.length()-n;i++){
            str = text.substring(i,i+n);
            if(str.equals(pattern)){
                arr.add(i+1);
            }
        }
       return arr; 
    }
}
