class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char[] ch=answerKey.toCharArray();
        int T=countTrue(ch,k);
        int F=countFalse(ch,k);
        return Math.max(T,F);
    }
    public int countTrue(char[] ch,int k){
        int start=0;
        int end=0;
        int fal=0;
        while(end<ch.length)
        {
            if(ch[end]=='F')
            {
                fal++;
            }
            end++;
            if(fal>k)
            {
                if(ch[start]=='F')
                {
                    fal--;
                }
                start++;
            }
        }
        return end-start;
    }
    public int countFalse(char[] ch,int k){
        int start=0;
        int end=0;
        int tru=0;
        while(end<ch.length)
        {
            if(ch[end]=='T')
            {
                tru++;
            }
            end++;
            if(tru>k)
            {
                if(ch[start]=='T')
                {
                    tru--;
                }
                start++;
            }
        }
        return end-start;
    }

}
