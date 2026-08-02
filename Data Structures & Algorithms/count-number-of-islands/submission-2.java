class Solution {
    private static final int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
    public int numIslands(char[][] grid) {
        int nr=grid.length;
        int nc=grid[0].length;
        int ni=0;
        for(int i=0;i<nr;i++)
        {
            for(int j=0;j<nc;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(grid,i,j);
                    ni++;
                }
            }
        }
        return ni;
    }
    private void dfs(char[][] grid,int r,int c)
    {
        if(r<0||c<0||r>=grid.length||c>=grid[0].length||grid[r][c]=='0')
        return;
        grid[r][c]='0';
        for(int[] dir:directions)
        {
            dfs(grid,r+dir[0],c+dir[1]);
        }
    }
}
