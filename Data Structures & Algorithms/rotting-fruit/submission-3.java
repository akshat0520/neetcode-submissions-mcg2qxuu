class Solution {
    public int orangesRotting(int[][] grid) {
        int rows=grid.length;
        int columns=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int minutes=0;
        int freshcount=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(grid[i][j]==1)
                {
                    freshcount++;
                }
                if(grid[i][j]==2)
                {
                    q.add(new int[]{i,j});
                }
            }
        }
        if(freshcount==0)
        {
            return 0;
        }
        int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};   
        if(q.size()==0)
        {
            return -1;
        }
        
        while(freshcount!=0&&q.isEmpty()==false)
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int[] curr=q.poll();
                int r=curr[0];
                int c=curr[1];
                for(int[] dir:directions)
                {
                    int nr=r+dir[0];
                    int nc=c+dir[1];
                    if(nr>=0&&nr<rows&&nc>=0&&nc<columns&&grid[nr][nc]==1)
                    {
                        grid[nr][nc]=2;
                        q.add(new int[]{nr,nc});
                        freshcount--;
                    }
                }
            }
            minutes++;
        }
        if(freshcount==0)
        {
            return minutes;
        }
        return -1;
    }
}
