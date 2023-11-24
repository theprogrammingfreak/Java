class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        if(arr.length==1) return 1;
        Arrays.sort(arr);
        int max=0;
        arr[0]=1;
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i]-arr[i-1])>1) arr[i]=arr[i-1]+1;
            max=Math.max(arr[i],arr[i-1]);
        }
        return max;
    }
}
