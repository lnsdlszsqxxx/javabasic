/*
In this assessment, there are two problems to solve in 90 minutes
In the second problem:
1. there are three inputs: rows, columns, List<List<Integer>> grid
2. the input is a 2D map, but stored in a nested List
3. each point in the map represents a server of Amazon
4. the value at each point can either be 1 or 0, 1 means the server has a file, 0 means the server is empty (does not have a file)
5. if a serve has a file (=1), it will send the file to a nearby server (turn a 0 value into 1), nearby means up, below, left and right
6. the time interval for sending a file to another server is 1 hour.
7. how many hours it takes util all servers have file. (all points are 1 in the map)

10/23/2019
 */

package mygroup;

public class AmazonOnlineAssessment2 {

    /*
    1. check the edge cases whether the input is valid.
    2. convert the nested List into a 2D array int[][] map.
        map[i][j]=list.get(i).get(j);
    3. check if the map is full or empty, if yes return 0
    4. while(!isFull(map)){ loop } (ps: write another method isFull() to check whether a map is full)
    5. in the while loop body, loop each grid
    for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
            if(map[i][j]==1) mark(map,i,j); //mark() method will mark all four points around (i,j) to 1
        }
    }
    6. I create another map, named mapOld, to store the values so the newly marked servers will not impact the current round searching.
    7. after all points are looped once, counter++;
    8. save current map as the mapOld
    9. go back to the while loop check whether map is full, if not, repeat the process, if yes, stop looping.
    10. return counter at the end;
     */

}
