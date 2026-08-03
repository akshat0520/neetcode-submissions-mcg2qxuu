class Solution {
    private final int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows=heights.length;
        int cols=heights[0].length;
        boolean[][] pac=new boolean[rows][cols];
        boolean[][] atl=new boolean[rows][cols];
        Queue<int[]> qpac=new LinkedList<>();
        Queue<int[]> qatl=new LinkedList<>();
        for(int i=0;i<rows;i++)
        {
            qpac.offer(new int[]{i,0});
            qatl.offer(new int[]{i,cols-1});
        }
        for(int i=0;i<cols;i++)
        {
            qpac.offer(new int[]{0,i});
            qatl.offer(new int[]{rows-1,i});
        }
        bfs(pac,qpac,heights);
        bfs(atl,qatl,heights);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(pac[i][j]&&atl[i][j])
                {
                    list.add(Arrays.asList(i,j));
                }
            }
        }
        return list;
    }
    private void bfs(boolean[][] visited,Queue<int[]> q,int[][] heights)
    {
        while(!q.isEmpty())
        {
            int[] node=q.poll();
            visited[node[0]][node[1]]=true;
            for(int[] dir:directions)
            {
                int nr=node[0]+dir[0];
                int nc=node[1]+dir[1];
                if(nr>=0&&nc>=0&&nr<heights.length&&nc<heights[0].length&&visited[nr][nc]==false&&heights[nr][nc]>=heights[node[0]][node[1]])
                {
                    q.add(new int[]{nr,nc});
                }
            }
        }
    }
}
