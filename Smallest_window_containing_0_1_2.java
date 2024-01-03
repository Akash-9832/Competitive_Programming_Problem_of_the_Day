public class Smallest_window_containing_0_1_2
{
	public static void main(String[] args) {
		Solution obj=new Solution();
		System.out.println(obj.smallestSubstring("10212"));
	}
}

class Solution {
    public int smallestSubstring(String S) {
        int zero_pos=-1,one_pos=-1,two_pos=-1,max,min,res=1000000;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='0')
                zero_pos=i;
            if(S.charAt(i)=='1')
                one_pos=i;
            if(S.charAt(i)=='2')
                two_pos=i;
                
            if(zero_pos==-1||one_pos==-1||two_pos==-1)
                continue;
            max=Math.max(Math.max(zero_pos,one_pos),two_pos);
            min=Math.min(Math.min(zero_pos,one_pos),two_pos);
            res=Math.min(max-min+1,res);
        }
        if(res==1000000)
            return -1;
        else
            return res;
    }
};
