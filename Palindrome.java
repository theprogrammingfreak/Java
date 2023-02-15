public class Solution {
    public boolean isPalindrome(int x)
    {
        int rev=0;
        int c=x;
        if(x>rev) {
            while (x > rev) {
                rev = (rev * 10) + x%10;
                x = x / 10;
            }
            return (x==rev || x==rev/10);
        }
        return false;
    }
}
