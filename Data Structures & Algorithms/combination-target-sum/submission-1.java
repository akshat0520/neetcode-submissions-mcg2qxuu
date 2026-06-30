class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> subset=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        int i=0;
        calc(nums,target,i,subset,ans);
        return ans;
    }
    private void calc(int[] nums,int target,int i,List<Integer> subset,List<List<Integer>> ans)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(subset));
            return;
        }
        if(target<0)
        {
            return;
        }
        if(i>=nums.length)
        {
            return;
        }
        subset.add(nums[i]);
        calc(nums,target-nums[i],i,subset,ans);
        subset.remove(Integer.valueOf(nums[i]));
        calc(nums,target,i+1,subset,ans);
    }
}
