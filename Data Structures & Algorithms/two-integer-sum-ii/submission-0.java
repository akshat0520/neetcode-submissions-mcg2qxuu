class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1;
        //int mid=(l+r)/2;
        int a=numbers[l],b=numbers[r];
        char c=' ';
        while(l<r)
        {
            if(a+b==target)
            {
                return new int[]{l+1,r+1};
            }
            else if(a+b>target)
            {
                //c='g';
                r--;
                b=numbers[r];
            }
            else
            {
                l++;
                a=numbers[l];
            }
        }
        return null;
    }
}
