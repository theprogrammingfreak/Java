class Solution {
    public int singleNumber(int[] num)
    {
        int result=0;
        for(int i:num)
        {
            result^=i;
        }
        return result;
    }
}
