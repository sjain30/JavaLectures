package com.company.Lec15;

import java.util.Scanner;

public class NKnights {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean board[][] = new boolean[n][n];
        nknights(board,0);
    }

    public static void nknights(boolean board[][], int row)
    {
        if (row==board.length){
            display(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board,row,col)){
                board[row][col]=true;
                nknights(board,row+1);
                board[row][col]=false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col)
    {
        if(row-2>=0 && col-1>=0){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(row-2>=0 && col+1<board.length){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(row+2<board.length && col-1>=0){
            if(board[row+2][col-1]){
                return false;
            }
        }
        if(row+2<board.length && col+1<board.length){
            if(board[row+2][col+1]){
                return false;
            }
        }
        if(row-1>=0 && col-2>=0){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(row-1>=0 && col+2<board.length){
            if(board[row-1][col+2]){
                return false;
            }
        }
        if(row+1<board.length && col-2>=0){
            if(board[row+1][col-2]){
                return false;
            }
        }
        if(row+1<board.length && col+2<board.length){
            if(board[row+1][col+2]){
                return false;
            }
        }
        return true;
    }

    public static void display(boolean board[][])
    {
        for (int i = 0; i <board.length; i++) {
            for (int j = 0; j <board[i].length; j++) {
                if (board[i][j]) {
                    System.out.print("{"+i+"-"+j+"}");
                }
            }
            System.out.print(" ");
        }
    }
}
