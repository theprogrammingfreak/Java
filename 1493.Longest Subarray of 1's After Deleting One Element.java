class Solution {
    public int longestSubarray(int[] nums) {
        int ans=0;
        int ones=0;
        int midzero=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==nums.length-1 && nums[i]==1) 
            {
                ones++;
                ans=Math.max(ans,ones);
            }
            if(nums[i]==1)
            {
                ones++;
            }
            else if(nums[i]==0)
            {
                if(ones>0 && midzero==0) midzero++;
                else if(midzero==1){
                    ans=Math.max(ans,ones);
                    ones=0;
                    midzero=0;
                }
            }
        }
        if(ans==nums.length) return ans-1;
        return ans;

    }
}

class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;

        int left = 0;
        int zeros = 0;
        int ans = 0;

        for (int right = 0; right < n; right++) {
            if (nums[right] == 0) {
                zeros++;
            }
            while (zeros > 1) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1 - zeros);
        }
        return (ans == n) ? ans - 1 : ans;
    }
}
