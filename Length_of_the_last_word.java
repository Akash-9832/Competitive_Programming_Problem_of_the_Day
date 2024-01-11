public class Length_of_the_last_word
{
	public static void main(String[] args) {
	    Solution obj=new Solution();
		System.out.println(obj.lengthOfLastWord("Akash Modak       "));
	}
}

class Solution {
    int a;
    public int lengthOfLastWord(String s) {
        s = s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ')
                break;
                a=(s.length()-i);
        }
        return a;
    }
}
