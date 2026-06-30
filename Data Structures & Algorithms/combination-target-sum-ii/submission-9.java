class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> subset=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        calc(candidates,0,target,subset,ans);
        return ans;
    }
    private void calc(int[] candidates,int i, int target, List<Integer> subset, List<List<Integer>> ans)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(subset));
            return;
        }
        for(int j=i;j<candidates.length;j++)
        {
            if(j>i&&candidates[j]==candidates[j-1])
            {
                continue;
            }
            if(candidates[j]>target)
            {
                break;
            }
            subset.add(candidates[j]);
            calc(candidates,j+1,target-candidates[j],subset,ans);
            subset.remove(subset.size()-1);
        }
    }
}
