class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int len=prices.length;
        int mp=0;
        while(r<len)
        {
            if(prices[l]<prices[r])
            {
                mp=Math.max(mp,prices[r]-prices[l]);
            }
            else
            {
                l=r;
            }
            r++;
        }
        return mp;
    }
}
