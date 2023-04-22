public class Factor {
//    public static int kthFactor(int n,int k)
//    {
//        int[] factor=new int[n];
//        int i=1;
//        int idx=0;
//        while(i<=n/2)
//        {
//            if(n%i==0)
//            {
//                factor[idx]=i;
//                if(idx==k-1)
//                {
//                    return factor[idx];
//                }
//                idx++;
//            }
//            i++;
//        }
//        factor[idx]=n;
//        return -1;
//    }
    public static int kthFactor(int n,int k)
    {
        int idx=0;
        for(int i=0;i<=n;i++)
        {
            if(n%i==0)
            {
                 if(idx==k-1) return i;
                 idx++;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int n=12;
        int k=3;
        System.out.println(kthFactor(n,k));
    }
}
