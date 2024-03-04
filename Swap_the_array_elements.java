public class Swap_the_array_elements
{
	public static void main(String[] args) {
	    int[] arr = {1, 2, 3, 4, 5};
	    Solution obj = new Solution();
		System.out.println(obj.swapElements(arr,arr.length));
	}
}

class Solution
{
    public void swapElements(int[] arr, int n)
    {
        for(int i=0;i<n-2;i++){
            int temp = arr[i];
            arr[i] = arr[i+2];
            arr[i+2] = temp;
        }
    }
}
