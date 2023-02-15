//using int return type
import java.util.Scanner;
public class RomanToInteger {
    public static int romanToInt(String s)
    {
        int ans=0,prev=0,curr=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char a=s.charAt(i);
            switch(a)
            {
                case 'I': curr=1; break;
                case 'V': curr=5; break;
                case 'X': curr=10; break;
                case 'L': curr=50; break;
                case 'C': curr=100; break;
                case 'D': curr=500; break;
                case 'M': curr=1000; break;
            }
            if(curr<prev) ans=ans-curr;
            else ans=ans+curr;
            prev=curr;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(romanToInt(s));
    }
}
