class Solution {
    public int countComponents(int n, int[][] edges) {
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
        int count=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(visited[i]==false)
            {
                DFSrec(adj,visited,i);
                count++;
            }
        }
        return count;
    }
    void DFSrec(List<List<Integer>> adj, boolean[] visited, int v)
    {
        visited[v]=true;
        for(int i:adj.get(v))
        {
            if(visited[i]==false)
            {
                visited[i]=true;
                DFSrec(adj,visited,i);
            }
        }
    }
}
