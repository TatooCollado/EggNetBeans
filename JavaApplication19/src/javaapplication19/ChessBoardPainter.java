/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author Camil
 */
public class ChessBoardPainter {
    private int[][] board;
    private int size;

    public void paintChessBoard(int n) {
        size = n;
        board = new int[size][size];

        if (solveChessBoard(0, 0)) {
            printBoard();
        } else {
            System.out.println("No es posible pintar el tablero de forma equilibrada siguiendo las pautas.");
        }
    }

    private boolean solveChessBoard(int row, int col) {
        if (row == size) {
            return true; // Todas las celdas han sido pintadas
        }

        // Alternar el color de las celdas en cada fila
        int color = (row % 2 == 0) ? 1 : 2;

        // Pintar la celda con el color correspondiente
        board[row][col] = color;

        int nextRow = row;
        int nextCol = col + 1;
        if (nextCol == size) {
            nextRow++;
            nextCol = 0;
        }

        return solveChessBoard(nextRow, nextCol);
    }

    private void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((board[i][j] == 1) ? "R " : "B ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ChessBoardPainter painter = new ChessBoardPainter();
        painter.paintChessBoard(8);
    }
}