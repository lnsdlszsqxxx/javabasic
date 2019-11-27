//trim a String, so the substring contains all the letters in the String.
//only need to return the length of the String.

package mygroup;

import java.util.*;

public class StringTrim2 {
    static int findSubString(String s)
    {
        final int MAX_CHARS = 100000;
        int n = s.length();
        // Count all distinct characters.
        int dist_count = 0;
        boolean[] visited = new boolean[MAX_CHARS];
        Arrays.fill(visited, false);
        for (int i=0; i<n; i++)
        {
            if (visited[s.charAt(i)] == false)
            {
                visited[s.charAt(i)] = true;
                dist_count++;
            }
        }
        int start = 0, start_index = -1;
        int min_len = Integer.MAX_VALUE;
        int count = 0;
        int[] curr_count =  new int[MAX_CHARS];
        for (int j=0; j<n; j++)
        {
            // Count occurrence of characters of sing
            curr_count[s.charAt(j)]++;
            // If any distinct character matched,
            // then increment count
            if (curr_count[s.charAt(j)] == 1 )
                count++;
            // if all the characters are matched
            if (count == dist_count)
            {
                // Try to minimize the window i.e., check if
                // any character is occurring more no. of times
                // than its occurrence in pattern, if yes
                // then remove it from starting and also remove
                // the useless characters.
                while (curr_count[s.charAt(start)] > 1)
                {
                    if (curr_count[s.charAt(start)] > 1)
                        curr_count[s.charAt(start)]--;
                    start++;
                }
                // Update window size
                int len_window = j - start + 1;
                if (min_len > len_window)
                {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
        // Return subsing starting from start_index
        // and length min_len
//        return s.subsing(start_index, start_index+min_len).length();
        return min_len;
    }

    public static void main(String[] args) {
        String s = "asdfkjeghfalawefhaef";
        System.out.println("Smallest window containing all distinct"
                + " characters is " + findSubString(s));
    }

}
