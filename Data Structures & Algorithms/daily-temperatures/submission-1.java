class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int result[]=new int[temperatures.length];
        Stack<int[]> mdstack=new Stack<>();
        for(int i=0;i<temperatures.length;i++)
        {
            int curr=temperatures[i];
            while(!mdstack.isEmpty()&&curr>(mdstack.peek())[0])
            {
                int[] pair=mdstack.pop();
                result[pair[1]]=i-pair[1];
            }
            mdstack.push(new int[]{curr,i});
        }
        return result; 
    }
}
