class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n)
    {
        if(flowerbed.length==1)
        {
            if(flowerbed[0]==1 && n>0) return false;
            if(flowerbed[0]==0 && n>1) return false;
            return true;
        }
        int i=0;
        while(i<flowerbed.length)
        {
            if(flowerbed[i]==0)
            {
                if(checkVacany(flowerbed,n,i) && n!=0)
                {
                    flowerbed[i]=1;
                    n--;
                }
            }
            i++;
        }
        if(n!=0) return false;
        return true;
    }
    public boolean checkVacany(int[] flowerbed,int n,int i)
    {
        if(i==0)
        {
            if(flowerbed[i+1]!=1) return true;
        }
        else if(i==flowerbed.length-1)
        {
            if(flowerbed[i-1]!=1) return true;
        }
        else if(flowerbed[i+1]!=1 && flowerbed[i-1]!=1) return true;
        return false;
    }
}
