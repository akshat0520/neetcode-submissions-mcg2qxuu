class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> con=new HashSet<>();
        for(int num:nums)
        {
            if(con.contains(num))
                return true;
            con.add(num);
        }
        return false;
    }
}