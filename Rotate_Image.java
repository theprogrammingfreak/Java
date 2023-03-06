class Solution {
    public void rotate(int[][] matrix) {
        int k=0;
        int[][] result=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=matrix.length-1;j>=0;j--)
            {
                result[i][k]=matrix[j][i];
                k++;
            }
            k=0;
        }
        for(int i=0;i<matrix.length;i++)
        {           
            for(int j=0;j<matrix.length;j++)
            {
               matrix[i][j]=result[i][j]; 
            }            
        }
    }
    }
