package mygroup;

public class HourGlass2DArrays {
    public static void main(String[] args) {
        int[][] matrix = {  {1, 1, 1, 0, 0, 0},
                            {0, 1, 0, 0, 0, 0},
                            {1, 1, 1, 0, 0, 0},
                            {0, 0, 2, 4, 4, 0},
                            {0, 0, 0, 2, 0, 0},
                            {0, 0, 1, 2, 4, 0}};

        int[][] matrix2 ={  {-1, -1,  0, -9, -2, -2},
                            {-2, -1, -6, -8, -2, -5},
                            {-1, -1, -1, -2, -3, -4},
                            {-1, -9, -2, -4, -4, -5},
                            {-7, -3, -3, -2, -9, -9},
                            {-1, -3, -1, -2, -4, -5}};

        System.out.println(hourGlass(matrix2));
    }

    public static int hourGlass(int[][] input){
        int row=input.length;
        int column=input[0].length;
        int sum;
        int maxSum=-100;
        for (int i=0;i<row-2;i++){
            for(int j=0;j<column-2;j++){
                sum=0;
                    for(int m=0;m<3;m++){
                        for(int n=0;n<3;n++){
                            sum=sum+input[i+m][j+n];
                        }
                    }
                sum=sum-input[i+1][j]-input[i+1][j+2];
                maxSum=Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
}
