class Solution {
    public List<String> generateParenthesis(int n) {
        //int no=n, nc=n;
        StringBuffer s=new StringBuffer();
        List<String> ans=new ArrayList<>();
        pdp(n,n,s,ans);
        return ans;
    }
    private void pdp(int no,int nc,StringBuffer s,List<String> ans)
    {
        if(no==0&&nc==0)
        {
            ans.add(s.toString());
            return;
        }
        if(isSafe(no-1,nc))
        {
            s.append('(');
            pdp(no-1,nc,s,ans);
            s.deleteCharAt(s.length()-1);
        }
        if(isSafe(no,nc-1))
        {
            s.append(')');
            pdp(no,nc-1,s,ans);
            s.deleteCharAt(s.length()-1);
        }
    }
    private boolean isSafe(int no,int nc)
    {
        if(no>=0&&nc>=0&&nc>=no)
        {
            return  true;
        }
        return false;
    }
}
