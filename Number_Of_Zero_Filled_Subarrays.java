class Solution {
    public long zeroFilledSubarray(int[] nums) {
         long count=0L;
        long ans=0L;
        for(int i:nums)
        {
            if(i==0) count++;
            else
            {
                ans+=(count*(count+1))/2;
                count=0;
            }
        }
        if(count!=0)
        {
            ans+=(count*(count+1))/2;
        }
        return ans;
    }
}
