package mygroup;

import java.util.Arrays;

public class BubbleSort_2 {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 2,1};
        int[] temp = arr.clone();
        bubbleSort2(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));

    }

    public static void bubbleSort2(int[] arr) {
        int n = arr.length;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

    }



}
