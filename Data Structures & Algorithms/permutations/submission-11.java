class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        calc(nums,ans,0);
        return ans;
    }
    private void calc(int[] nums,List<List<Integer>> ans,int i)
    {
        if(i==nums.length-1)
        {
            ans.add(Arrays.stream(nums).boxed().toList());
            return;
        }
        for(int j=i;j<nums.length;j++)
        {
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            calc(nums,ans,i+1);
            temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
        }
    }
}
