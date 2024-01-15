public class Missing_num {
    public static void main(String[] args) {
        int arr[]={2,1,5,4,3,6,8};
        int n=arr.length+1;
        int sum=(n*(n+1))/2;
        for(int i:arr){
            sum=sum-i;
        }
        System.out.println("The missing number is: "+sum);
    }
}
