class Solution {
    public int minOperations(String s) {
        int counto = 0, counte = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i)-'0' == i % 2)  counte++;
            else counto++;
        }
        return Math.min(counto, counte);
    }
}
