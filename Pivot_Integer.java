class Solution {
    public int pivotInteger(int n) {
        int sum1=n*(n+1)/2,sum2=n;
        while(sum1>=sum2)
        {
            if(sum1==sum2) return n;
            sum1-=n;
            sum2+=n-1;
            n--;
        }
        return -1;
    }  
}
