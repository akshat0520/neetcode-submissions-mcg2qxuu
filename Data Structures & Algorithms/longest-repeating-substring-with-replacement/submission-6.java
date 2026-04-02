class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> map=new HashMap<>();
        int l=0,r=0,maxwinsize=0,f=0;;
        char lc,rc;
        while(r<s.length())
        {
            lc=s.charAt(l);
            rc=s.charAt(r);
            map.put(rc,map.getOrDefault(rc,0)+1);
            f=Math.max(map.get(rc),f);
            while((r-l+1)-f>k)
            {
                map.put(lc,map.get(lc)-1);
                l++;
            }
            maxwinsize=Math.max(maxwinsize,r-l+1);
            r++;
        }
        return maxwinsize;
    }
}
