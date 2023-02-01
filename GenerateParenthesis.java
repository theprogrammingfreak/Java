import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParenthesis {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> str=new ArrayList<>();
        back(str,0,0,n,"");
        System.out.println(str);
    }
    public static void back(List<String> str,int start,int end,int n,String s)
    {
        if(s.length()==2*n)
        {
            str.add(s);
            return;

        }
        if(start<n) back(str,start+1,end,n,s+"(");
        if(end<start) back(str,start,end+1,n,s+")");
    }
}
