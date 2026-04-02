class Solution {
    private final int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
    public void islandsAndTreasure(int[][] grid) {
        int rows=grid.length;
        int columns=grid[0].length;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(grid[i][j]!=0&&grid[i][j]!=-1)
                {
                    grid[i][j]=BFS(grid,i,j,rows,columns);            
                }
            }
        }
    }
    public int BFS(int[][] grid, int r, int c, int rows, int columns) {
    boolean[][] visited = new boolean[rows][columns];
    Queue<int[]> q = new LinkedList<>();
    visited[r][c] = true;
    q.add(new int[]{r, c});

    int distance = 0;

    while (!q.isEmpty()) {
        int size = q.size();
        for (int i = 0; i < size; i++) {
            int[] node = q.poll();
            int r1 = node[0];
            int c1 = node[1];

            for (int[] dir : directions) {
                int nr = r1 + dir[0];
                int nc = c1 + dir[1];

                if (nr >= 0 && nr < rows && nc >= 0 && nc < columns) {
                    if (grid[nr][nc] == 0) return distance + 1;

                    if (!visited[nr][nc] && grid[nr][nc] != -1) {
                        visited[nr][nc] = true;
                        q.add(new int[]{nr, nc});
                    }
                }
            }
        }
        distance++;
    }
    return grid[r][c];
}

}
