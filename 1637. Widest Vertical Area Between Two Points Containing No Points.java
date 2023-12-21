class Solution {
    public int maxWidthOfVerticalArea(int[][] points){
        int[] x=new int[points.length];
        for(int i=0;i<points.length;i++) x[i]=points[i][0];
        Arrays.sort(x);
        // System.out.print(Arrays.toString(x));
        int diff=0;
        for(int i=1;i<points.length;i++)
        {
            if(x[i]-x[i-1]>diff) diff=x[i]-x[i-1];
        }
        return diff;
    }
}
