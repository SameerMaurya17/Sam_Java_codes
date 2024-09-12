package com.sam;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of 1st matrix row: ");
        int m = sc.nextInt();
        System.out.print("Enter the length of 1st matrix column: ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.print("Enter the matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the length of 2nd matrix row: ");
        int m1 = sc.nextInt();
        System.out.print("Enter the length of 2nd matrix column: ");
        int n1 = sc.nextInt();
        int[][] matrix1 = new int[m1][n1];
//        int[][] matrix1 = new int[m][n];
        System.out.println("Enter the 2nd matrix: ");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

//        findRotation(matrix,matrix1);
        System.out.println(findRotation(matrix,matrix1));

//        int[][] mat1 = {{0,1},{1,0}};
//        int[][] mat2 = {{1,0},{0,1}};
//        int[][] rotatedMatrix = new int[mat2.length][mat2.length];
//
//        for (int i = 0; i < mat1.length; i++) {
//            System.out.println(Arrays.toString(mat1[i]));
//        }
//        System.out.println();
//        for (int i = 0; i < mat1.length; i++) {
//            System.out.println(Arrays.toString(mat2[i]));
//        }
//        for(int i=0;i<mat1.length;i++){
//            int count = mat1.length-1;
//            for(int j=0;j<mat1.length;j++){
//                rotatedMatrix[i][j] = mat1[count][i];
////                System.out.println("the value of rotatedMatrix["+i+"]["+j+"]: "+ rotatedMatrix[i][j]);
//                System.out.println("the value of mat1["+count+"]["+i+"]: "+ mat1[count][i]);
//            }
//        }
//        for (int i = 0; i < mat1.length; i++) {
//            System.out.println(Arrays.toString(rotatedMatrix[i])+" ");
//        }
    }

    static boolean findRotation(int[][] mat, int[][] target) {
        int[][] rotatedMatrix = new int[mat.length][mat.length];
        boolean[] check = new boolean[4];
        Arrays.fill(check, true);

//        for (int i = 0; i < mat.length; i++) {
//            System.out.println(Arrays.toString(mat[i])+" ");
//        }
        for(int n = 0; n < 4; n++){
            for(int i=0;i<mat.length;i++){
                int count = mat.length-1;
                for(int j=0;j<mat[i].length;j++){
                    rotatedMatrix[i][j] = mat[count][i];
                    count--;
                }
//                System.out.println(Arrays.toString(rotatedMatrix[i])+" ");
            }
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[i].length;j++){
                    mat[i][j] = rotatedMatrix[i][j];
                    if(rotatedMatrix[i][j] != target[i][j]){
                        check[n] = false;
                    }
                }
//                System.out.println(Arrays.toString(mat[i])+" ");
            }
//            System.out.println("\n__________________________");
            if(check[n] != false){
                return true;
            }
        }


        return false;
    }

}