class Backtrack {

    //1) All permutations of a string, Time Complexity => (n*n!)
    public static void printPermu(String str, String permu, int idx) {
        if (str.length() == 0) {
            System.out.println(permu);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermu(newStr, permu + curr, idx + 1);
        }
    }

    public static void main(String args[]) {
        String str = "ABC";
        printPermu(str, "", 0);
    }
    //2) N-Queens (All solutions where the Queens are safe in an N*N chessboard)
    public boolean isSafe(int row, int col, char[][] board){
        //horizontal
    }

    public void helper(char[][] board,  <List<List<String>> allBoards, int col){
        if(col==board.length){
            saveBoard(board, allBoards);
            return;
        }

        for(int row = 0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board,allBoards,col+1);
                board[row][col]='.';
            }
        }
    }

    public List<LIst<String>> solveNQueens(int n){
        <List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new board[n][n];

        helper(board,allBoards,0);
        }
}
