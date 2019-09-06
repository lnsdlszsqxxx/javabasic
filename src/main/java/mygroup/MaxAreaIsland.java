//https://leetcode.com/problems/max-area-of-island/
package mygroup;

public class MaxAreaIsland {

    public static void main(String[] args) {

        int[][] map =
               {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};

//        int[][] map = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
//                       {0,0,0,0,0,0,0,1,1,1,0,0,0},
//                       {0,0,0,0,0,0,0,1,1,1,0,0,0}};

//        int[][] map = {{0,1,0,0},
//                       {1,1,1,1},
//                       {0,1,1,0}};


        System.out.println(max(map));

    }

    public static int max(int[][] map){

        boolean[][] isMapCounted = new boolean[map.length][map[0].length]; //whether a spot is counted.

        int area=0;
        int areaMax=0;
        for (int i=0;i<map.length;i++){
            for (int j=0;j<map[0].length;j++){
                if(map[i][j]==1) area+=1;
                isMapCounted[i][j]=false; //initialization
            }
        }
        if(area==0) return 0;
        area=0;

        for (int i=0;i<map.length;i++){
            for (int j=0;j<map[0].length;j++){
                if(map[i][j]==0) continue;
                area=areaCounter(map,isMapCounted,i,j);
                areaMax=area>areaMax?area:areaMax;
            }
        }
        return areaMax;
    }

    public static int areaCounter(int[][] map, boolean[][] isMapCounted, int i, int j){
        int area=1;
        isMapCounted[i][j]=true;

        if (i!=0 && !isMapCounted[i - 1][j] && map[i - 1][j] > 0) area = area + areaCounter(map, isMapCounted,i - 1, j);
        if (j!=0 && !isMapCounted[i][j-1] && map[i][j - 1] > 0) area = area + areaCounter(map,isMapCounted, i, j - 1);
        if (i!=map.length-1 && !isMapCounted[i+1][j] && map[i + 1][j] > 0) area = area + areaCounter(map, isMapCounted,i + 1, j);
        if (j!=map[0].length-1 && !isMapCounted[i][j+1] && map[i][j + 1] > 0) area = area + areaCounter(map, isMapCounted,i, j + 1);

        return area;
    }
}
