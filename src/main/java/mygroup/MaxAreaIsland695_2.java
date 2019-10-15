//https://leetcode.com/problems/max-area-of-island/
package mygroup;

public class MaxAreaIsland695_2 {

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
                        {1,1,1,1},
                        {0,1,1,0}};

        int[][] map4 = {{0,0,0,0},
                        {0,1,1,0},
                        {0,0,0,0}};


        System.out.println(max(map1));
        System.out.println(max(map2));
        System.out.println(max(map3));
        System.out.println(max(map4));

    }

    public static int max(int[][] map){
        int m=map.length;
        int n=map[0].length;
        int area=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(map[i][j]==1) area=Math.max(area,countArea(map,i,j));
            }
        }

        return area;
    }

    public static int countArea(int[][] map,int i,int j){
        if(i<0||j<0||i>=map.length||j>=map[0].length) return 0;
        if(map[i][j]==0) return 0;
        map[i][j]=0;

        return 1+countArea(map,i-1,j)+countArea(map,i,j-1)+countArea(map,i+1,j)+countArea(map,i,j+1);
    }
}
