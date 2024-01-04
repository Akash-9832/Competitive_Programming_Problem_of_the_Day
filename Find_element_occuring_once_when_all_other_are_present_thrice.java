import java.util.*;
import java.io.*;

public class Find_element_occuring_once_when_all_other_are_present_thrice
{
	public static void main(String[] args) {
	    Solution obj=new Solution();
	    int[] arr={1,8,1,1,8,8,12};
		System.out.println(obj.singleElement(arr,7));
	}
}

class Solution {
    static int singleElement(int[] arr , int N) {
        if(N==1){
            return arr[0];
        }
        Arrays.sort(arr);
        for(int i = 1; i<N-1; i++){
            if(arr[i-1] != arr[i] && arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        if(arr[0]!=arr[1])
            return arr[0];
        else
            return arr[N-1];
    }
}
