class Solution {
    public int countSubstrings(String s) {
        int pc=0;
        int len=s.length();
        int l=0,r=0;
        for(int i=0;i<len;i++)
        {
            l=i;
            r=i+1;
            while(l>=0&&r<len&&s.charAt(l)==s.charAt(r))
            {
                pc++;
                l--;
                r++;
            }
            l=r=i;
            while(l>=0&&r<len&&s.charAt(l)==s.charAt(r))
            {
                pc++;
                l--;
                r++;
            }
        }
        return pc;
    }
}
