class Solution {
    private final int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int rows=grid.length;
        int columns=grid[0].length;
        int maxarea=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(grid[i][j]==1)
                {
                    maxarea=Math.max(maxarea,BFS(grid,i,j,rows,columns,maxarea));
                }
            }
        }
        return maxarea;
    }
    public int BFS(int[][] grid,int r,int c,int rl,int cl,int globalmax)
    {
        int currarea=1;
        Queue<int[]> q=new LinkedList<>();
        grid[r][c]=0;
        q.add(new int[]{r,c});
        while(q.isEmpty()==false)
        {
            int node[]=q.poll();
            int row=node[0];
            int col=node[1];
            for(int[] dir:directions)
            {
                int nr=row+dir[0];
                int nc=col+dir[1];
                if(nr>=0&&nr<rl&&nc>=0&&nc<cl&&grid[nr][nc]==1)
                {
                    q.add(new int[]{nr,nc});
                    currarea++;
                    grid[nr][nc]=0;
                }
            }
        } 
        return currarea;
    }
}
