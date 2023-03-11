class Solution {
    public boolean divisorGame(int n)
    {
        int count=1;
        int x=1;
        while(x<=n)
        {
            if(n%x==0)
            {
                n=n-x;
                count=count+1;
            }
        }
        if(count%2==1) return true;
        return false;
    }
}
