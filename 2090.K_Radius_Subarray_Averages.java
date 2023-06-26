import java.util.Arrays;

public class SubarrayAvg {
    public int[] getAverages(int[] nums,int k)
    {
        int[] ans=new int[nums.length];
        Arrays.fill(ans,-1);
        if(nums.length<(2*k)+1) return ans;
        else if(nums.length>=(2*k)+1) {
            int count=nums.length-((2*k)+1)+1;
            for (int i = 0; i < nums.length; i++) {
                if(i>=k && count!=0)
                {
                    ans[i]=(int)getAvg(nums,k,i);
                    count--;
                }
                else if(i>k && count==0) break;
            }
        }
        else if(k==0) return nums;
        return ans;
    }
    public long getAvg(int[] nums,int k,int idx)
    {
        long sum=0;
        for(int i=idx-k;i<=idx+k;i++)
        {
            sum=sum+nums[i];
        }
        return sum/((2*k)+1);
    }
}

