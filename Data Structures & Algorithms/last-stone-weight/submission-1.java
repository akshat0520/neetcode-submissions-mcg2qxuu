class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:stones)
        {
            pq.offer(i);
        }
        int j=0;
        while(!pq.isEmpty())
        {
            j=pq.poll();
            if(pq.isEmpty())
            {
                break;
            }
            int k=pq.poll();
            if(j>=k)
            {
                pq.offer(j-k);
            }
            else
            {
                pq.offer(k-j);
            }
        }
        return j;
    }
}
