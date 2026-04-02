class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len=temperatures.length;
        int[] result=new int[len];
        int j=0;
        for(int i=0;i<len;i++)
        {
            int k=0;
            for(j=i+1;j<len;j++)
            {
                if(temperatures[j]>temperatures[i])
                {
                    k=j-i;
                    break;
                }
            }
            result[i]=k;
        }
        return result; 
    }
}
