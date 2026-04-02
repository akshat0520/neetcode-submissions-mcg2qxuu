class Solution {
    public int maxArea(int[] heights) {
        int l,r;
        int c=1,mv=0,v=0;
        int len=heights.length;
        int br=len-1;

        for(int i=0;i<len;i++)
        {   
            for(int j=i+1;j<len;j++)
            {
                v=c*Math.min(heights[i],heights[j]);
                c++;
                if(v>mv)
                {
                    mv=v;
                }
            }
            c=1;
        }
        return mv;
    }
}
