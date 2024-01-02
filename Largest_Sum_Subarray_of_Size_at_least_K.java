public class Largest_Sum_Subarray_of_Size_at_least_K
{
	public static void main(String[] args) {
		Solution obj = new Solution();
		long[] a={1,-2,2,-3};
		System.out.println(obj.maxSumWithK(a,4,2));
	}
}

class Solution {
    
    public long maxSumWithK(long a[], long n, long k)
    {
        long sum=0,max=0,prev=0;
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        if(n==k)
            return sum;
        max=sum;
        for(int i=(int)k;i<n;i++){
            sum+=a[i];
            sum-=a[i-(int)k];
            prev+=a[i-(int)k];
            if(prev>=0){
                max=Math.max(sum+prev,max);
            }
            else{
                max=Math.max(sum,max);
                prev=0;
            }
        }
        return max;
    }
}
