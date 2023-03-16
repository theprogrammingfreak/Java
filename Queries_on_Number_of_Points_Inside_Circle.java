
class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n=points.length;
        int m=queries.length;
        int[] ans=new int[m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(((points[j][0]-queries[i][0])*(points[j][0]-queries[i][0])+(points[j][1]-queries[i][1])*(points[j][1]-queries[i][1]))<=queries[i][2]*queries[i][2])
                {
                    ans[i]+=1;
                }
            }
        }
        return ans;
    }
}
