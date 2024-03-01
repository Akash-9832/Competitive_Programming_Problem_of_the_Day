public class First_element_to_occur_k_times
{
	public static void main(String[] args) {
	    int[] a = {3, 1, 3, 4, 5, 1, 3, 3, 5, 4};
	    Solution obj = new Solution();
		System.out.println(obj.firstElementKTime(a.length, 3, a));
	}
}

class Solution
{
    public int firstElementKTime(int n, int k, int[] a) { 
        int[] count = new int[10000];
        for(int i=0;i<n;i++){
            count[a[i]]++;
            if(count[a[i]]==k){
                return a[i];
            }
        }
        return -1;
    } 
}
