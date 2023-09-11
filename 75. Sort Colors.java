class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=low;
        int high=nums.length-1;
        int temp=0;
        while(mid<=high){
            if(nums[mid]==0){
                //swapping mid with low
                temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                //shifting index
                low=low+1;
                mid=mid+1;
            }
            //shift index
            else if(nums[mid]==1){
                mid=mid+1;
            }
            else{
                //swapping mid with high
                temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                //shifting index
                high=high-1;    
            }
        }
    }
}
