class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        int rows=edges.length;
        int[] indegree=new int[rows+1];
        for(int i=0;i<=rows;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges)
        {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
            indegree[edge[0]]++;
            indegree[edge[1]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=rows;i++)
        {
            if(indegree[i]==1)
            {
                q.add(i);
            }
        }
        while(!q.isEmpty())
        {
            int node=q.poll();
            indegree[node]--;
            for(int nei:adj.get(node))
            {
                indegree[nei]--;
                if(indegree[nei]==1)
                {
                    q.offer(nei);
                }
            }
        }
        for(int i=rows-1;i>=0;i--)
        {   
            int a=edges[i][0];
            int b=edges[i][1];
            if(indegree[a]==2 && indegree[b]>0)
            {
                return new int[]{a,b};
            }
        }
        return new int[0];
    }
}
