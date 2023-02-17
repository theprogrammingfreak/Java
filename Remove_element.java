public class Solution {
    public int removeElement(int[] nums, int val)
    {
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            if(val==nums[i])
            {
                nums[i--]=nums[l-- -1];
            }
        }
        return l;
    }
}
