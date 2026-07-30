class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            int l=i+1;
            int r=nums.length-1;
            int a=nums[i];
            if(a>0)
            {
                break;
            }
            if(i>0&&nums[i]==nums[i-1])
            {
                continue;
            }
            while(l<r)
            {
                int sum=a+nums[l]+nums[r];
                if(sum==0)
                {
                    ans.add(Arrays.asList(a,nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r&&nums[l]==nums[l-1])
                    {
                        l++;
                    }
                }
                else if(sum>0)
                {
                    r--;
                }
                else
                {
                    l++;
                }
            }
        }
        return ans;
    }
}
