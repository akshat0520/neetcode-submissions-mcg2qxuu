class Solution {
    public String longestPalindrome(String s) {
        int l=0;
        int r=1;
        int len=s.length();
        if(len==1)
        {
            return s;
        }
        String s1="";
        int res=Integer.MIN_VALUE;
        for(int i=0;i<len;i++)
        {
            l=r=i;
            while(l>=0&&r<len&&s.charAt(l)==s.charAt(r))
            {
                if(r-l+1>res)
                {
                    s1=s.substring(l,r+1);
                    res=r-l+1;
                }
                l--;
                r++;
            }
        }
        for(int i=0;i<len-1;i++)
        {
            l=i;
            r=i+1;
            while(l>=0&&r<len&&s.charAt(l)==s.charAt(r))
            {
                if(r-l+1>res)
                {
                    s1=s.substring(l,r+1);
                    res=r-l+1;
                }
                l--;
                r++;
            }
        }
        return s1;
        
    }
}
