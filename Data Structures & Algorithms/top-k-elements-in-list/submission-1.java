class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for (int i:nums)
        {
            m.put(i,m.getOrDefault(i,0)+1);
        }
        List<Integer>[] a=new ArrayList[nums.length+1];
        for(Map.Entry<Integer,Integer> e:m.entrySet())
        {
            int freq=e.getValue();
            if (a[freq] == null) 
            {
                a[freq] = new ArrayList<>();
            }
            a[freq].add(e.getKey());
        }
        int arr[]=new int[k];
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]!=null)
            {        
                for(int num:a[i])
                {
                    arr[arr.length-k]=num;
                    k--;
                    if(k==0)
                        break;
                }
                if(k==0)
                    break;
                
            }
        }
        return arr;
    }
}
