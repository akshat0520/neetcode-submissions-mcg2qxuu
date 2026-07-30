class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            HashSet<Integer> set=new HashSet<>();
            int target=-1*nums[i];
            //List<Integer> list=new ArrayList<>();
            for(int j=i+1;j<nums.length;j++)
            {
                int find=target-nums[j];
                if(set.contains(find))
                {
                    List<Integer> list1=Arrays.asList(nums[i],nums[j],find);
                Collections.sort(list1);
                    if(!ans.contains(list1))
                        ans.add(list1);
                }
                set.add(nums[j]);
            }
        }
        return ans;
    }
}
