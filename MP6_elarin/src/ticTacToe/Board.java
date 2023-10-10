package ticTacToe;

public class Board {
    private char[][] board;
    private int size;
    public char emptySpace;

    public Board(int size) {
        this.size = size;
        this.board = new char[size][size];
        this.emptySpace = '-';
        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                board[row][col] = emptySpace;
            }
        }
    }

    public void displayBoard() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public boolean isTaken(int row, int col) {
        return board[row - 1][col - 1] != emptySpace;
    }

    public boolean isFull() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (board[row][col] == emptySpace) {
                    return false;
                }
            }
        }
        return true;
    }

    public void placeToken(char token, int row, int col) {
        if (board[row - 1][col - 1] == emptySpace) {
            board[row - 1][col - 1] = token;
        } else {
            System.out.println("The space is already taken.");
        }
    }

    public char getHorizontalWinner() {
        for (int row = 0; row < size; row++) {
            char firstToken = board[row][0];
            boolean winningRow = true;
            for (int col = 1; col < size; col++) {
                if (board[row][col] != firstToken) {
                    winningRow = false;
                    break;
                }
            }
            if (winningRow && firstToken != emptySpace) {
                return firstToken;
            }
        }
        return emptySpace;
    }

    public char getVerticalWinner() {
        for (int col = 0; col < size; col++) {
            char firstToken = board[0][col];
            boolean winningCol = true;
            for (int row = 1; row < size; row++) {
                if (board[row][col] != firstToken) {
                    winningCol = false;
                    break;
                }
            }
            if (winningCol && firstToken != emptySpace) {
                return firstToken;
            }
        }
        return emptySpace;
    }

    public char getDiagonalWinner() {
        char mainDiagonalToken = board[0][0];
        boolean winningMainDiagonal = true;
        for (int i = 1; i < size; i++) {
            if (board[i][i] != mainDiagonalToken) {
                winningMainDiagonal = false;
                break;
            }
        }
        if (winningMainDiagonal && mainDiagonalToken != emptySpace) {
            return mainDiagonalToken;
        }

        char otherDiagonalToken = board[0][size - 1];
        boolean winningOtherDiagonal = true;
        for (int i = 1; i < size; i++) {
            if (board[i][size - 1 - i] != otherDiagonalToken) {
                winningOtherDiagonal = false;
                break;
            }
        }
        if (winningOtherDiagonal && otherDiagonalToken != emptySpace) {
            return otherDiagonalToken;
        }

        return emptySpace;
    }

    public char getWinner() {
        char horizontalWinner = getHorizontalWinner();
        char verticalWinner = getVerticalWinner();
        char diagonalWinner = getDiagonalWinner();
        if (horizontalWinner != emptySpace) {
            return horizontalWinner;
        }
        if (verticalWinner != emptySpace) {
            return verticalWinner;
        }
        return diagonalWinner;
    }
}

