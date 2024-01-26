public class Fascinating_number_or_not
{
	public static void main(String[] args) {
	    Solution obj = new Solution();
		System.out.println(obj.isFascinatingNo(327));
		
	}
}

class Solution{
    boolean isFascinatingNo(int n){
        int c=0;
        int[] arr = new int[10];
        int a = n*2;
        int b = n*3;
        while(n!=0){
            int r=n%10;
            arr[r]++;
            n/=10;
        }
        while(a!=0){
            int p=a%10;
            arr[p]++;
            a/=10;
        }
        while(b!=0){
            int q=b%10;
            arr[q]++;
            b/=10;
        }
        for(int i=1;i<10;i++){
            if(arr[i]==1){
                c++;
            } else{
                return false;
            }
        }
        if(c==9) return true;
        return true;
    }
}
