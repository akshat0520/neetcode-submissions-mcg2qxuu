class Solution {
    public int findMin(int[] nums) {
        int l=0,len=nums.length;
        int r=len-1;
        if(len==1)
        {
            return nums[0];
        }
        while(l<r)
        {
            int mid=l+(r-l)/2;
            if(nums[l]<nums[r])
            {
                return nums[l];
            }
            int m=nums[mid];
            if(nums[l]<m)
            {
                l=mid+1;
            }
            else
            {
                r--;
            }
        }
        if(l==len-1)
        {
            return nums[l];
        }
        return nums[l+1];
    }
}
