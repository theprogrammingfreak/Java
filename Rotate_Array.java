class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        if(k<len && len!=1){
        reverse(len-k,len-1,nums);
        reverse(0,len-k-1,nums);
        reverse(0,len-1,nums);
        }
        else if(k>len && len!=1)
        {
            while(k>len){
                k=k-len;
            }
            reverse(len-k,len-1,nums);
            reverse(0,len-k-1,nums);
            reverse(0,len-1,nums);
        }
    }
    public void reverse(int left,int right,int[] nums)
    {
        while(left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}
