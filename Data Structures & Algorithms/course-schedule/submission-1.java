class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        int[] indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] course:prerequisites)
        {
            int a=course[0];
            int b=course[1];
            indegree[a]++;
            adj.get(b).add(a);
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        int f=0;
        while(!q.isEmpty())
        {
            int a=q.poll();
            f++;
            for(int i:adj.get(a))
            {
                indegree[i]--;
                if(indegree[i]==0)
                {
                    q.add(i);
                }
            }
        }
        if(f==numCourses)
        {
            return true;
        }
        return false;
    }
}
