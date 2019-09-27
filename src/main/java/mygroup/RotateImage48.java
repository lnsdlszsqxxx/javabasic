package mygroup;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-image/
public class RotateImage48 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

//            transpose(matrix);

//            rotate2(matrix);

        transpose2(matrix);

        for (int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

    }

    public static void transpose2(int[][] matrix){
        int n=matrix.length;

        for (int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                int temp=matrix[n-j-1][n-i-1];
                matrix[n-j-1][n-i-1]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
    }

    public static void rotate2(int[][] matrix) {
        int n=matrix.length;

        for(int i=0;i<n/2;i++){
            for(int j=i;j<n-i-1;j++){

                int x=i;
                int y=j;
                int fly=matrix[i][j];

                for(int k=0;k<3;k++) {
                    int tempy=n-x-1;
                    x=y;
                    y=tempy;
                    int temp=matrix[x][y];
                    matrix[x][y]=fly;
                    fly=temp;

                }

                matrix[i][j]=fly;

            }
        }

    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;


        for(int i=0;i<n;i++) {
            int left=0;
            int right=n-1;
            int temp;
            while (left < right) {
                temp = matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;

                left++;
                right--;
            }
        }


    }

    public static void transpose(int[][] matrix){
        int n=matrix.length;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }


}
