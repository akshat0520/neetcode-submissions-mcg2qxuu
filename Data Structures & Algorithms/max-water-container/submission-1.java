class Solution {
    public int maxArea(int[] heights) {
        int len=heights.length,l=0;
        int r=len-1;
        int c=len-1;
        int maxv=c*(Math.min(heights[l],heights[r]));
        while(l<r)
        {
            int L=heights[l];
            int R=heights[r];
            int m=Math.min(L,R);
            int v=c*m;
            if(v>maxv)
            {
                maxv=v;
            }
            if(L<R)
            {
                l++;
            }
            else
            {
                r--;
            }
            c--;
        }
        return maxv;
    }
}
