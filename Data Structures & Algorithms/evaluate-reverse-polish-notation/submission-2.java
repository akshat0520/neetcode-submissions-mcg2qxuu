class Solution {
    public int evalRPN(String[] tokens) {
        // int len=tokens.length;
        Stack<Integer> stack=new Stack();
        for(String s:tokens)
        {
            int i=Integer.MIN_VALUE;
            char c='a';
            if(s.length()==1 && "+-*/".indexOf(s.charAt(0))>=0)
            {
                c=(char)s.charAt(0);
            }
            else
            {
                i=Integer.parseInt(s);
            }
            // try {
            //     i=Integer.parseInt(s);   // throws NumberFormatException if invalid
            // } 
            // catch (NumberFormatException e) {
            //     c=(char)s.charAt(0);
            // }
            //int i=Integer.parseInt(s);
            // char c=s.charAt(0);
            if(i!=Integer.MIN_VALUE)
            {
                stack.push(i);
            }
            else
            {
                int a=stack.pop();
                int b=stack.pop();
                long f=0L;
                if(c=='+')
                {
                    f=b+a;
                }
                if(c=='-')
                {
                    f=b-a;
                }
                if(c=='*')
                {
                    f=b*a;
                }
                if(c=='/')
                {
                    f=(int)b/a;
                }
                stack.push((int)f);
            }        
        }
        return stack.pop();
    }
}
