class Trapping_Rain_Water {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int ans = 0;
        int lm = 0;
        int rm = 0;
        while(left < right)
        {
            if(height[left] < height[right])
            {
                if(lm < height[left])
                    lm = height[left];
                else
                    ans = ans + lm - height[left];
                left++;    
            }
            else{
                if(rm < height[right])
                    rm = height[right];
                else
                    ans = ans + rm - height[right];
                --right;
            }
        }
        return ans;
    }
   public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
