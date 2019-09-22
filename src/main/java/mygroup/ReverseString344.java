package mygroup;

import java.util.Arrays;

public class ReverseString344 {
    public static void main(String[] args) {
        char[] input1 = {'h','e','l','l','o'};
        char[] input2 = {'H','a','x','n','a','h'};
        System.out.println(9/2);
        System.out.println(4/2);

        reverse(input2);
        System.out.println(Arrays.toString(input2));
    }

    public static void reverse(char[] input) {
        char temp = 'a';
        for (int i = 0; i < input.length / 2; i++) {
            temp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }
    }
}

