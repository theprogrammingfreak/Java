class Solution {
    public int maxVowels(String s, int k) {
        char[] ch=s.toCharArray();
        int ans=0;
        int vowels=0;
        // while(left<=right){
        //         int c=ch[left];
        //         if(c==97 || c==101 || c==105 || c==111 || c==117) vowel++;
        //         left++;
        // }
        for(int i=0;i<k;i++){
            int c=ch[i];
            vowels+=(c==97 || c==101 || c==105 || c==111 || c==117)?1:0;
        }
        ans=vowels;
        // while(right!=ch.length){
        //     int prev=ch[left];
        //     if(prev==97 || prev==101 || prev==105 || prev==111 || prev==117) vowel--;
        //     int c=ch[right];
        //     if(c==97 || c==101 || c==105 || c==111 || c==117) vowel++;
        //     left++;
        //     right++;
        //     ans=Math.max(ans,vowel);
        // }
        for(int i=k;i<ch.length;i++){
            int c=ch[i-k];
            int p=ch[i];
            vowels-=(c==97 || c==101 || c==105 || c==111 || c==117)?1:0;
            vowels+=(p==97 || p==101 || p==105 || p==111 || p==117)?1:0;
            ans=Math.max(ans,vowels);
            if(ans==k) return ans;
        }
        return ans;
    }
}
//97 101 105 111 117
