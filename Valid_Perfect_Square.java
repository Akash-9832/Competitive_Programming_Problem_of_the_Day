public class Valid_Perfect_Square
{
	public static void main(String[] args) {
	    Solution obj=new Solution();
		System.out.println(obj.isPerfectSquare(25));
	}
}

class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        for(int i=1;i<=(int)num/2;i++){
            if(i*i==num){
                return true;
            }
            if(i*i>num){
                return false;
            }
        }
        return false;
    }
}
