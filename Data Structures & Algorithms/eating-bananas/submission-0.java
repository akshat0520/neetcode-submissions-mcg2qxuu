class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int len=piles.length;
        int max=piles[0];
        for(int i:piles)
        {
            max=Math.max(max,i);
        }
        if(h==max)
            return max;
        int l=0;
        int r=max;
        int ans=0;
        while(l<=r)
        {
            int k=(l+r)/2;
            long total=0;
            for(int i:piles)
            {
                total+=Math.ceil((double)i/k);
            }
            if(total<=h)
            {
                ans=k;
                r=k-1;
            }
            else
            {
                l=k+1;
            }
        }
        return ans;
    }
}
