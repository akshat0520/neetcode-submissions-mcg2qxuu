class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i[]:edges)
        {
            int a=i[0];
            int b=i[1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        int answer=0;
        for(int i=0;i<n;i++)
        {
            if(visited[i]==false)
            {
                answer++;
                bfs(adj,visited,i);
            }
        }
        return answer;
    }
    void bfs(List<List<Integer>> adj,boolean visited[],int i)
    {
        visited[i]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while(!q.isEmpty())
        {
            int j=q.poll();
            for(int k:adj.get(j))
            {
                if(visited[k]==false)
                {
                    visited[k]=true;
                    q.offer(k);
                }
            }
        }
    }
}
