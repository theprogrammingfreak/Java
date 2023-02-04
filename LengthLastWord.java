class Solution {
    public int lengthOfLastWord(String s) {
        int len=s.length()-1;
        return length(s,len,0);

    }
         public int length(String s,int len,int ans)
        {

            if(Character.isLetter(s.charAt(len))) {
                for (int i = len; i >= 0; i--) {
                    if(Character.isLetter(s.charAt(i))) {
                        ans++;
                    }
                    else if(Character.isSpaceChar(s.charAt(i)))
                        return ans;
                    }   
            }   
        else if(len==0)
            return 0;
        else return length(s,len-1,ans);
        return ans;
        }  
    }
