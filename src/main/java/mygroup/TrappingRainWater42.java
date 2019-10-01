package mygroup;

public class TrappingRainWater42 {
    public static void main(String[] args) {
        int[] input = {0,1,0,2,1,0,1,3,2,1,2,1};
//        System.out.println(computeRain(input,3,7));
        System.out.println(trap(input));
    }

    public static int trap(int[] height) {
        int rain=0;
        int left;
        int right;

        for(int i=0;i<height.length;i++){
            left=leftBoundary(height,i);
            right=rightBoundary(height,left);
            rain=rain+computeRain(height,left,right);
            i=right-1;
        }
        return rain;
    }

    public static int leftBoundary(int[] height, int start){
        int iLeft=start;
        for(int i=start;i<height.length-2;i++){
            if(height[i]>height[i+1]) {iLeft=i; break;}
        }
        return iLeft;
    }

    public static int rightBoundary(int[] height, int iLeft){
        int iRight=iLeft+1;

        for(int i=iLeft+2;i<height.length;i++){
            if(height[i]>height[i-1]){
                iRight=i;
                continue;
            }
            else if(height[i]<height[i-1]){
                if(iRight==iLeft+1) continue;
                else break;
            }
            else if(height[i]==height[i-1]){
                continue;
            }
        }

        return iRight;
    }

    public static int computeRain(int[] height, int left, int right){
        if(right-left<2) return 0;

        int rain=0;
        int block=0;
        int temp=0;
        int min=Math.min(height[left],height[right]);

        for (int i=left+1;i<right;i++){
            temp = Math.min(min,height[i]);
            block = block + temp;
        }

        rain = (right-left-1)*min - block;

        return rain;
    }
}
