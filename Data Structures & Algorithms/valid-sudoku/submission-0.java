class Solution {
    private boolean checkRowValidity(char[][] board, int row){
        Set<Character> hs= new HashSet<>();
        for(int col=0;col<9;col++){
            if(board[row][col]=='.') continue;
            if(hs.contains(board[row][col])) return false;
            hs.add(board[row][col]);
        }
        return true;
    }
    private boolean checkColValidity(char[][] board, int col){
        Set<Character> hs= new HashSet<>();
        for(int row=0;row<9;row++){
            if(board[row][col]=='.') continue;
            if(hs.contains(board[row][col])) return false;
            hs.add(board[row][col]);
        }
        return true;
    }
    private boolean checkGridValidity(char[][] board, int startRow, int startCol){
        Set<Character> hs= new HashSet<>();
        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++){
                if(board[i][j]=='.') continue;
                if(hs.contains(board[i][j])) return false;
                hs.add(board[i][j]);
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<9;row++){
            boolean rowValid=checkRowValidity(board,row);
            if(!rowValid) return false;
        }
        for(int col=0;col<9;col++){
            boolean colValid=checkColValidity(board,col);
            if(!colValid) return false;
        }
        int row=0;
        while(row<9){
            int col=0;
            while(col<9){
                boolean gridValidity=checkGridValidity(board,row,col);
                if(!gridValidity) return false;
                col+=3;
            }
            row+=3;
        }
        return true;
    }
}
