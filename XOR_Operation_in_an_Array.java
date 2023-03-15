class Solution {
    public int xorOperation(int n, int start) {
        int st=0;
        for(int i=0;i<n;i++)
        {
            st^=start+(2*i);
        }
        return st;
    }
}
