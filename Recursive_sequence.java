public class Recursive_sequence
{
	public static void main(String[] args) {
	    Solution obj = new Solution();
		System.out.println(obj.sequence(6));
	}
}


class Solution{
    static long sequence(int n){
        long ans = 1;
        long k = 1;
        long mod = (long) 1e9 + 7;
        for (int i = 2; i <= n; ++i) {
            long temp = 1;
            for (int j = 0; j < i; ++j) {
                ++k;
                temp = (temp * k) % mod;
            }
            ans = (ans + temp) % mod;
        }
        return ans;
    }
}
