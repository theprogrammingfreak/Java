public class Solution {
    public int removeDuplicates(int[] nums)
    {
        int l=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[l]=nums[i+1];
                l++;
            }
        }
        
        return l;
    }
}
