package mygroup;

public class LongestIncreasingPathinaMatrix329 {
    public static void main(String[] args) {
        int[][] input1 = {  {9,9,4},
                            {6,6,8},
                            {2,1,1}};
        int[][] input2 = {  {3,4,5},
                            {3,2,6},
                            {2,2,1}};
        int[][] input3 = {  {3,4,5}};

        int[][] input4 = {  {9,0,0},
                            {6,6,0},
                            {2,1,0}};

        System.out.println(longestIncreasingPath(input1));
        System.out.println(longestIncreasingPath(input2));
        System.out.println(longestIncreasingPath(input3));
        System.out.println(longestIncreasingPath(input4));

    }

    public static int longestIncreasingPath(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int max=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                max=Math.max(max,search(matrix,i,j,1));
            }
        }

        return max;
    }

    public static int search(int[][] matrix, int i, int j,int length){
        int m=matrix.length;
        int n=matrix[0].length;
        int l1=0,l2=0,l3=0,l4=0;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;

        if(i<m-1&&matrix[i+1][j]>matrix[i][j]) l1=search(matrix,i+1,j,length+1);
        else flag1=true;
        if(i>0&&matrix[i-1][j]>matrix[i][j]) l2=search(matrix,i-1,j,length+1);
        else flag2=true;
        if(j<n-1&&matrix[i][j+1]>matrix[i][j]) l3=search(matrix,i,j+1,length+1);
        else flag3=true;
        if(j>0&&matrix[i][j-1]>matrix[i][j]) l4=search(matrix,i,j-1,length+1);
        else flag4=true;


        if(flag1&&flag2&&flag3&&flag4) return length;

        return Math.max(Math.max(l1,l2),Math.max(l3,l4));
    }
}
