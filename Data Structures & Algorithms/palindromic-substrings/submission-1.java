class Solution {
    public int countSubstrings(String s) {
        int len=s.length();
        if(len==1)
        {
            return 1;
        }
        int l=0;
        int r=0;
        int pc=0;
        for(int i=0;i<len;i++)
        {
            l=r=i;
            while(l>=0&&r<len&&s.charAt(l)==s.charAt(r))
            {
                pc++;
                l--;
                r++;
            }
            l=i;
            r=i+1;
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
