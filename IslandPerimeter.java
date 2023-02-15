class Solution {
    public int islandPerimeter(int[][] grid)
    {
        int breadth=grid[0].length;
        int length=grid.length;
        int peri=0;
        for(int i=0;i<length;i++)
        {
            for(int j=0;j<breadth;j++)
            {
                if(grid[i][j]==1)
                {
                    if(i==0 || grid[i-1][j]==0) peri+=1;
                    if(j==0 || grid[i][j-1]==0) peri+=1;
                    if(i==length-1 || grid[i+1][j]==0) peri+=1;
                    if(j==breadth-1 || grid[i][j+1]==0) peri+=1;
                }
            }
        }
        return peri;
    }
}
