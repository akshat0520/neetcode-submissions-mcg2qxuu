class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> list=new ArrayList<>();
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            list.add(c);
        }
        for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            if(!list.contains(c))
                return false;
            list.remove(Character.valueOf(c));
        }
        return true;
    }
}
