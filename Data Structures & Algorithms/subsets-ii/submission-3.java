class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        su(ans,subset,nums,0);
        return ans;
    }
    private void su(List<List<Integer>> ans,List<Integer> subset,int[] nums, int i)
    {
        if(i==nums.length)
        {
            ans.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        su(ans,subset,nums,i+1);
        subset.remove(subset.size()-1);
        while(i+1<nums.length&&nums[i]==nums[i+1])
        {
            i=i+1;
        }
        
        su(ans,subset,nums,i+1);
    }
}
