public class Prime_Number
{
	public static void main(String[] args) {
		Solution ob = new Solution();
		System.out.println(ob.isPrime(55));
	}
}
class Solution{
    static int isPrime(int N){
        if(N<=1){
            return 0;
        }
        for(int i=2;i<=Math.sqrt(N);i++){
           if(N%i==0){
              return 0;
           }
        }  
        return 1;
    }
}
