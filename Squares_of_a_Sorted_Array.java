import java.util.*;
import java.io.*;
public class Squares_of_a_Sorted_Array
{
	public static void main(String[] args) {
	    Solution obj=new Solution();
	    int[] arr={-1,5,2,-6,8};
	    obj.sortedSquares(arr);
	    for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]);
	    }
	}
}

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
