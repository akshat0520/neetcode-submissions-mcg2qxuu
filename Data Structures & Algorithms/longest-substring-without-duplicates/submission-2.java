class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        int c=1;
        int len=s.length();
        Set<Character> set=new HashSet<>();
        //set.add(s.charAt(l));
        int max=0;
        while(r<len)
        {
        
                while(set.contains(s.charAt(r)))
                {
                    set.remove(s.charAt(l));
                    l++;
                }
        
            set.add(s.charAt(r));
            r++;
            if(set.size()>max)
            {
                max=set.size();
            }
        }
        return max;
    }
}
