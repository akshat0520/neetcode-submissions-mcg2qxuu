class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int ar[]=new int[2];
        int len=nums.length;
        for(i=0;i<len;i++)
        {
            for(j=i+1;j<len;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    ar[0]=i;
                    ar[1]=j;
                    break;
                }
            }    
        }
        return ar;
    }
}
