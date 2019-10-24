/*
In this assessment, there are two problems to solve in 90 minutes
In the first problem, there are three inputs:
1. the repository (like a dictionary you will search in)
2. the number of words available in the repository
3. the user input word.

You will find out the first three words in the repository that matches the user current input.
Begin this process when the number of characters is >= 2.
for example, if the user's input is hello
when user types "he", return three words in the repository starting from "he"
when user types "hel", return three words in the repository starting from "hel"
when user types "hell", return three words in the repository starting from "hell"
when user types "hello", return three words in the repository starting from "hello"
if there are less than three words matching the user's input, return the maximum.
the returned result should be arranged in alphabetical order.
10/23/2019
 */

package mygroup;

public class AmazonOnlineAssessment1 {

    /*
    1. check the edge cases
    2. sort the repository, so the final result will be in the right order
    3. loop from the second input character, get sub String
    for(int i=1;i<input.length;i++){
        String sub = input.subString(0,i);
    }
    4. search sub in repository, and store the right word in the list
    5. add a counter, so we only store the first three matching word in the repository
    6. add the list in the final list
    7. keep doing the above process until the last character of the user's input.
     */
}
