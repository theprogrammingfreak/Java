import java.util.Arrays;

public class DeleteGreatest {
    public static int deleteGreatestValue(int[][] grid)
    {
        int ans=0,greatest=0,goldwind=0;
        if(grid.length==1)
        {
            for(int i=0;i<grid[0].length;i++)
            {
                ans=ans+grid[0][i];
            }
            return ans;
        }
        for(int i=0;i<grid.length;i++)
        {
            Arrays.sort(grid[i]);
        }
        for(int i=grid[0].length-1;i>=0;i--)
        {
            for(int j=1;j<grid.length;j++)
            {
                goldwind=(grid[j][i]>=grid[j-1][i]) ? grid[j][i] : grid[j-1][i];
                greatest=(greatest>=goldwind) ? greatest : goldwind;
            }
            ans=ans+greatest;
            greatest=0;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int[][] grid={{50,72,65,6,81,92,18,51,10,50,32,64,32,14,54,16,45,64,27,45,15,94,40,51,7,4,17,81,69,96,79,88,11,60,91,21,82,56,30,38,19}};
        System.out.println(deleteGreatestValue(grid));

    }
}
