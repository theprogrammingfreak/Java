public class Solution { // inefficient Solution
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        if(n==-2147483648) return 1;
        if(n<0) return convertNegative(n);
        return convert(n);
    }
    public int convert(int n){
        int[] bin=new int[32];
        int ones=0;
        for(int i=31;i>=0;i--){
            if(n%2==1) {
                bin[i]=n%2;
                ones++;
            }
            n=n/2;
            if(n==0) break;
        }
        return ones;
    }
    public int convertNegative(int n){
        n=n*-1;
        System.out.print(-1*n);
        int[] bin=new int[32];
        Arrays.fill(bin,1);
        int ones=32;
        for(int i=31;i>=0;i--){
            if(n==0) break;
            else if(n%2==1) {
                bin[i]=0;
                ones--;
            }
            n=n/2;
        }
        if(bin[31]==0){
                bin[31]=1;
                ones++;
        }
        else{
            for(int i=31;i>=0;i--){
                if(bin[31]==1){
                    bin[31]=0;
                    ones--;
                }
                else if(bin[i]==1){
                    bin[i]=0;
                    ones--;
                }
                else{
                    bin[i]=1;
                    ones++;
                    break;
                }
            }
        }
        return ones;
    }
}
//efficient Solution
public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
