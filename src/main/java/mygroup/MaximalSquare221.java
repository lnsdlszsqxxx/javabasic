package mygroup;

public class MaximalSquare221 {
    public static void main(String[] args) {
        int[][] matrix1={
                {1, 0, 1, 0, 0},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0}
        };
        int[][] matrix2={
                {1, 0, 1, 0, 0},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0}
        };

        System.out.println(maximalSquare3(matrix1));
        System.out.println(maximalSquare3(matrix2));

    }

    public static int maximalSquare(int[][] matrix) {
        int result=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int maxSquare=Math.min(m,n);
        for(int k=1;k<=maxSquare;k++){
            for(int i=0;i<m-k+1;i++){
                for(int j=0;j<n-k+1;j++){
                    if(isSquare(matrix,i,j,k)) {result=k*k;i=m;j=n;}
                }
            }
        }

        return result;
    }

    public static boolean isSquare(int[][] matrix,int i,int j,int k){
        for(int ii=i;ii<i+k;ii++){
            for(int jj=j;jj<j+k;jj++){
                if(matrix[ii][jj]!=1) return false;
            }
        }

        return true;
    }

    public static int maximalSquare2(int[][] a) {
        if (a == null || a.length == 0 || a[0].length == 0)
            return 0;

        int max = 0, n = a.length, m = a[0].length;

        // dp(i, j) represents the length of the square
        // whose lower-right corner is located at (i, j)
        // dp(i, j) = min{ dp(i-1, j-1), dp(i-1, j), dp(i, j-1) }
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a[i - 1][j - 1] == 1) {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }

        // return the area
        return max * max;
    }

    public static int maximalSquare3(int[][] matrix){
        int[][] count=matrix;
        int result=0;
        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0) count[i][j]=0;
                else {
                    count[i][j]=Math.min(Math.min(count[i-1][j-1],count[i-1][j]),count[i][j-1])+1;
                }
                result=Math.max(result,count[i][j]);
            }
        }

        return result*result;
    }
}
