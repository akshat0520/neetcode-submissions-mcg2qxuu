class Solution {
    public int search(int[] nums, int target) {
        int len=nums.length;
        int mid;
        int l=0;
        int r=len-1;
        while(l<=r)
        {   
            mid=l+(r-l)/2;

            if(target==nums[mid])
            {
                return mid;
            }
            else if(target>nums[mid])
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return -1;
    }
}
