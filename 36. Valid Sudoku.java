class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> row=new HashSet<>();
        HashSet<Character> col=new HashSet<>();
        for(int i=0;i<9;i++){                 //Row and Column check
            row=new HashSet<>();
            col=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(row.contains(board[i][j])) return false;
                    else row.add(board[i][j]);
                }
                if(board[j][i]!='.'){
                    if(col.contains(board[j][i])) return false;
                    else col.add(board[j][i]);
                }
            }
        }

        for(int i=0;i<9;i+=3){               //Block check
            for(int j=0;j<9;j+=3){
                if(!checkBlock(board,i,j)) return false;
            }
        }
        return true;
    }
    public boolean checkBlock(char[][] board,int iIdx,int jIdx){
        HashSet<Character> blockSet=new HashSet<>();
        for(int i=iIdx;i<iIdx+3;i++)
        {
            for(int j=jIdx;j<jIdx+3;j++){
                if(board[i][j]!='.'){
                    if(blockSet.contains(board[i][j])) return false;
                    else blockSet.add(board[i][j]);
                }
            }
        }
        return true;
    }
}
