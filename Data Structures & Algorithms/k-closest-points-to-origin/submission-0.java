class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparing(a->a[0]));
        for(int[] i:points)
        {
            int dist=i[0]*i[0]+i[1]*i[1];
            pq.offer(new int[]{dist,i[0],i[1]});
        }
        int[][] answer=new int[k][2];
        int j=0;
        for(int i=0;i<k;i++)
        {
            int[] a=pq.poll();
            answer[j][0]=a[1];
            answer[j][1]=a[2];
            j++;
        }
        return answer;
    }
}
