class Solution {
    public double myPow(double x, int n) {
        if(n==0 || x==1) return 1;
        if(n<0) {
            long n2=(long)n*-1;
            return 1/pow(x,n2);
        }
        return pow(x,n);
        
    }
    public static double pow(double x,long n)
    {
        if(n==1) return x;
        if(n%2==0) {
            double ans=pow(x,n/2);
            return ans*ans;
        }
        double ans=pow(x,n/2);
        return ans*ans*x;
    }
}
