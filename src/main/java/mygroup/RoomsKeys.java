//https://leetcode.com/problems/keys-and-rooms/description/
package mygroup;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RoomsKeys {
    public static void main(String[] args) {

        int[][] room1 = {{1,3},{3,0,1},{2},{0}};
        int[][] room2 = {{1},{2},{3},{}};
        System.out.println(canVisitAllRooms(room2));

    }

    public static boolean canVisitAllRooms(int[][] room){

        boolean[] roomTrue = new boolean[room.length];

        for (int i=0;i<roomTrue.length;i++){
            roomTrue[i]=false;
        }
        roomTrue[0]=true;

        Queue<int[]> queue = new LinkedList<int[]>();
        int[] keys = room[0];
        queue.add(keys);

        while (queue.size()>0){
            keys=queue.poll();

            for (int i=0;i<keys.length;i++){
                if(!roomTrue[keys[i]]) {queue.add(room[keys[i]]); roomTrue[keys[i]]=true;}
            }
        }

        for (int i=0;i<roomTrue.length;i++){
            if(!roomTrue[i]) return false;
        }

        return true;
    }
}
