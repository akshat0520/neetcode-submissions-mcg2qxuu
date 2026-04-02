class Solution {

    public String encode(List<String> strs) {
        StringBuilder str=new StringBuilder();
        for(String s:strs)
        {
            int l=s.length();
            str.append(l).append("#").append(s);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> strs=new ArrayList();
        int j=0;
        for(int i=0;i<str.length();)
        {
            j=i;
            while(str.charAt(j)!='#')
            {
                j++;
            }
            int l=Integer.parseInt(str.substring(i,j));
            i=j+1;                                                                                                                                                                                                                                                                                                                                                                                                                                                          
            strs.add(str.substring(i,i+l));
            i=i+l;
        }
        return strs;
    }
}
