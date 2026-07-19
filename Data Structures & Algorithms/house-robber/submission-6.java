class Solution {
    public int rob(int[] nums) {
        int len=nums.length;
        if(len==1)
        {
            return nums[0];
        }
        int[] dp=new int[len];
        dp[0]=nums[0];
        dp[1]=nums[1];
        for(int i=2;i<len;i++)
        {
            dp[i]=nums[i];
            int m=0;
            for(int j=0;j<=i-2;j++)
            {
                m=Math.max(dp[j],m);
            }
            dp[i]+=m;
        }
        return Math.max(dp[len-1],dp[len-2]);
    }
}
