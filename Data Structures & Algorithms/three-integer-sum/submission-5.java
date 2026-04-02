class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i=0,len=nums.length,l,r;
       // r=len-1;
        //l=i+1;
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(;i<len;i++)
        {
            // int a=nums[i];
            // int b=nums[l];
            // int c=nums[r];
            l=i+1;
            r=len-1;
            int target=-nums[i];
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            if(nums[i]>0)
            {
                break;
            }
            while(l<r)
            {
                if(nums[l]+nums[r]==target)
                {
                    //list.add(new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r])));
                    // List<Integer> l1=new ArrayList<>();
                    // l1.add(nums[i]);
                    // l1.add(nums[l]);
                    // l1.add(nums[r]);
                    list.add(new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r])));
                    while (l < r && nums[l] == nums[l + 1]) 
                    {l++;}
                    while (l < r && nums[r] == nums[r - 1]) 
                    {r--;}
                    l++;
                    r--;
                    
                }
                else if(nums[l]+nums[r]>target)
                {
                    r--;
                }
                else
                {
                    l++;
                }
            }
        }
        return list;
    }
}
