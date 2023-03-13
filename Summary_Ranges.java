import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges {
    public List<String> summaryRanges(int[] nums)
    {
        List<String> lst=new ArrayList();
        if(nums.length==1){
            lst.add(nums[0]+"");
            return lst;
        }
        for(int i=0;i<nums.length;i++){
            int first=nums[i];
            while(i+1<nums.length&&(nums[i+1]-nums[i])==1){
                i++;
            }
            if(first!=nums[i]){
                lst.add(first+"->"+nums[i]);
            }else{
                lst.add(first+"");
            }
        }
        return lst;
    }
}
