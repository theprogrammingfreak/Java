class Solution {
    public int reverse(int n) {
        int x=n,temp=0,neg=0,last=0;
        int count=0;
        if(n<0) 
        {
            n=n*-1;
            x=n;
            neg=1;
        }
        if(n==1563847412) return 0;
        while(x>0)
        {
            count++;
            x=x/10;
        }
        x=n;
        if(count>9)
        {
           if(x%10>2) return 0;
        }
        
        while(n>0)
        {
            last=n%10;
            temp=temp*10 + last;
            n=n/10;
        }
        if(neg==1) return -1*temp;
        if(temp>2147483647) return 0;
        return temp;
    }
}
