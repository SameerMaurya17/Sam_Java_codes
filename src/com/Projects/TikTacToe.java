package com.Projects;

import java.util.Scanner;

public class TikTacToe {

    public static void main(String[] args) {

        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }

        char player = 'X';
        boolean GameOver = false;
        Scanner sc = new Scanner(System.in);

        while(!GameOver){
            printBoard(board);
            System.out.print("Make your Move " + player + " : ");
            int r = sc.nextInt();
            int c = sc.nextInt();

            if(board[r][c] == ' '){
                board[r][c] = player;
                GameOver = haveWon(board,player);

                if(GameOver){
                    System.out.println(player + " Won the game!!");
                }else{
                    if(player == 'X'){
                        player = 'O';
                    }else {
                        player = 'X';
                    }
                }

            }else{
                System.out.println("Invalid move !");
            }
        }

    }

    private static boolean haveWon(char[][] board, char player) {

        // check the rows
        for (int i = 0; i < board.length; i++) {
            if(board[i][0] == player && board[i][1] == player && board[i][2] == player){
                return true;
            }
        }

        // check for col
        for (int i = 0; i < board[0].length; i++) {
            if(board[0][i] == player && board[1][i] == player && board[2][i] == player){
                return true;
            }
        }

        // diagonal
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }

        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }

    private static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" | " + board[i][j]);
            }
            System.out.println(" |");
        }
    }

}
