class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            if(target==nums[m])
            {
                return m;
            }
            // if(target==nums[l])
            // {
            //     return l;
            // }
            // if(target==nums[r])
            // {
            //     return r;
            // }           
            if(nums[m]>nums[r])
            {
                if(target>nums[m])
                {
                    l=m+1;
                }
                else
                {
                    if(target>=nums[l])
                    {
                        r=m-1;
                    }
                    else
                    {
                        l=m+1;
                    }
                }
            }
            else
            {
                if(target<nums[m])
                {
                    r=m-1;
                }
                else
                {
                    if(target<=nums[r])
                    {
                        l=m+1;
                    }
                    else
                    {
                        r=m-1;
                    }
                }
            }
        }
        return -1;
    }
}
