class Solution {
    public int[] productExceptSelf(int[] nums)
    {
        int[] ans=new int[nums.length];
        int prod=1,z=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            prod=prod*nums[i];
            else z++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(z==0)
            ans[i]=prod/nums[i];
            else if(z==1)
            {
                if(nums[i]!=0) ans[i]=0;
                else ans[i]=prod;
            }
            else if(z>1) ans[i]=0;
        }
        return ans;
    }
}
