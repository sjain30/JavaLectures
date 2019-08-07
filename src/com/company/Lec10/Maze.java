package com.company.Lec10;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        maze("",3,3);
        maze2("",3,3,arr);
        System.out.println(arr.toString());
        System.out.println(maze3("",3,3));

    }

    public static void maze(String processed, int row, int col)
    {
        if (row==1 && col==1){
            System.out.println(processed);
            return;
        }
        if (row>1){
            maze(processed+'V',row-1,col);
        }
        if (col>1){
            maze(processed+'H',row,col-1);
        }
    }

    public static void maze2(String processed, int row, int col, ArrayList list)
    {
        if (row==1 && col==1){
            list.add(processed);
            return;
        }
        if (row>1){
            maze2(processed+'V',row-1,col,list);
        }
        if (col>1){
            maze2(processed+'H',row,col-1,list);
        }
    }

    public static ArrayList maze3(String processed, int row, int col)
    {
        if (row==1 && col==1){
            ArrayList list = new ArrayList();
            list.add(processed);
            return list;
        }
        ArrayList list1 = new ArrayList();
        if (row>1){
            list1.addAll(maze3(processed+'V',row-1,col));
        }
        if (col>1){
            list1.addAll(maze3(processed+'H',row,col-1));
        }
        return list1;
    }
}
