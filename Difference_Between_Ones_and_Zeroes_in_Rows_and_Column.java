class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length,n=grid[0].length,x;
        int r[]=new int[m],c[]=new int[n];
        for(int i=0;i<m;i++)
        for(int j=0;j<grid[i].length;j++){
            x=grid[i][j];
            r[i]+=x;
            c[j]+=x;
        }
        for(int i=0;i<m;i++)
        for(int j=0;j<grid[i].length;j++)
        grid[i][j]=2*(r[i]+c[j])-m-n;
        return grid;
    }
}


