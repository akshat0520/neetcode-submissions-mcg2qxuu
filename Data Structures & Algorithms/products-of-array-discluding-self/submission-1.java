class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int i,pr=1;
        int nar[]=new int[l];
        for(i=0;i<l;i++)
        {
            pr=1;
            for(int j=0;j<l;j++)
            {
                if(j==i)
                    continue;
                pr=pr*nums[j];    
            }
            nar[i]=pr;
        }
        return nar;
    }
}  
