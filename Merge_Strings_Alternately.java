class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder ans= new StringBuilder();
        int len1=0;
        int len2=0;
        while(len1<word1.length() || len2<word2.length())
        {
            if(len1<word1.length())
            {
                ans.append(word1.charAt(len1));
                len1++;
            }
            if(len2<word2.length())
            {
                ans.append(word2.charAt(len2));
                len2++;
            }
        }
        return ans.toString();
    }
}
