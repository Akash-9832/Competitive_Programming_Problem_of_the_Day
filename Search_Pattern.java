import java.io.*;
import java.util.*;

public class Search_Pattern
{
	public static void main(String[] args) {
	    Solution obj = new Solution();
	    ArrayList<Integer> res= obj.search("tech","b.techininformationtechnology");
	    if(res.size()==0){
	        System.out.println("-1");
	    }
	    else{
	        for(int i=0;i<res.size();i++){
	            System.out.println(res.get(i)+" ");
	        }
	    }
		
	}
}


class Solution
{
    
    ArrayList<Integer> search(String pat, String txt)
    {
         ArrayList<Integer> list = new ArrayList<>();
        int index = txt.indexOf(pat);
        while(index != -1){
            list.add(index+1);
            index=txt.indexOf(pat,index+1);
        }
        return list;
    }
}
