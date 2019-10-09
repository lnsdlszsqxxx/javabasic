package mygroup;

public class ContainerWithMostWater11 {
    public static void main(String[] args) {
        int[] input = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(input));

    }

    public static int maxArea(int[] height) {
        int area = 0;
        int tempArea;

        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                tempArea=computeArea(height,i,j);
                if(tempArea>area) area=tempArea;
            }
        }

        return area;
    }

    public static int computeArea(int[] height, int left, int right){
        int h=Math.min(height[left],height[right]);
        return h*(right-left);
    }
}
