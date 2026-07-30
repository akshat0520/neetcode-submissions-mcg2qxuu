class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int len=s.length();
        if(len==1)
        {
            return false;
        }
        for(int i=0;i<len;i++)
        {
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='[')
            {
                st.push(c);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                char c1=st.pop();
                if((c1=='{'&&c=='}')||
                   (c1=='['&&c==']')||
                   (c1=='('&&c==')'))
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        return false;
    }
}
