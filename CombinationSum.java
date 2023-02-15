//Given a candidates array and a target. Create a List of subarrays that sum upto the given target.
class Solution {
     public List<List<Integer>> combinationSum(int[] candidates,int target)
    {
        List<Integer> st1=new ArrayList<>();
        int len=candidates.length;
        solve(candidates,target,len,0,0,st1);
        return str;
    }
     List<List<Integer>> str=new ArrayList<>();
    public void solve(int[] can,int tar,int len,int sum,int idx,List<Integer> st1)
    {
        if(sum==tar)
        {
            str.add(new ArrayList<>(st1));
            return;
        }
        for(;idx<len;idx++)
        {
            if(sum<tar)
            {
                st1.add(can[idx]);
                solve(can,tar,len,sum+can[idx],idx,st1);
                st1.remove(st1.size()-1);
            }
            if(sum>tar) return;
        }
    }
}
