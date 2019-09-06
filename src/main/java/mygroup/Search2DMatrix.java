//https://leetcode.com/problems/search-a-2d-matrix/
package mygroup;

public class Search2DMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};

        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.println( search(matrix,matrix[i][j]) );
            }
        }
        System.out.println( search(matrix,0) );

    }

    public static boolean search(int[][] matrix, int target){


        int nRow = matrix.length;
        int nCol = matrix[0].length;
//        System.out.println(nRow+" "+nCol);


        if(target>matrix[nRow-1][nCol-1]) return false;
        if(target<matrix[0][0]) return false;


        int targetRow=nRow-1;

        for (int i=0;i<nRow-1;i++){
            if(target>=matrix[i][0] && target<matrix[i+1][0]) {targetRow=i;break;}
        }

        for (int i=0;i<nCol;i++){
           if(target == matrix[targetRow][i]) return true;
        }
        return false;
    }
}
