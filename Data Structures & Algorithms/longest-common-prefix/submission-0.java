class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i,j,len=strs.length;
        int minlenindex=0,k;
        for(i=1;i<len;i++)
        {
            if(strs[i].length()<strs[minlenindex].length())
            {
                minlenindex=i;
            }
        }
        int lenmin=strs[minlenindex].length();
        for(j=0;j<lenmin;j++)
        {
            char c=strs[0].charAt(j);
            for(k=1;k<len;k++)
            {
                if(strs[k].charAt(j)!=c)
                {
                    break;
                }
            }
            if(k!=len)
            {
                break;
            }
        }
        String out=strs[0].substring(0,j);
        return out;
    }
}