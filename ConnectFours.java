
import java.util.Scanner;

public class ConnectFours {

    private static final int ROWS = 6;
    private static final int COLUMNS = 7;
    private static char[][] board = new char[ROWS][COLUMNS];

    private static char currentPlayer = 'R';

    public static void main(String[] args) {
        initializeBoard();
        displayBoard();

        while (true) {
            int column = getColumn();
            dropDisc(column);
            displayBoard();

            if (checkWin()) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            if (isBoardFull()) {
                System.out.println("It's a draw!");
                break;
            }

            switchPlayer();
        }
    }

    private static void initializeBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void displayBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    private static int getColumn() {
        Scanner scanner = new Scanner(System.in);
        int column;

        while (true) {
            System.out.print("Player " + currentPlayer + ", enter column (1-" + COLUMNS + "): ");
            column = scanner.nextInt();

            if (column >= 1 && column <= COLUMNS && board[0][column - 1] == '-') {
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        return column - 1; // Adjust for zero-based indexing
    }

    private static void dropDisc(int column) {
        for (int i = ROWS - 1; i >= 0; i--) {
            if (board[i][column] == '-') {
                board[i][column] = currentPlayer;
                break;
            }
        }
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'R') ? 'Y' : 'R';
    }

    private static boolean checkWin() {
        // Check for a win in rows, columns, and diagonals
        return checkRows() || checkColumns() || checkDiagonals();
    }

    private static boolean checkRows() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS - 3; j++) {
                if (board[i][j] == currentPlayer &&
                    board[i][j + 1] == currentPlayer &&
                    board[i][j + 2] == currentPlayer &&
                    board[i][j + 3] == currentPlayer) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkColumns() {
        for (int i = 0; i < ROWS - 3; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (board[i][j] == currentPlayer &&
                    board[i + 1][j] == currentPlayer &&
                    board[i + 2][j] == currentPlayer &&
                    board[i + 3][j] == currentPlayer) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDiagonals() {
        for (int i = 0; i < ROWS - 3; i++) {
            for (int j = 0; j < COLUMNS - 3; j++) {
                if (board[i][j] == currentPlayer &&
                    board[i + 1][j + 1] == currentPlayer &&
                    board[i + 2][j + 2] == currentPlayer &&
                    board[i + 3][j + 3] == currentPlayer) {
                    return true;
                }
                if (board[i][j + 3] == currentPlayer &&
                    board[i + 1][j + 2] == currentPlayer &&
                    board[i + 2][j + 1] == currentPlayer &&
                    board[i + 3][j] == currentPlayer) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < COLUMNS; i++) {
            if (board[0][i] == '-') {
                return false;
            }
        }
        return true;
    }
}
