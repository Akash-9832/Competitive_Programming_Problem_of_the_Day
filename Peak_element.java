public class Peak_element
{
	public static void main(String[] args) {
	    int[] arr = {1, 1, 2, 3};
	    Solution obj = new Solution();
		System.out.println(obj.peakElement(arr,arr.length));
	}
}
class Solution
{
	public int peakElement(int[] arr,int n)
    {
        int ans=0;
        for(int i=1;i<n;i++){
           if(arr[i]>arr[i-1]){
               ans=i;
           }
       }
       return ans;
    }
}
