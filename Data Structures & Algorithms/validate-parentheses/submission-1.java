class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracket=new Stack<>();
        int l=s.length();
        int i;
        for(i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c=='['||c=='('||c=='{')
            {
                bracket.push(c);
            }
            else
            {
                if(bracket.empty())
                {
                    return false;
                }
                char c1=bracket.pop();
                if((c1=='{'&&c=='}')||(c1=='('&&c==')')||(c1=='['&&c==']'))
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
        if(bracket.empty())
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
