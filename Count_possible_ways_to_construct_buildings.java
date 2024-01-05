public class Count_possible_ways_to_construct_buildings
{
	public static void main(String[] args) {
	    Solution obj = new Solution();
		System.out.println(obj.TotalWays(3));
	}
}

class Solution
{
    public int TotalWays(int N)
    {
        long mod =1000000007;
        if(N==1)    return 4;
        if(N==2)    return 9;
        
        long prev = 2, curr =3, ans =0;
        for(int i=3; i<=N; i++) {
            ans = (prev + curr)%mod;
            prev = curr;
            curr = ans;
        }
        return (int)(ans*ans % mod);
    }
}
