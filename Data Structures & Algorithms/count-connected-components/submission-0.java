class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        int count=0;
        int[] visited=new int[n];
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges)
        {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        for(int i=0;i<n;i++)
        {
            if(visited[i]==0)
            {
                count++;
                DFS(adj,i,visited);
            }
        }
        return count;
    }
    private void DFS(List<List<Integer>> adj,int node,int[] visited)
    {
        visited[node]=1;
        for(int n:adj.get(node))
        {
            if(visited[n]==0)
            {
                DFS(adj,n,visited);
            }
        }
    }
}
