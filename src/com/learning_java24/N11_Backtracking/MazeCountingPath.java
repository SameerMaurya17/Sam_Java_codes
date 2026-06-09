package com.learning_java24.N11_Backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MazeCountingPath {

    public static void main(String[] args) {

//        System.out.println(count(3,3));
//        System.out.println(pathRet("",3,3));
//        System.out.println(pathRetDiagonal("",3,3));

        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };

        int[][] path = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };

//        pathRestrictions("", board, 0 ,0);
//        allPath("", board, 0 ,0);
        allPathPrint("", board, 0 ,0, path, 1);

//        path("",3,3);

    }
    public static void allPathPrint(String p,boolean[][] maze, int r, int c, int[][] path, int steps){

        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = steps;
            for(int[] n : path){
                System.out.println(Arrays.toString(n));
            }
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = steps;

        if(r > 0){
            allPathPrint(p + 'U', maze, r - 1, c, path, steps + 1);
        }
        if(r < maze.length - 1){
            allPathPrint(p + 'D', maze, r + 1, c, path, steps + 1);
        }
        if(c < maze[0].length - 1){
            allPathPrint(p + 'R', maze, r , c + 1, path, steps + 1);
        }
        if(c > 0){
            allPathPrint(p + 'L', maze, r , c - 1, path, steps + 1);
        }

        // This is the line when function will be over
        // So before it gets removed, also remove the changes made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }

    // Backtracking
    public static void allPath(String p,boolean[][] maze, int r, int c ){

        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;

        if(r > 0){
            allPath(p + 'U', maze, r - 1, c);
        }
        if(r < maze.length - 1){
            allPath(p + 'D', maze, r + 1, c);
        }
        if(c < maze[0].length - 1){
            allPath(p + 'R', maze, r , c + 1);
        }
        if(c > 0){
            allPath(p + 'L', maze, r , c - 1);
        }

        // This is the line when function will be over
        // So before it gets removed, also remove the changes made by that function
        maze[r][c] = true;
    }

    public static void pathRestrictions(String p,boolean[][] maze, int r, int c ){

         if(r == maze.length - 1 && c == maze[0].length - 1){
             System.out.println(p);
             return;
         }

         if(!maze[r][c]){
             return;
         }

        if(r < maze.length - 1){
             pathRestrictions(p + 'D', maze, r + 1, c);
         }
         if(c < maze[0].length - 1){
             pathRestrictions(p + 'R', maze, r , c + 1);
         }

    }

    public static ArrayList<String> pathRetDiagonal(String p, int r , int c){

        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();


        if(r > 1 && c > 1){
            list.addAll(pathRetDiagonal(p+'D',r - 1, c - 1));
        }
        if(r > 1){
            list.addAll(pathRetDiagonal(p+'V',r - 1, c));
        }
        if(c > 1){
            list.addAll(pathRetDiagonal(p+'H',r, c - 1));
        }

        return list;

    }

    public static ArrayList<String> pathRet(String p, int r , int c){

        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(pathRet(p+'D',r - 1, c));
        }
        if(c > 1){
            list.addAll(pathRet(p+'R',r, c - 1));
        }

        return list;

    }

    public static void path(String p, int r , int c){

        if(r == 1 && c == 1){
            System.out.println(p);
        }

        if(r > 1){
            path(p+'D',r - 1, c);
        }
        if(c > 1){
            path(p+'R',r, c - 1);
        }

    }

    public static int count(int r, int c) {

        if(r == 1 || c == 1){
            return 1;
        }

        int down = count(r-1,c);
        int left = count(r,c-1);

        return down + left;

    }

}
