class Solution {
    int len=0;
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset=new ArrayList<>();
        List<List<Integer>> ans=new  ArrayList<>();
        cal(nums,0,subset,ans);
        return ans;

    }
    private void cal(int[] nums, int i,List<Integer> subset,List<List<Integer>> ans)
    {
        if(i>=nums.length)
        {
            ans.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        cal(nums,i+1,subset,ans);
        subset.remove(Integer.valueOf(nums[i]));
        cal(nums,i+1,subset,ans);
    }
}
