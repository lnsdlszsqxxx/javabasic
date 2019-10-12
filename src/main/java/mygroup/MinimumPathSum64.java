package mygroup;

import java.util.Arrays;

public class MinimumPathSum64 {
    public static void main(String[] args) {
        int[][] grid = {
                {1,3,1},
                {1,5,1},
                {4,2,1},
        };
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] minPathForEachGrid = new int[m][n];


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0&&j==0) minPathForEachGrid[i][j]=grid[i][j];
                else if(i==0&&j!=0) minPathForEachGrid[i][j]=minPathForEachGrid[i][j-1] +grid[i][j];
                else if(i!=0&&j==0) minPathForEachGrid[i][j]=minPathForEachGrid[i-1][j] +grid[i][j];
                else minPathForEachGrid[i][j]=Math.min(minPathForEachGrid[i-1][j],minPathForEachGrid[i][j-1])+grid[i][j];
            }
        }

        for(int i=0;i<m;i++){
            System.out.println(Arrays.toString(minPathForEachGrid[i]));
        }


        return minPathForEachGrid[m-1][n-1];
    }
}
