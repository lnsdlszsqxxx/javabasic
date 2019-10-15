package mygroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix54 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] matrix2={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };


//        System.out.println(spiralOrder(matrix));
        System.out.println(spiralOrder(matrix2));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0) return new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();

        print(matrix,result,0,n-1,0,m-1);

        return result;
    }

    public static void print(int[][] matrix, List<Integer> result, int left, int right, int top, int bottom){

        if(left>right||top>bottom) return;

        for(int j=left;j<=right;j++){
            result.add(matrix[top][j]);
        }

        for(int i=top+1;i<=bottom;i++){
            result.add(matrix[i][right]);
        }

        if(top!=bottom) {
            for (int j = right - 1; j >= left; j--) {
                result.add(matrix[bottom][j]);
            }
        }

        if(left!=right) {
            for (int i = bottom - 1; i >= top + 1; i--) {
                result.add(matrix[i][left]);
            }
        }

        print(matrix,result,left+1,right-1,top+1,bottom-1);
    }

}
