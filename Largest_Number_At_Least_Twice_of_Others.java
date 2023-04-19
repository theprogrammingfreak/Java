class Solution {
    public int dominantIndex(int[] nums) {
        int max=0,idx=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]>max)
                {
                    max=nums[i];
                    idx=i;
                }
            }
            for(int i=0;i<nums.length;i++)
            {
                if(i==idx) continue;
                if(nums[i]*2>max) return -1;
            }
            return idx;
    }
}
