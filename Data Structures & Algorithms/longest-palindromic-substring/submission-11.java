class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        int res=0;
        String s1="";
        if(len==1)
        {
            return s;
        }
        int l=0,r=1;
        for(int i=0;i<len;i++)
        {
            l=i;
            r=i;
            while(l>=0&&r<len&&s.charAt(l)==s.charAt(r))
            {
                if(r-l+1>res)
                {
                    res=r-l+1;
                    s1=s.substring(l,r+1);
                }
                l--;
                r++;
            }
            l=i;
            r=i+1;
            while(l>=0&&r<len&&s.charAt(l)==s.charAt(r))
            {
                if(r-l+1>res)
                {
                    res=r-l+1;
                    s1=s.substring(l,r+1);
                }
                r++;
                l--;
            }
        }
        return s1;
    }
}
