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
    private boolean checkGridValidity(char[][] board, int grid){
        Set<Character> hs= new HashSet<>();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int row=(grid/3)*3+i;
                int col=(grid%3)*3+j;
                if(board[row][col]=='.') continue;
                if(hs.contains(board[row][col])) return false;
                hs.add(board[row][col]);
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
        for(int grid=0;grid<9;grid++){
             boolean gridValid=checkGridValidity(board,grid);
            if(!gridValid) return false;
        }
        return true;
    }
}
