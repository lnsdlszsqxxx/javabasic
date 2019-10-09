package mygroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals56 {
    public static void main(String[] args) {
        int[][] intervals = {{15,18},{1,3},{2,6},{8,10}};
        int[][] output;
        output=merge(intervals);
        for(int i=0;i<output.length;i++) {
            System.out.println(Arrays.toString(output[i]));
        }
    }

    public static int[][] merge(int[][] intervals) {
        List<int[]> output = new ArrayList<>();
        int[] temp;

        sortIntervals(intervals);

        for(int i=0;i<intervals.length;i++){
            if(intervals[i]==null) continue;

            temp=intervals[i];
            for(int j=i+1;j<intervals.length;j++){
                if(temp[1]>=intervals[j][0]) {
                    temp[1]=intervals[j][1];
                    intervals[j]=null;
                }
                else continue;
            }

            int[] temp2 = new int[2];
            temp2[0]=temp[0];
            temp2[1]=temp[1];
            output.add(temp);
//            output.add(temp2);

        }

        int[][] output2=new int[output.size()][2];
        for(int i=0;i<output.size();i++){
            output2[i]=output.get(i);
        }
        return output2;
    }

    public static void sortIntervals(int[][] intervals){
        if(intervals.length<=1) return;

        int[] temp;

        for(int i=0;i<intervals.length-1;i++){
            for(int j=0;j<intervals.length-i-1;j++){
                if(intervals[j][0]>intervals[j+1][0]){
                    temp=intervals[j];
                    intervals[j]=intervals[j+1];
                    intervals[j+1]=temp;
                }
            }
        }

    }
}
