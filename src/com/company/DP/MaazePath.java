package com.company.DP;

public class MaazePath {
    public static void main(String[] args) {
        System.out.println(maaze("",3,3));
        System.out.println(maazecount(3,3));
        int mem[][] = new int[3+1][3+1];
        System.out.println(maazeDp(3,3,mem));
        System.out.println(mazeiter(3,3));
    }

    public static int maaze(String processed, int row, int col){
        if (row==1 && col==1){
            System.out.println(processed);
            return 1;
        }
        int count=0;
        if (row>1){
            count+=maaze(processed+'V',row-1,col);
        }
        if (col>1){
            count+=maaze(processed+'H',row,col-1);
        }
        return count;
    }

    public static int maazecount(int row, int col)
    {
        if (row==1 || col==1){
            return 1;
        }
        return maazecount(row-1,col)+maazecount(row,col-1);
    }

    public static int maazeDp(int row, int col, int mem[][])
    {
        if (row==1 || col==1){
            return 1;
        }
        if (mem[row][col]!=0){
            return mem[row][col];
        }
        mem[row][col]=maazeDp(row-1,col,mem)+maazeDp(row,col-1,mem);
        return mem[row][col];
    }

    public static int mazeiter(int row, int col) {
        int mem[][] = new int[row + 1][col + 1];
        for (int i = 1; i < mem.length; i++) {
            for (int j = 1; j < mem[i].length; j++) {
                if (i==1 || j==1){
                    mem[i][j]=1;
                }
                else {
                    mem[i][j] = mem[i - 1][j] + mem[i][j - 1];
                }
            }
        }

        for (int i = 0; i < mem.length; i++) {
            for (int j = 0; j < mem[i].length; j++) {
                System.out.print(mem[i][j] + " ");
            }
            System.out.println();
        }
        return mem[row][col];
    }
}
