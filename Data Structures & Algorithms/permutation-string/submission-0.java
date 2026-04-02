class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1=s1.length(),l2=s2.length();
        int l=0,r=l+l1-1;
        if(l1>l2)
        {
            return false;
        }
        while(r<l2)
        {
            String su=s2.substring(l,r+1);
            char[] a=su.toCharArray();
            char[] b=s1.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a,b))
            {
                return true;
            }
            else
            {
                l++;
                r++;
            }
        }
        return false;
    }
}
