class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;

        //XOR operation on same nummbers is zero
        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);
        }

        //This tells us the added characters ASCII value.
        for (int i = 0; i < t.length(); i++) {
            result ^= t.charAt(i);
        }
        return result;
    }
}
