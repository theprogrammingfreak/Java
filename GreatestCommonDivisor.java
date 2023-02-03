class Solution {
    public String gcdOfStrings(String str1, String str2) {
        return divisor(str1,str2,"");
    }
   public String divisor(String s1,String s2,String ans)
    {
        if(!(s1+s2).equals(s2+s1)) return "";
        if(s2.length()>s1.length())
        {
            ans=s1;
            s1=s2;
            s2=ans;
            ans="";
        }
        int a=s1.length();
        int b=s2.length();
        while(b!=0) {
            int t=b;
            b=a%b;
            a=t;
        }
        return s1.substring(0,a);
}
}
