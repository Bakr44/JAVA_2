import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static int initRow = 3;
    static int initCol = 3;
    static char empty = ' ';
    static char winningSymbol = ' ';
    static char[][] board = new char[initRow][initCol];
//    static Scanner input = new Scanner(System.in);


    public static void printBoard() {
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " ");
        System.out.println("--+---+--");
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " ");
        System.out.println("--+---+--");
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " ");
    }

    public static void emptyBoard() {
        for (int i = 0; i < initRow; i++) {
            for (int j = 0; j < initCol; j++) {
                board[i][j] = empty;
            }
        }
    }

    public static boolean isDraw() {
        for (int i = 0; i < initRow; i++) {
            for (int j = 0; j < initCol; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean gameEnd() {
        //Rows
        for (int i = 0; i < initRow; i++) {
            if (board[i][0] != empty && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                winningSymbol = board[i][0];
                return true;
            }
        }
        //Columns
        for (int j = 0; j < initCol; j++) {
            if (board[0][j] != empty && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                winningSymbol = board[0][j];
                return true;
            }
        }
        // diagonals
        if (board[0][0] != empty && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            winningSymbol = board[0][0];
            return true;
        }
        if (board[2][0] != empty && board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
            winningSymbol = board[2][0];
            return true;
        }

        return isDraw();
    }

    //method to let computer choose
    public static int getComputerChoice() {
        Random ran = new Random();
        int choice;
        do {
            choice = ran.nextInt(9) + 1;
            int row = (choice - 1) / 3;
            int col = (choice - 1) % 3;

            if (board[row][col] == ' ') {
                board[row][col] = 'O';
                return choice;
            }
        } while (true);
    }

    //method to let the player enter the slot number
    public static int getPlayerInput() {
        Scanner input = new Scanner(System.in);
        int playerEnter;

        while (true) {
            System.out.println("Where would you like to play (1-9) ");
            try {
                playerEnter = input.nextInt();

                if (playerEnter < 1 || playerEnter > 9) {
                    System.out.println("Invalid input. Please enter a number between 1 and 9.");
                } else {
                    int row = (playerEnter - 1) / 3;
                    int col = (playerEnter - 1) % 3;

                    if (board[row][col] != ' ') {
                        System.out.println(playerEnter +" is not a valid move.");
                    } else {
                        board[row][col] = 'X';
                        return playerEnter;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 9.");
                input.nextLine(); // clear the scanner buffer

            }
        }
    }

    public static void main(String[] args) {
        TicTacToe.emptyBoard();
        TicTacToe.printBoard();

        while (!TicTacToe.gameEnd()) {
            TicTacToe.getPlayerInput();
            TicTacToe.printBoard();
            if (TicTacToe.gameEnd()) {
                System.out.println((TicTacToe.winningSymbol == 'X') ? "Congratulations! You win!" : "Game over. It's a draw!");
                break;
            }
            int computerChoice = TicTacToe.getComputerChoice();
            System.out.println("Computer chose " + computerChoice);
            TicTacToe.printBoard();
            if (TicTacToe.gameEnd()) {
                System.out.println(TicTacToe.winningSymbol == 'X' ? "Congratulations! You win!" : "Computer win!");
                break;
            }
        }
    }
}
