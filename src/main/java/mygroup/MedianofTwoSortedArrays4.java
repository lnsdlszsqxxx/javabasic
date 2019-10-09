package mygroup;

public class MedianofTwoSortedArrays4 {
    public static void main(String[] args) {
        int[] num1 = {1,5};
        int[] num2 = {3,4};
        System.out.println(findMedianSortedArrays(num1,num2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m=nums1.length;
        int n=nums2.length;
        int mid=((m+n)%2==0)?(m+n+2)/2:(m+n+1)/2;

        int last=0, last2=0;
        int index1=0,index2=0;

        for(int i=0;i<mid;i++){
            last2=last;

            if(index1>=m) last=nums2[index2++];
            else if(index2>=n) last=nums1[index1++];
            else if(nums1[index1]<=nums2[index2]) last=nums1[index1++];
            else last=nums2[index2++];

        }


        return (m+n)%2==0?(last+last2)/2.0:last*1.0;
    }
}
