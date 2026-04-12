class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        int[] occurrence=new int[26];
        for(char c:tasks)
        {
            occurrence[(int)c-'A']++;
        }
        for(int i:occurrence)
        {
            if(i==0)
            {
                continue;
            }
            pq.offer(i);
        }
        int time=0;
        Queue<int[]> q=new LinkedList<>();
        while(true)
        {
            if(pq.isEmpty()&&q.isEmpty())
            {
                break;
            }
            time++;
            if(pq.isEmpty())
            {
                time=q.peek()[1];
            }
            else
            {
                int element=pq.poll()-1;
                if(element>0)
                {
                    q.add(new int[]{element,time+n});
                }
            }
            if(!q.isEmpty()&&q.peek()[1]==time)
            {
                pq.add(q.poll()[0]);
            }
        }
        return time;
    }
}
