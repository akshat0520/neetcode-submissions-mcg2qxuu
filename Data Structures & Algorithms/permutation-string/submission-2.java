class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> m1=new HashMap<>();
        Map<Character,Integer> m2=new HashMap<>();
        for(char a='a';a<='z';a++)
        {
            m1.put(a,0);
            m2.put(a,0);
        }
        int l1=s1.length(),l2=s2.length();
        if(l1>l2)
        {
            return false;
        }
        for(int i=0;i<l1;i++)
        {
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            m1.put(c1,m1.getOrDefault(c1,0)+1);
            m2.put(c2,m2.getOrDefault(c2,0)+1);
        }
        int matches=0;
        for(char c='a';c<='z';c++)
        {
            if(m1.get(c)==m2.get(c))
            {
                matches++;
            }
        }
        if(matches==26)
        {
            return true;
        }
        int l=0,r=l1-1;
        while(r<l2-1)
        {
            char cl=s2.charAt(l);
            if(m1.get(cl)==m2.get(cl))
            {
                matches--;
            }
            m2.put(cl,m2.getOrDefault(cl,0)-1);
            if(m1.get(cl)==m2.get(cl))
            {
                matches++;
            }
            l++;
            r++;
            char cr=s2.charAt(r);
            if(m1.get(cr)==m2.get(cr))
            {
                matches--;
            }
            m2.put(cr,m2.getOrDefault(cr,0)+1);
            if(m1.get(cr)==m2.get(cr))
            {
                matches++;
            }
            if(matches==26)
            {
                return true;
            }

        }
        return false;
    }
}
