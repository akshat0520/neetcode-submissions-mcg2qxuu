class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        //Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int num:nums)
        {
            set.add(num);
        }
        for(int num:set)
        {
            int c=0;
            if(!set.contains(num-1))
            {
                int t=num;
                while(set.contains(t))
                {
                    c++;
                    t++;
                }
            }
            if(c>max)
            {
                max=c;
            }
        }
        return max;
    }
}
