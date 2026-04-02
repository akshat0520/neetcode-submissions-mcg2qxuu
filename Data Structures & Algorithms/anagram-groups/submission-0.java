class Solution {
/*    public boolean isanagram(String a,String b)
    {
        char a1[]=a.toCharArray();
        char b1[]=b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        String a2=new String(a1);
        String b2=new String(b1);
        return a2.equals(b2);
    }
*/
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m=new HashMap<>();
        for(String s:strs)
        {
            int[] c=new int[26];
            for(char c1:s.toCharArray())
            {
                c[c1-'a']++;
            }
            String s1=Arrays.toString(c);
            m.putIfAbsent(s1,new ArrayList<>());
            m.get(s1).add(s);
        }
        return new ArrayList<>(m.values());
    /*Map<String,List<Strings>> m1=new HashMap<>();
        for(String s:strs)
        {
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String s1=Arrays.toString(c);
            m1.putIfAbsent(s1,new ArrayList<>());
            m1.get(s1).add(s);
        }
        return new ArrayList<>(m1.values());
    */
/*        int len=strs.length;
        int i;
        List<List<String>> l1=new ArrayList<>();
        List<String> l2=new ArrayList<>();
        for(i=0;i<len;i++)
        {
            if(strs[i]!="")
            {
                l2.add(strs[i]);
                strs[i]="";
                for(j=i+1;j<len;j++)
                {   
                    if(isanagram(strs[i],strs[j]))
                    {
                        l2.add(strs[j]);
                        strs[j]="";
                    }
                }
                l1.add(l2);
                l2.clear();
            }
        }
        return l1;
        */
    }
    
}
