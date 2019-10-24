package mygroup;

public class TheKnightsTourProblem {
    public static final int N=8;

    public static int[][] result = new int[N][N];
    public static boolean flag=false;

    static int[] x={  2, 1, -1, -2, -2, -1,  1,  2 };
    static int[] y={  1, 2,  2,  1, -1, -2, -2, -1 };

    public static void main(String[] args) {
        int[][] map = new int[N][N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                map[i][j]=-1;
            }
        }

        map[0][0]=0;

        backtrack(map,0,0);

        for (int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(result[i][j]);
                System.out.print(", ");
            }
            System.out.println("");
        }
    }

    public static void backtrack(int[][] map, int i, int j){
        if(map[i][j]==N*N-1){
            copyMap(result,map);
            flag=true;
            return;
        }

        for (int k=0;k<8;k++){
            int ii=i+x[k];
            int jj=j+y[k];
            if( ii>=0&&jj>=0&&ii<N&&jj<N && map[ii][jj] == -1) {
                    map[ii][jj] = map[i][j] + 1;
                    backtrack(map, ii, jj);
                    if(flag) break;
                    map[ii][jj] = -1;
            }
        }

        return;

    }

    public static void copyMap(int[][] result, int [][] map){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                result[i][j]=map[i][j];
            }
        }
    }
}
