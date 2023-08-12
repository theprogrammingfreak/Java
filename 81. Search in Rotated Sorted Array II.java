class Solution {
    public boolean search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[start]==target) return true;
            if(nums[end]==target) return true;
            start++;
            end--;
        }
        return false;
    }
}
