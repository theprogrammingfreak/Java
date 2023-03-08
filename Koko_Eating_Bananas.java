class Solution {
    public int minEatingSpeed(int[] piles,int h)
    {
        int low=1;
        int high=1000000000+1;
        int k=0;
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(rate(piles,mid,h)) high=mid;
            else low=mid+1;
        }
        return low;
    }
    public static boolean rate(int[] piles,int mid,int h)
    {
        int count=0;
        int div=0;
        for(int num:piles)
        {
            div=num/mid;
            count=count+div;
            if(num%mid!=0) count++;
        }
        return (count<=h);
    }
}
