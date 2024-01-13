class Divisible_and_Non_divisible_Sums_Difference{
  public static void main(String[] args){
    Solution obj = new Solution();
    System.out.println(obj.differenceOfSums(10,3));
  }
}

class Solution{
    int s1=0,s2=0;
    public int differenceOfSums(int n, int m) {
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                s1+=i;
            }
            else{
                s2+=i;
            }
        }
        return (s1-s2);
    }
}
