class Solution {
    public int findDuplicate(int[] nums) {
        int jump=nums[0];
        int n=nums.length;
        while(n-->0){
            int prev=jump;
            jump=nums[jump];
            nums[prev]=0;
            if(nums[jump]==0) return jump;
        }
        return 0;
    }
}
