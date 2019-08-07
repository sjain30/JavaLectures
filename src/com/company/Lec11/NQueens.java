package com.company.Lec11;

public class NQueens {
    public static void main(String[] args) {
        int n=4;
        boolean board[][] = new boolean[n][n];
        nqueens(board,0);
    }

    public static void nqueens(boolean board[][], int row)
    {
        if (row==board.length){
            display(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board,row,col)){
                board[row][col]=true;
                nqueens(board,row+1);
                board[row][col]=false;
            }
        }
    }

    public static void display(boolean board[][])
    {
        for (int i = 0; i <board.length; i++) {
            for (int j = 0; j <board[i].length; j++) {
                if (board[i][j]) {
                    System.out.print("Q");
                }
                else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isSafe(boolean board[][], int row, int col)
    {
        for (int i = 0; i <row; i++) {
            if (board[i][col]){
                return false;
            }
        }
//        for (int i = 1; i <=Math.min(row,col); i++) { //Sir's Logic
//            if (board[row-i][col-i]){
//                return false;
//            }
//        }
//        for(int i = 1; i <=Math.min(row,board.length-col-1); i++) {
//        if (board[row-i][col+i]){
//            return false;
//            }
//        }
        int i=1;
        while (row-i >=0 && col-i>=0){
            if (board[row-i][col-i]){
                return false;
            }
            i++;
        }
        i=1;
        while (row-i>=0 && col+i<board.length){
            if (board[row-i][col+i]){
                return false;
            }
            i++;
        }

        return true;
    }
}
