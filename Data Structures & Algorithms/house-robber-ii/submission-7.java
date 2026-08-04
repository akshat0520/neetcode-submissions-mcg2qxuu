class Solution {
    public int rob(int[] nums) {
        int dpf[]=new int[nums.length+1];
        int dpn[]=new int[nums.length+1];
        if(nums.length==1)
        {
            return nums[0];
        }
        dpf[0]=dpn[0]=0;
        dpn[1]=0;
        dpf[1]=nums[0];
        for(int i=2;i<=nums.length;i++)
        {
            dpn[i]=Math.max(nums[i-1]+dpn[i-2],dpn[i-1]);
        }
        for(int i=2;i<nums.length;i++)
        {
            dpf[i]=Math.max(nums[i-1]+dpf[i-2],dpf[i-1]);
        }
        return Math.max(dpf[nums.length-1],dpn[nums.length]);
    }
}
