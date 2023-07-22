class Solution {
    //  public boolean increasingTriplet(int[] nums){
    //      int left=0,right=1,flag=1;
    //      while(right<nums.length)
    //      {
    //          if(nums[right]>nums[left])
    //          {
    //              left++;
    //              right++;
    //              flag++;
    //          }
    //          else if(nums[right]<=nums[left])
    //          {
    //              right++;
    //              if(right==nums.length)
    //              {
    //                  left++;
    //                  right=left;
    //                  flag=1;
    //              }
    //          }
    //      }
    //      if(flag>=3) return true;
    //      return false;
    //  }
    public boolean increasingTriplet(int[] nums){
        int left=Integer.MAX_VALUE,right=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<=left) left=num;
            else if(num<=right) right=num;
            else return true;
        }
        return false;
    }
}
