class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[numCourses];
        for(int[] i:prerequisites)
        {
            int a=i[0];
            int b=i[1];
            adj.get(b).add(a);
            indegree[a]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        int count=0;
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty())
        {
            
            int i=q.poll();
            ans.add(i);
            if(ans.size()==numCourses)
            {
                break;
            }
            for(int j:adj.get(i))
            {
                indegree[j]--;
                if(indegree[j]==0)
                {
                    q.add(j);
                }
            }
        }
        int ar[]=new int[numCourses];
        if(ans.size()==numCourses)
        {
            
            for(int i=0;i<ans.size();i++)
            {
                ar[i]=ans.get(i);
            }
            return ar;
        }
        else
        {
            return new int[]{};
        }
    }
}
