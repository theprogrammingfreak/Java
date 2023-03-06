import java.util.*;
public class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=1;
        int j=0;
        int[] missing=new int[2*k];
        for(int i=0;i<=2*k-1;i++) {
            for (;j<arr.length;j++)
            {
                if(arr[j]==count)
                {
                    count++;
                    continue;
                }
                break;
            }
            missing[i]=count;
            count++;
        }
        return missing[k-1];
        
    }
}
