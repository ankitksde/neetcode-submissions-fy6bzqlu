class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rowMap= new HashMap<>();
        Map<Integer, Set<Character>> colMap= new HashMap<>();
        Map<String, Set<Character>> gridMap= new HashMap<>();
        int rows=board.length;
        int cols=board[0].length;
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                if(board[row][col]=='.') continue;
                String gridKey=row/3+","+col/3;
                if((rowMap.computeIfAbsent(row,k-> new HashSet<>()).contains(board[row][col]))
                || (colMap.computeIfAbsent(col,k->new HashSet<>()).contains(board[row][col]))
                || (gridMap.computeIfAbsent(gridKey,k->new HashSet<>()).contains(board[row][col]))
                ){
                    return false;
                }
                    rowMap.get(row).add(board[row][col]);
                    colMap.get(col).add(board[row][col]);
                    gridMap.get(gridKey).add(board[row][col]);
            }
        }
        return true;
    }
}
