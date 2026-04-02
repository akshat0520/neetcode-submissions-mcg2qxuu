class Solution {
    public boolean isalphanumeric(char c)
    {
        if((c>=65&&c<=90)||(c>=97&&c<=122)||(c>=48&&c<=57))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isPalindrome(String s) {
        int l=s.length();
        int i,j;
        j=l-1;
        for(i=0;i<l;)
        {
            // if(i>=j)
            // {
            //     return true;
            // }
            while((i<l)&&(s.charAt(i)==' '||!isalphanumeric(s.charAt(i))))
            {
                i++;
            }
            while((j>=0)&&(s.charAt(j)==' '||!isalphanumeric(s.charAt(j))))
            {
                
                j--;
            }
            if(i>=j)
            {
                return true;
            }
            if((i<l)&&(j>=0)&&(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
