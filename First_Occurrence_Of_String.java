class Solution {
    public static int strStr(String haystack, String needle) {
        int idx=0;
       int count=0;
        if((haystack.contains(needle)))
        {
           while(haystack.length()>=needle.length())
           {
            idx=haystack.indexOf(needle.charAt(0));
            int idx1=0;
            for(int i=0;i<needle.length();i++)
            {
                boolean con=(haystack.charAt(i+idx)==needle.charAt(i));
                if(!con)
                {
                    idx1=i+idx;
                    break;
                }
                else if(i==needle.length()-1)
                {
                    if(con) return count+idx;
                }
            }
            haystack=haystack.substring(idx+1);
              count=count+idx+1;

        }
        }
        return -1;
    
    }
}
