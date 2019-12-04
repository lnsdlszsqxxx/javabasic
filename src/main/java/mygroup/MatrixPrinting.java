package mygroup;

public class MatrixPrinting {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix1 = {{1,2,3,11},{4,5,6,11},{7,8,9,11}};
        int[][] matrix2 = {{1,11,2},{4,111,22},{7,8,33},{9,99,999}};
        int[][] matrix4 = {{1},{2},{3},{4}};
        printMatrix(matrix2);
    }

    public static void printMatrix(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int rowLimit = row%2==0?row/2:(row/2+1);
        int colLimit = col%2==0?col/2:(col/2+1);

        System.out.println(rowLimit+" "+colLimit);

        for (int i=0;i<rowLimit&&i<colLimit;i++){
            myPrint(matrix,i,i);
        }
    }

    public static void myPrint(int[][] matrix,int i,int j){
        int row = matrix.length;
        int col = matrix[0].length;
        for(int k=j;k<col-j;k++) System.out.print(matrix[i][k]+" ");
        for(int k=i+1;k<row-i;k++) System.out.print(matrix[k][col-j-1]+" ");
        if(row-i-1!=i) for(int k=col-j-2;k>=j;k--) System.out.print(matrix[row-i-1][k]+" ");
        if(col-j-1!=j) for(int k=row-i-2;k>i;k--) System.out.print(matrix[k][j]+" ");
    }


}
