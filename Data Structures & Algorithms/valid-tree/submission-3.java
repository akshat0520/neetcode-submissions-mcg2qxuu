class Solution {
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] i:edges)
        {
            int a=i[0];
            int b=i[1];

            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean visited[]=new boolean[n];
        if(dfs(adj,visited,-1,0))
        {
            return false;
        }
        for(boolean v:visited)
        {
            if(v==false)
            {
                return false;
            }
        }
        return true;
    }
    boolean dfs(List<List<Integer>> adj, boolean[] visited, int parent,int i)
    {
        visited[i]=true;
        for(int j:adj.get(i))
        {
            if(visited[j]==false)
            {
                visited[j]=true;
                if(dfs(adj,visited,i,j)==true)
                {
                    return true;
                }
            }
            else
            {
                if(parent!=j)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
