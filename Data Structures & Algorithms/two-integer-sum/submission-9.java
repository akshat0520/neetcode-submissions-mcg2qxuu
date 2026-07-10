class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        for(int num:nums)
        {
            int number=target-num;
            if(map.containsKey(number))
            {
                return new int[]{map.get(number),i};
            }
            map.put(num,i);
            i++;
        }
        return new int[]{};
    }
}