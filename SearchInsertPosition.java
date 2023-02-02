class Solution {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        return search(nums,target,len);
        
    }
     public int search(int[] num,int target,int len)
    {
         if(num[len/2]<=target)
        {
            for(int j=(len/2);j<len;j++)
            {
                if(num[j]==target || num[j]>target) return j;
                else if(j==len-1 && target>num[j]) return j+1;
            }
        }
        else
        {
            for(int i=len/2;i>=0;i--)
            {
                if(num[i]==target) return i;
                else if(target>num[i]) return i+1;
                else if(i==0 && target<num[i]) return 0;
            }
        }
        return 0;
    }
}
