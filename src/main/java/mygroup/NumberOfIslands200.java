//https://leetcode.com/problems/number-of-islands/
package mygroup;

import java.util.HashSet;
import java.util.Set;

public class NumberOfIslands200 {

    public static void main(String[] args) {

//        int[][] map =
//               {{0,0,1,0,0,0,0,1,0,0,0,0,0},
//                {0,0,0,0,0,0,0,1,1,1,0,0,0},
//                {0,1,1,0,1,0,0,0,0,0,0,0,0},
//                {0,1,0,0,1,1,0,0,1,0,1,0,0},
//                {0,1,0,0,1,1,0,0,1,1,1,0,0},
//                {0,0,0,0,0,0,0,0,0,0,1,0,0},
//                {0,0,0,0,0,0,0,1,1,1,0,0,0},
//                {0,0,0,0,0,0,0,1,1,0,0,0,0}};

//        int[][] map = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
//                       {0,0,0,0,0,0,0,1,1,1,0,0,0},
//                       {0,0,0,0,0,0,0,1,1,1,0,0,0}};
//
//        int[][] map = {{0,1,0,0},
//                       {1,1,0,1},
//                       {0,0,1,0}};

        int[][] map = {{1,1,0,0,0},
                       {1,1,0,0,0},
                       {0,0,1,0,0},
                       {0,0,0,1,1}};

        System.out.println(islandCounter(map));

    }

    public static int islandCounter(int[][] map){
        int islandNum=0;
        boolean[][] islandCounted = new boolean[map.length][map[0].length];
        int row = map.length;
        int col = map[0].length;

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                islandCounted[i][j]=false;
            }
        }

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(map[i][j]==0) continue;
                if(islandCounted[i][j]==true) continue;
                islandNum+=1;
                markLand(map,islandCounted, i,j);
            }
        }

        return islandNum;
    }

    public static void markLand(int[][] map, boolean[][] islandCounted, int i, int j){
        islandCounted[i][j]=true;
        if(i!=0 && !islandCounted[i-1][j] && map[i-1][j]==1) markLand(map,islandCounted,i-1,j);
        if(i!=map.length-1 && !islandCounted[i+1][j] && map[i+1][j]==1) markLand(map,islandCounted,i+1,j);
        if(j!=0 && !islandCounted[i][j-1] && map[i][j-1]==1) markLand(map,islandCounted,i,j-1);
        if(j!=map[0].length-1 && !islandCounted[i][j+1] && map[i][j+1]==1) markLand(map,islandCounted,i,j+1);
    }
}
