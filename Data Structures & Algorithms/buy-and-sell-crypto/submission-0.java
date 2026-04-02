class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1;
        int len=prices.length;
        int m=0;
        while(r<len)
        {
            if(prices[l]<prices[r])
            {
                if(prices[r]-prices[l]>m)
                {
                    m=prices[r]-prices[l];
                }
            }
            else
            {
                l=r;
            }
            r++;
        }
        return m;
    }
}
