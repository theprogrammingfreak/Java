class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        String s1=s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2,s.length());
        int num1=alike(s1);
        int num2=alike(s2);
        return num1==num2;
    }
    private int alike(String s){
        int ans=0;
        for(char ch:s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ans++;
        }
        return ans;
    }
}
