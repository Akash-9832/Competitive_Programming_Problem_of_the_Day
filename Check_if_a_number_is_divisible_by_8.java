public class Check_if_a_number_is_divisible_by_8
{
	public static void main(String[] args) {
	    Solution obj = new Solution();
		System.out.println(obj.DivisibleByEight("54141111648421214584416464555"));
	}
}

class Solution{
    int DivisibleByEight(String s){
        if(s.length()<=3){
            int res=Integer.parseInt(s);  
            if(res%8==0) return 1;
            else return -1;
        }
        s = s.substring(s.length()-3,s.length());
        int res=Integer.parseInt(s);  
        if(res%8==0) return 1;
        else return -1;
    }
}
