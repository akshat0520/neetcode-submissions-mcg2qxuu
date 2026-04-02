class Solution {
    private static final int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
    public int numIslands(char[][] grid) {
        int rows=grid.length;
        int columns=grid[0].length;
        int count=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(grid[i][j]=='1')
                {
                    BFS(grid,i,j,rows,columns);
                    count++;
                }
            }
        }
        return count;
    }
    public void BFS(char[][] grid,int r,int c,int rl,int cl)
    {   
        Queue<int[]> q=new LinkedList<>();
        grid[r][c]='0';
        q.add(new int[]{r,c});
        while(q.isEmpty()==false)
        {
            int[] node=q.poll();
            int row=node[0];
            int column=node[1];
            for(int[] dir:directions)
            {
                int nr=row+dir[0];
                int nc=column+dir[1];
                if(nc>=0&&nc<cl&&nr>=0&&nr<rl&&grid[nr][nc]=='1')
                {
                    grid[nr][nc]='0';
                    q.add(new int[]{nr,nc});
                }
            }
        }
    }
}
