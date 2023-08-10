class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length-1;
        if(m==1 && n+1==1){
            if(matrix[0][0]==target) return true;
            else return false;
        }
        else if(n+1==1)
        {
            for(int i=0;i<m;i++)
            {
                if(matrix[i][0]==target) return true;
            }
            return false;
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int start=0;
                int end=n;
                int middle=(start+end)/2;
                while(start<=end){
                    if(matrix[i][middle]==target) return true;
                    else if(matrix[i][middle]>target){
                        end=middle-1;
                        middle=(start+end)/2;
                    }
                    else if(matrix[i][middle]<target){
                        start=middle+1;
                        middle=(start+end)/2;
                    }
                }
            }
        }
        return false;
    }
}
