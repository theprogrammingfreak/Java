class Solution {
    public int getSum(int x, int y) {
        int carry;
        while (y != 0) {
            carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
        
    }
}
