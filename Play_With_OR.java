public class Play_With_OR
{
	public static void main(String[] args) {
	    int[] arr = {10, 11, 1, 2, 3};
	    Solution obj = new Solution();
		obj.game_with_number(arr,arr.length);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}

class Solution{
    public static int[] game_with_number (int arr[], int n) {
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i] | arr[i+1];
        }
        return arr;
    }
}
