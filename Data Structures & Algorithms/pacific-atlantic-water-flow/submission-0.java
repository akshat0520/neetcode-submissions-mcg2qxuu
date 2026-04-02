class Solution {
    private int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
    boolean pacific,atlantic;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows=heights.length;
        int columns=heights[0].length;
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {   
                pacific=false;
                atlantic=false;
                DFS(heights,rows,columns,i,j,Integer.MAX_VALUE);
                if(pacific&&atlantic)
                {
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }
    public void DFS(int[][] heights,int rows,int columns,int r,int c,int prev_value)
    {
        if(r<0||c<0)
        {
            pacific=true;
            return;
        }
        if(r>=rows||c>=columns)
        {
            atlantic=true;
            return;
        }
        if(heights[r][c]>prev_value)
        {
            return;
        }
        int temp=heights[r][c];
        heights[r][c]=Integer.MAX_VALUE;
        for(int[] dir:directions)
        {
            int nr=r+dir[0];
            int nc=c+dir[1];
            DFS(heights,rows,columns,nr,nc,temp);
            if(pacific&&atlantic)
            {
                break;
            }
        }
        heights[r][c]=temp;
    }
}
