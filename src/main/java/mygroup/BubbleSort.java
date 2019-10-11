package mygroup;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 2,1};
        int[] temp = arr.clone();
        bubbleSort2(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));

    }

    public static void bubbleSort2(int[] arr){
        int n=arr.length;
        boolean flag=true;

        while(flag) {
            flag=false;
            for (int i = 0; i < n-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
        }

    }

    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
