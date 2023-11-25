class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int len=nums.length;
        int[] result=new int[len];
        int pre=0;
        int suf=0;
        for (int num : nums) suf = suf + num;
        for(int i = 0; i < len ; i++){
            suf = suf-nums[i];
            result[i] = nums[i]*i - pre + suf - nums[i]*(len-i-1);
            pre = pre+nums[i];
        }
        return result;
    }
}
