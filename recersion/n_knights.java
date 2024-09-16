package recersion;
public class n_knights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        kinght(board, 0, 0, n);
    }
    static void kinght(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;  // Add this to stop further recursion when all knights are placed
        }
        
        // Move to the next row if the end of the current row is reached
        if (col == board.length) {
            kinght(board, row + 1, 0, knights);
            return;
        }

        // If all rows have been checked, return
        if (row == board.length) {
            return;
        }

        // Place the knight if it's safe to do so
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            kinght(board, row, col + 1, knights - 1);  // Decrement knights count
            board[row][col] = false;
        }

        // Continue to the next column
        kinght(board, row, col + 1, knights);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isvalid(board, row - 2, col - 1) && board[row - 2][col - 1]) {
            return false;
        }
        if (isvalid(board, row - 1, col - 2) && board[row - 1][col - 2]) {
            return false;
        }
        if (isvalid(board, row - 2, col + 1) && board[row - 2][col + 1]) {
            return false;
        }
        if (isvalid(board, row - 1, col + 2) && board[row - 1][col + 2]) {
            return false;
        }
        return true;
    }

    static boolean isvalid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
