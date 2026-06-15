class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(mincost(cost,0,dp),mincost(cost,1,dp));
    }
    private int mincost(int[] cost, int i,int[] dp)
    {
        if(i>=cost.length)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        dp[i]=cost[i]+Math.min(mincost(cost,i+1,dp),mincost(cost,i+2,dp));
        return dp[i];
    }
}
