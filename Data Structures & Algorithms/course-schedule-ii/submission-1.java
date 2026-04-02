class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        int[] indegree=new int[numCourses];
        int[] indegreetopo=new int[numCourses];
        int[] answer=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] courses:prerequisites)
        {
            int a=courses[0];
            int b=courses[1];
            indegree[a]++;
            indegreetopo[a]++;
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
        if(f!=numCourses)
        {
            return new int[0];
        }
        for(int i=0;i<numCourses;i++)
        {
            if(indegreetopo[i]==0)
            {
                q.add(i);
            }
        }
        int index=0;
        while(!q.isEmpty())
        {
            int a=q.poll();
            answer[index]=a;
            index++;
            for(int i:adj.get(a))
            {
                indegreetopo[i]--;
                if(indegreetopo[i]==0)
                {
                    q.add(i);
                }
            }
        }
        return answer;
    }
}
