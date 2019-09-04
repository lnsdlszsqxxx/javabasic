package mygroup;

import java.sql.SQLSyntaxErrorException;
import java.util.Arrays;

public class FindDuplicateValue {

    public static void main(String[] args) {
        int[] test = {1,2,3,4,5,6,7,7,8,9,9};
        int[] temp = new int[test.length];


        //method 1
        for(int i=0;i<test.length;i++){
            for(int j=i+1;j<test.length;j++){
                if(test[i]==test[j]) {System.out.println(test[j]); break;}
            }
        }

        //method 2
        for (int i=0;i<test.length;i++){
            temp[test[i]]=temp[test[i]]+1;
        }
        System.out.println(Arrays.toString(temp));
        for (int i=0;i<temp.length;i++){
            if(temp[i]>1) System.out.println(i);
        }

    }
}
