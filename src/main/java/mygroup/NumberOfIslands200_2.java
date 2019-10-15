//https://leetcode.com/problems/number-of-islands/
package mygroup;

public class NumberOfIslands200_2 {

    public static void main(String[] args) {

        int[][] map1 =
               {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};

        int[][] map2 = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0}};

        int[][] map3 = {{0,1,0,0},
                        {1,1,0,1},
                        {0,0,1,0}};

        int[][] map4 = {{1,1,0,0,0},
                        {1,1,0,0,0},
                        {0,0,1,0,0},
                        {0,0,0,1,1}};

        System.out.println(islandCounter(map1));
        System.out.println(islandCounter(map2));
        System.out.println(islandCounter(map3));
        System.out.println(islandCounter(map4));

    }

    public static int islandCounter(int[][] map) {
        int m=map.length;
        int n=map[0].length;
        int count=0;


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(map[i][j]==1) {
                    count++;
                    mark(map,i,j);
                }
            }
        }
        return count;
    }

    public static void mark(int[][] map,int i,int j){
        if(map[i][j]==0) return;

        map[i][j]=0;
        if(i>0) mark(map,i-1,j);
        if(j>0) mark(map,i,j-1);
        if(i<map.length-1) mark(map,i+1,j);
        if(j<map[0].length-1) mark(map,i,j+1);
    }
}
