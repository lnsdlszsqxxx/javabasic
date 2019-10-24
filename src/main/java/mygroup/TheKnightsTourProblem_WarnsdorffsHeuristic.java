//N can be up to 50 (at least), and it is still fast
//good job!
//Liang, 10/24/2019

package mygroup;

import java.util.*;

public class TheKnightsTourProblem_WarnsdorffsHeuristic {
    public static final int N=8;

    public static int[][] result = new int[N][N];
    public static boolean flag=false;

    static int[] x={  1, 2, 2, 1, -1, -2, -2, -1 };
    static int[] y={  2, 1,-1,-2, -2, -1,  1,  2 };

    public static void main(String[] args) {
        int[][] map = new int[N][N];

        map[0][0]=1;

        Warnsdorffs(map,0,0);

        //pring final result
        for (int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.printf("%d\t",result[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static void Warnsdorffs(int[][] map, int i, int j){
        if(map[i][j]==N*N){ //(fixed)
            copyMap(result,map);
            flag=true;
            return;
        }

        //find the move order starting from the minimal movement.
        List<Integer> list = findMoveOrder(map,i,j);

//        System.out.println(i+" "+j);
//        System.out.println(list);

        for(int k=0;k<8;k++) {

            if(list.get(k)<0) continue; //there is no valid movement for this point

            int ii=i+x[list.get(k)];
            int jj=j+y[list.get(k)];

            if( ii<N&&jj<N&&ii>=0&&jj>=0 && map[ii][jj]==0) {
                map[ii][jj] = map[i][j] + 1;
                Warnsdorffs(map, ii, jj);
                if (flag) return;
                map[ii][jj] = 0;
            }
        }

        return;
    }

    public static List<Integer> findMoveOrder(int[][] map, int i, int j){
        List<Integer> list = new ArrayList<>(); //list stores the index
        Map<Integer,Integer> hashMap = new HashMap<>();

        for(int k=0;k<8;k++){
            int ii=i+x[k];
            int jj=j+y[k];
            hashMap.put(k,getMovementNumber(map,ii,jj)); //store the number of movement in a map for each point
        }

        //save the order in the list based the movement number.
        list.add(0,0); //save the first element into the list. (fixed)
        for(int k=1;k<8;k++){
            if( hashMap.get(k)<=hashMap.get(list.get(0)) ) list.add(0,k);
            else if( hashMap.get(k)>=hashMap.get(list.get(list.size()-1)) ) list.add(k);
            else {
                for(int l=1;l<list.size();l++){
                    if(hashMap.get(k)>=hashMap.get(list.get(l-1)) && hashMap.get(k)<=hashMap.get(list.get(l))) {list.add(l,k);break;} //once we insert the point into the list, break (fixed)
                }
            }
        }

        //mark the index stored in list as minus if the movement for this index is zero (fixed)
        for (int k=0;k<list.size();k++){
            if(hashMap.get(list.get(k))==0) list.set(k,-list.get(k));
        }

        return list;
    }

    public static int getMovementNumber(int[][] map, int i, int j){
        int counter=0;

        if( i>=N||j>=N||i<0||j<0 || map[i][j]!=0) return counter; //if current point is not valid, return 0 (fixed)

        for(int k=0;k<8;k++){
            int ii=i+x[k];
            int jj=j+y[k];
            if( ii<N&&jj<N&&ii>=0&&jj>=0 && map[ii][jj]==0) counter++;
        }
        return  counter;
    }

    public static void copyMap(int[][] matrix1, int[][] matrix2){
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                matrix1[i][j]=matrix2[i][j];
            }
        }
        return;
    }
}
